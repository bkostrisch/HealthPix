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
import modelo.bean.Produtos;


public class ProdutosDAO {
    
    //Insere dados novos para criação de um novo Produto.
    public void cadastrarProd(Produtos h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO produtos(nomeprod,valorprod,receitaprod,qntddprod,validade)VALUES(?,?,?,?,?)");
            stmt.setString(1,h.getNomeprod());
            stmt.setString(2,h.getValorprod());
            stmt.setString(3,h.getReceitaprod());
            stmt.setInt(4,h.getQntddprod());            
            stmt.setString(5,h.getValidade());            
            
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Novo produto cadastrado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao definir produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Deleta os dados de determinado Produto.
    public void deletarProd(Produtos h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM produtos WHERE idprod = ?");
            stmt.setInt(1, h.getIdprod());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Este produto foi excluído com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este produto: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Atualiza os dados de determinado Produto.
    public void atualizarProd(Produtos h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET nomeprod = ? , valorprod = ? , receitaprod = ? , qntddprod = ? , validade = ? WHERE idprod = ?");
            stmt.setString(1,h.getNomeprod());
            stmt.setString(2,h.getValorprod());
            stmt.setString(3,h.getReceitaprod());
            stmt.setInt(4,h.getQntddprod());
            stmt.setString(5,h.getValidade());
            stmt.setInt(6,h.getIdprod());
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Atualizações Concluídas!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ralizar atualizações neste produto"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Diminui a quantidade do estoque em 1
    public void diminuirQntdd(Produtos h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET qntddprod = qntddprod-1 WHERE qntddprod = ?");                       
            stmt.setInt(1,h.getQntddprod());
            
            stmt.executeUpdate();           
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ralizar atualizações neste produto"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Aumenta a quantidade do estoque em 1
    public void aumentarQntdd(Produtos h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE produtos SET qntddprod = qntddprod+1 WHERE nomeprod = ?");                       
            stmt.setString(1,h.getNomeprod());
            
            stmt.executeUpdate();           
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ralizar atualizações neste produto"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Faz a listagem dos valores do BD de produtos na Tabela do programa.
    public List<Produtos> lerProd() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Produtos inf = new Produtos();
                
                inf.setIdprod(rs.getInt("idprod"));    
                inf.setNomeprod(rs.getString("nomeprod"));
                inf.setValorprod(rs.getString("valorprod"));
                inf.setReceitaprod(rs.getString("receitaprod"));                            
                inf.setQntddprod(rs.getInt("qntddprod"));                            
                inf.setValidade(rs.getString("validade"));                            
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    //Faz a listagem dos valores do BD de produtos para pesquisá-los na Tabela do programa.
    public List<Produtos> pesquisaProd(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Produtos> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM produtos WHERE nomeprod LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Produtos inf = new Produtos();
                
                inf.setIdprod(rs.getInt("idprod"));    
                inf.setNomeprod(rs.getString("nomeprod"));
                inf.setValorprod(rs.getString("valorprod"));
                inf.setReceitaprod(rs.getString("receitaprod"));                            
                inf.setQntddprod(rs.getInt("qntddprod"));                
                inf.setValidade(rs.getString("validade"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProdutosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }    
        
    
   
   
}
  

