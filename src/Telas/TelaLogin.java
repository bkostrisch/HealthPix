package Telas;

import javax.swing.JOptionPane;
import modelo.dao.AdmDAO;
import modelo.dao.FuncionarioDAO;


public class TelaLogin extends javax.swing.JFrame {

       
    public TelaLogin() {
        initComponents();
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LogoInicio = new javax.swing.JLabel();
        lbl_Usuario = new javax.swing.JLabel();
        lbl_Senha = new javax.swing.JLabel();
        txt_Login = new javax.swing.JTextField();
        txt_Password = new javax.swing.JPasswordField();
        btn_Entrar = new javax.swing.JButton();
        lbl_Informacoes = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("HealthPix");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        LogoInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/HealthPixLogoRedimensionado.png"))); // NOI18N
        getContentPane().add(LogoInicio);
        LogoInicio.setBounds(20, 20, 280, 240);

        lbl_Usuario.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        lbl_Usuario.setText("Usuário:");
        getContentPane().add(lbl_Usuario);
        lbl_Usuario.setBounds(410, 30, 90, 40);

        lbl_Senha.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        lbl_Senha.setText("Senha:");
        getContentPane().add(lbl_Senha);
        lbl_Senha.setBounds(420, 130, 80, 30);
        getContentPane().add(txt_Login);
        txt_Login.setBounds(390, 80, 130, 30);

        txt_Password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(txt_Password);
        txt_Password.setBounds(390, 170, 130, 30);

        btn_Entrar.setBackground(new java.awt.Color(255, 255, 255));
        btn_Entrar.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btn_Entrar.setText("Entrar");
        btn_Entrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EntrarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Entrar);
        btn_Entrar.setBounds(420, 230, 63, 25);

        lbl_Informacoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ExclamaçãoMenor.png"))); // NOI18N
        lbl_Informacoes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_InformacoesMouseClicked(evt);
            }
        });
        getContentPane().add(lbl_Informacoes);
        lbl_Informacoes.setBounds(560, 10, 50, 60);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 640, 310);

        setSize(new java.awt.Dimension(636, 326));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lbl_InformacoesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_InformacoesMouseClicked
       TelaInformativa a = new TelaInformativa();
       a.setVisible(true);
       
       dispose();
    }//GEN-LAST:event_lbl_InformacoesMouseClicked

    private void btn_EntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EntrarActionPerformed
        
       AdmDAO adao = new AdmDAO();
       FuncionarioDAO fdao = new FuncionarioDAO();
              
       
       if(adao.checagemLogin(txt_Login.getText(), txt_Password.getText())){
           
                VendaProdutos.condicao = true;
                new TelaMenuAdm().setVisible(true);
                this.dispose();
                
                
                
                
       }    else if(fdao.checagemLoginFuncionario(txt_Login.getText(), txt_Password.getText())){
           
                VendaProdutos.condicao = false;
                new VendaProdutos().setVisible(true);
                this.dispose();
                
                
                
                
            }   else{
                    JOptionPane.showMessageDialog(null, "Senha incorreta");
                }
        
    }//GEN-LAST:event_btn_EntrarActionPerformed
   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel LogoInicio;
    private javax.swing.JButton btn_Entrar;
    private javax.swing.JLabel lbl_Informacoes;
    private javax.swing.JLabel lbl_Senha;
    private javax.swing.JLabel lbl_Usuario;
    private javax.swing.JTextField txt_Login;
    private javax.swing.JPasswordField txt_Password;
    // End of variables declaration//GEN-END:variables
}
