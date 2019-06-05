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
import modelo.bean.Vendas;

public class VendasDAO {
    
    //Insere dados novos para criação de um nova Venda.
    public void cadastrarVenda(Vendas h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO vendas(venda, valorvenda)VALUES(?,?)");
            stmt.setString(1,h.getVenda());
            stmt.setDouble(2,h.getValorvenda());                               
            
            
            stmt.executeUpdate();          
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao selecionar produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    
    //Deleta os dados de determinada Venda.
    public void deletarVenda(Vendas h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM vendas WHERE idvendas = ?");
            stmt.setInt(1, h.getIdvendas());
            stmt.executeUpdate();           
           
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }    
    
    
    
    //Faz a listagem dos valores do BD de vendas na Tabela do programa.
    public List<Vendas> lerVenda() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Vendas> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM vendas");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Vendas inf = new Vendas();
                
                inf.setIdvendas(rs.getInt("idvendas"));    
                inf.setVenda(rs.getString("venda"));
                inf.setValorvenda(rs.getDouble("valorvenda"));                                         
                                            
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }   
    
    
}
