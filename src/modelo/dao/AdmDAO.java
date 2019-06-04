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
import modelo.bean.Adm;


public class AdmDAO {
    
   
    //Faz a validação do Login como Administrador.
    public boolean checagemLogin(String user, String password) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginadm WHERE user = ? and password = ?");
            stmt.setString(1, user);
            stmt.setString(2, password);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                 check = true;
                 
                 
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;        
    }
    
    //Insere dados novos para criação de um novo Administrador.
    public void cadastrarAdm(Adm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO loginadm(user,password,nomeadm,rgadm, cpfadm, enderecoadm, celadm, emailadm, datnascadm)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,h.getUser());
            stmt.setString(2,h.getPassword());
            stmt.setString(3,h.getNomeadm());
            stmt.setString(4,h.getRgadm());            
            stmt.setString(5,h.getCpfadm());            
            stmt.setString(6,h.getEnderecoadm());            
            stmt.setString(7,h.getCeladm());            
            stmt.setString(8,h.getEmailadm());            
            stmt.setString(9,h.getDatnascadm());            
                      
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Novo ADM cadastrado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao definir ADM: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Deleta os dados de determinado Administrador.
    public void deletarAdm(Adm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM loginadm WHERE idadm = ?");
            stmt.setInt(1, h.getId());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Este ADM foi excluído com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este ADM: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Atualiza os dados de determinado Administrador.
    public void atualizarAdm(Adm h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginadm SET user = ? , password = ? , nomeadm = ? , rgadm = ? , cpfadm = ? , enderecoadm = ? , celadm = ? , emailadm = ? , datnascadm = ? WHERE idadm = ?");
            stmt.setString(1,h.getUser());
            stmt.setString(2,h.getPassword());
            stmt.setString(3,h.getNomeadm());
            stmt.setString(4,h.getRgadm());          
            stmt.setString(5,h.getCpfadm());          
            stmt.setString(6,h.getEnderecoadm());          
            stmt.setString(7,h.getCeladm());          
            stmt.setString(8,h.getEmailadm());          
            stmt.setString(9,h.getDatnascadm());                   
            stmt.setInt(10,h.getId());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Atualizações Concluídas!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ralizar atualizações neste ADM"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Faz a listagem dos valores do BD de administradores na Tabela do programa.
    public List<Adm> lerAdm() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Adm> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginadm");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Adm inf = new Adm();
                
                inf.setId(rs.getInt("idadm"));    
                inf.setUser(rs.getString("user"));
                inf.setPassword(rs.getString("password"));
                inf.setNomeadm(rs.getString("nomeadm"));
                inf.setRgadm(rs.getString("rgadm"));               
                inf.setCpfadm(rs.getString("cpfadm"));               
                inf.setEnderecoadm(rs.getString("enderecoadm"));               
                inf.setCeladm(rs.getString("celadm"));               
                inf.setEmailadm(rs.getString("emailadm"));               
                inf.setDatnascadm(rs.getString("datnascadm"));               
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    //Faz a listagem para pesquisa dos valores do BD de administradores na Tabela do programa.
    public List<Adm> pesquisaAdm(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Adm> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginadm WHERE nomeadm LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Adm inf = new Adm();
                
                inf.setId(rs.getInt("idadm"));    
                inf.setUser(rs.getString("user"));
                inf.setPassword(rs.getString("password"));
                inf.setNomeadm(rs.getString("nomeadm"));
                inf.setRgadm(rs.getString("rgadm"));               
                inf.setCpfadm(rs.getString("cpfadm"));               
                inf.setEnderecoadm(rs.getString("enderecoadm"));               
                inf.setCeladm(rs.getString("celadm"));               
                inf.setEmailadm(rs.getString("emailadm"));               
                inf.setDatnascadm(rs.getString("datnascadm"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdmDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    
}
