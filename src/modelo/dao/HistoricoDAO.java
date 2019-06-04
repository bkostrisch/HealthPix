package modelo.dao;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.bean.Historico;

public class HistoricoDAO {
    
    //Insere dados novos para criação de um novo Produto no Histórico.
    public void cadastrarHistorico(Historico h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO historico(vendahist, valorhist, vendedorhist)VALUES(?,?,?)");
            stmt.setString(1,h.getVendahist());
            stmt.setString(2,h.getValorhist());
            stmt.setString(3,h.getVendedorhist());                   
            
            
            stmt.executeUpdate();          
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Deleta os dados de determinado Historico.
    public void deletarHistorico(Historico h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM historico WHERE idhistorico = ?");
            stmt.setInt(1, h.getIdhistorico());
            stmt.executeUpdate();           
           
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
     //Faz a listagem dos valores do BD de historico na Tabela do programa.
    public List<Historico> lerHistorico() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Historico> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM historico");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Historico inf = new Historico();
                
                inf.setIdhistorico(rs.getInt("idhistorico"));    
                inf.setVendahist(rs.getString("vendahist"));
                inf.setValorhist(rs.getString("valorhist"));
                inf.setVendedorhist(rs.getString("vendedorhist"));                         
                                            
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }   
    
    //Faz a leitura dos dados do banco de dados para mostrá-los em uma tabela futuramente.
    public List<Historico> pesquisaHist(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Historico> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM historico WHERE vendahist LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Historico inf = new Historico();
                
                inf.setIdhistorico(rs.getInt("idhistorico"));    
                inf.setVendahist(rs.getString("vendahist"));
                inf.setValorhist(rs.getString("valorhist"));
                inf.setVendedorhist(rs.getString("vendedorhist"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    //Faz a leitura dos dados do banco de dados para pesquisá-los numa tabela futuramente.
    public List<Historico> pesquisaHistII(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Historico> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM historico WHERE vendedorhist LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Historico inf = new Historico();
                
                inf.setIdhistorico(rs.getInt("idhistorico"));    
                inf.setVendahist(rs.getString("vendahist"));
                inf.setValorhist(rs.getString("valorhist"));
                inf.setVendedorhist(rs.getString("vendedorhist"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(HistoricoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
}
