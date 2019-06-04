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
import modelo.bean.Funcionario;

public class FuncionarioDAO {

        
    
   //Faz a validação do login como um Funcionário. 
   public boolean checagemLoginFuncionario(String usuario, String senha) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;
        
        
        
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginfuncionario WHERE usuario = ? and senha = ?");
            stmt.setString(1, usuario);
            stmt.setString(2, senha);
            rs = stmt.executeQuery();
            
            if(rs.next()){
                
                 check = true;
                 
                 
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return check;
        
    }
   
   //Insere dados novos para criação de um novo Funcionário.
    public void cadastrarFunc(Funcionario h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("INSERT INTO loginfuncionario(usuario,senha,nomefunc,rgfunc, cpffunc, enderecofunc, celfunc, emailfunc, datnascfunc)VALUES(?,?,?,?,?,?,?,?,?)");
            stmt.setString(1,h.getUsuario());
            stmt.setString(2,h.getSenha());
            stmt.setString(3,h.getNomefunc());
            stmt.setString(4,h.getRgfunc());            
            stmt.setString(5,h.getCpffunc());            
            stmt.setString(6,h.getEnderecofunc());            
            stmt.setString(7,h.getCelfunc());            
            stmt.setString(8,h.getEmailfunc());            
            stmt.setString(9,h.getDatnascfunc());            
                      
            
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Novo Funcionário cadastrado com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao definir funcionário: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Deleta os dados de determinado Funcionário.
    public void deletarFunc(Funcionario h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("DELETE FROM loginfuncionario WHERE idfunc = ?");
            stmt.setInt(1, h.getIdfunc());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Este funcionário foi excluído com sucesso!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir este funcionário: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Atualiza os dados de determinado Funcionário.
    public void atualizarFunc(Funcionario h) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("UPDATE loginfuncionario SET usuario = ? , senha = ? , nomefunc = ? , rgfunc = ? , cpffunc = ? , enderecofunc = ? , celfunc = ? , emailfunc = ? , datnascfunc = ? WHERE idfunc = ?");
            stmt.setString(1,h.getUsuario());
            stmt.setString(2,h.getSenha());
            stmt.setString(3,h.getNomefunc());
            stmt.setString(4,h.getRgfunc());            
            stmt.setString(5,h.getCpffunc());            
            stmt.setString(6,h.getEnderecofunc());            
            stmt.setString(7,h.getCelfunc());            
            stmt.setString(8,h.getEmailfunc());            
            stmt.setString(9,h.getDatnascfunc());                   
            stmt.setInt(10,h.getIdfunc());
            stmt.executeUpdate(); 
            
            JOptionPane.showMessageDialog(null, "Atualizações Concluídas!");
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível ralizar atualizações neste funcionário"+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
        
    }
    
    //Faz a listagem dos valores do BD de funcionários na Tabela do programa.
    public List<Funcionario> lerFunc() {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginfuncionario");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionario inf = new Funcionario();
                
                inf.setIdfunc(rs.getInt("idfunc"));    
                inf.setUsuario(rs.getString("usuario"));
                inf.setSenha(rs.getString("senha"));
                inf.setNomefunc(rs.getString("nomefunc"));
                inf.setRgfunc(rs.getString("rgfunc"));               
                inf.setCpffunc(rs.getString("cpffunc"));               
                inf.setEnderecofunc(rs.getString("enderecofunc"));               
                inf.setCelfunc(rs.getString("celfunc"));               
                inf.setEmailfunc(rs.getString("emailfunc"));               
                inf.setDatnascfunc(rs.getString("datnascfunc"));               
                                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
    
    //Faz a leitura dos dados do banco de dados para pesquisá-los numa tabela futuramente.
    public List<Funcionario> pesquisaFunc(String pesq) {
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        List<Funcionario> infos = new ArrayList<>();
        
        try {
            stmt = con.prepareStatement("SELECT * FROM loginfuncionario WHERE nomefunc LIKE ?");
            stmt.setString(1, "%"+pesq+"%");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Funcionario inf = new Funcionario();
                
                inf.setIdfunc(rs.getInt("idfunc"));    
                inf.setUsuario(rs.getString("usuario"));
                inf.setSenha(rs.getString("senha"));
                inf.setNomefunc(rs.getString("nomefunc"));
                inf.setRgfunc(rs.getString("rgfunc"));               
                inf.setCpffunc(rs.getString("cpffunc"));               
                inf.setEnderecofunc(rs.getString("enderecofunc"));               
                inf.setCelfunc(rs.getString("celfunc"));               
                inf.setEmailfunc(rs.getString("emailfunc"));               
                inf.setDatnascfunc(rs.getString("datnascfunc"));                
                infos.add(inf);
                
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return infos;
    }
}
