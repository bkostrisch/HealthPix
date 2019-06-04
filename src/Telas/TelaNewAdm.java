
package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Adm;
import modelo.dao.AdmDAO;


public class TelaNewAdm extends javax.swing.JFrame {

    
    public TelaNewAdm() {
        initComponents();
        
        //Indentifica a tabela cujo qual será atribuida o método lerTabela(); logo após.
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaAdm.getModel();
        tb_TabelaAdm.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
        
    }

    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaAdm.getModel();
        modelo.setNumRows(0);
        AdmDAO hdao = new AdmDAO();
        
        for(Adm h: hdao.lerAdm()){
            
            modelo.addRow(new Object[]{
                h.getId(),
                h.getNomeadm(),
                h.getRgadm(),
                h.getCpfadm(),
                h.getEnderecoadm(),                                
                h.getCeladm(),                                
                h.getEmailadm(),                                
                h.getDatnascadm(),                               
                h.getUser(),                               
                h.getPassword(),                               
                                              
            });
        }
    }
    
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaAdm.getModel();
        modelo.setNumRows(0);
        AdmDAO hdao = new AdmDAO();
        
        for(Adm h: hdao.pesquisaAdm(pesq)){
            
            modelo.addRow(new Object[]{
                h.getId(),
                h.getNomeadm(),
                h.getRgadm(),
                h.getCpfadm(),
                h.getEnderecoadm(),                                
                h.getCeladm(),                                
                h.getEmailadm(),                                
                h.getDatnascadm(),                               
                h.getUser(),                               
                h.getPassword(),                
            });
        }
    }
  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_NomeUser = new javax.swing.JLabel();
        lbl_RGUser = new javax.swing.JLabel();
        lbl_CPFUser = new javax.swing.JLabel();
        lbl_EnderecoUser = new javax.swing.JLabel();
        lbl_TelUser = new javax.swing.JLabel();
        lbl_EmailUser = new javax.swing.JLabel();
        lbl_DatNascUser = new javax.swing.JLabel();
        lbl_UsuarioUser = new javax.swing.JLabel();
        lbl_SenhaUser = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();
        txt_NomeAdm = new javax.swing.JTextField();
        txt_RgAdm = new javax.swing.JTextField();
        txt_CpfAdm = new javax.swing.JTextField();
        txt_EndAdm = new javax.swing.JTextField();
        txt_CelAdm = new javax.swing.JTextField();
        txt_EmailAdm = new javax.swing.JTextField();
        txt_UsuarioAdm = new javax.swing.JTextField();
        txt_SenhaAdm = new javax.swing.JTextField();
        txt_DatNascAdm = new javax.swing.JTextField();
        lbl_PesquisaUser = new javax.swing.JLabel();
        txt_PesquisarAdm = new javax.swing.JTextField();
        btn_ProcurarAdm = new javax.swing.JButton();
        btn_CadNovoAdm = new javax.swing.JButton();
        btn_AttAdm = new javax.swing.JButton();
        btn_DelAdm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaAdm = new javax.swing.JTable();
        btn_VoltarAdm = new javax.swing.JButton();
        lbl_IDAdm = new javax.swing.JLabel();
        lbl_IDm = new javax.swing.JLabel();
        btn_ApagarADM = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar ADM");
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_NomeUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_NomeUser.setText("Nome:");
        getContentPane().add(lbl_NomeUser);
        lbl_NomeUser.setBounds(50, 170, 50, 22);

        lbl_RGUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_RGUser.setText("RG:");
        getContentPane().add(lbl_RGUser);
        lbl_RGUser.setBounds(50, 220, 34, 22);

        lbl_CPFUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_CPFUser.setText("CPF:");
        getContentPane().add(lbl_CPFUser);
        lbl_CPFUser.setBounds(50, 270, 34, 22);

        lbl_EnderecoUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_EnderecoUser.setText("Endereço:");
        getContentPane().add(lbl_EnderecoUser);
        lbl_EnderecoUser.setBounds(30, 330, 70, 22);

        lbl_TelUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_TelUser.setText("Tel/Celular:");
        getContentPane().add(lbl_TelUser);
        lbl_TelUser.setBounds(20, 380, 80, 22);

        lbl_EmailUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_EmailUser.setText("Email:");
        getContentPane().add(lbl_EmailUser);
        lbl_EmailUser.setBounds(460, 170, 50, 22);

        lbl_DatNascUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_DatNascUser.setText("Data de Nascimento:");
        getContentPane().add(lbl_DatNascUser);
        lbl_DatNascUser.setBounds(360, 220, 150, 20);

        lbl_UsuarioUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_UsuarioUser.setText("Usuário:");
        getContentPane().add(lbl_UsuarioUser);
        lbl_UsuarioUser.setBounds(450, 280, 60, 14);

        lbl_SenhaUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_SenhaUser.setText("Senha:");
        getContentPane().add(lbl_SenhaUser);
        lbl_SenhaUser.setBounds(460, 330, 50, 22);

        Titulo.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 153, 204));
        Titulo.setText("CADASTRO DE NOVO ADM");
        getContentPane().add(Titulo);
        Titulo.setBounds(250, 10, 430, 41);
        getContentPane().add(txt_NomeAdm);
        txt_NomeAdm.setBounds(110, 170, 330, 30);
        getContentPane().add(txt_RgAdm);
        txt_RgAdm.setBounds(110, 220, 130, 30);
        getContentPane().add(txt_CpfAdm);
        txt_CpfAdm.setBounds(110, 270, 160, 30);
        getContentPane().add(txt_EndAdm);
        txt_EndAdm.setBounds(110, 330, 320, 30);
        getContentPane().add(txt_CelAdm);
        txt_CelAdm.setBounds(110, 380, 150, 30);
        getContentPane().add(txt_EmailAdm);
        txt_EmailAdm.setBounds(520, 170, 340, 30);
        getContentPane().add(txt_UsuarioAdm);
        txt_UsuarioAdm.setBounds(520, 270, 170, 30);
        getContentPane().add(txt_SenhaAdm);
        txt_SenhaAdm.setBounds(520, 330, 170, 30);
        getContentPane().add(txt_DatNascAdm);
        txt_DatNascAdm.setBounds(520, 220, 150, 30);

        lbl_PesquisaUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_PesquisaUser.setText("Pesquisar:");
        getContentPane().add(lbl_PesquisaUser);
        lbl_PesquisaUser.setBounds(20, 70, 80, 22);

        txt_PesquisarAdm.setText("Digite o nome do administrador");
        txt_PesquisarAdm.setToolTipText("");
        getContentPane().add(txt_PesquisarAdm);
        txt_PesquisarAdm.setBounds(110, 70, 230, 30);

        btn_ProcurarAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_ProcurarAdm.setText("Procurar");
        btn_ProcurarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcurarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ProcurarAdm);
        btn_ProcurarAdm.setBounds(350, 70, 90, 29);

        btn_CadNovoAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_CadNovoAdm.setText("Cadastrar");
        btn_CadNovoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadNovoAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CadNovoAdm);
        btn_CadNovoAdm.setBounds(540, 400, 100, 30);

        btn_AttAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_AttAdm.setText("Atualizar");
        btn_AttAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AttAdm);
        btn_AttAdm.setBounds(660, 400, 90, 30);

        btn_DelAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_DelAdm.setText("Deletar");
        btn_DelAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DelAdm);
        btn_DelAdm.setBounds(770, 400, 90, 30);

        tb_TabelaAdm.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "CPF", "Endereço", "Tel/Celular", "Email", "Data de Nasc", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_TabelaAdm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaAdmMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaAdm);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 440, 900, 310);

        btn_VoltarAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_VoltarAdm.setText("Voltar");
        btn_VoltarAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarAdm);
        btn_VoltarAdm.setBounds(810, 10, 70, 23);

        lbl_IDAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_IDAdm.setText("ID:");
        getContentPane().add(lbl_IDAdm);
        lbl_IDAdm.setBounds(80, 120, 20, 30);

        lbl_IDm.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        getContentPane().add(lbl_IDm);
        lbl_IDm.setBounds(120, 120, 60, 30);

        btn_ApagarADM.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_ApagarADM.setText("Apagar");
        btn_ApagarADM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarADMActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ApagarADM);
        btn_ApagarADM.setBounds(770, 350, 90, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 910, 700);

        setSize(new java.awt.Dimension(902, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //Botão que realiza a volta para o menu do administrador.
    private void btn_VoltarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarAdmActionPerformed
        
        TelaMenuAdm tlm = new TelaMenuAdm();
        tlm.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_VoltarAdmActionPerformed

    //Botão que realiza o cadastro dos dados no banco. Após a inserção, o método lerTabela(); é chamado para mostrá-los na tabela.
    private void btn_CadNovoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadNovoAdmActionPerformed
        
        Adm h = new Adm();
        AdmDAO adao = new AdmDAO();
        
        h.setNomeadm(txt_NomeAdm.getText());        
        h.setRgadm(txt_RgAdm.getText());
        h.setCpfadm(txt_CpfAdm.getText());        
        h.setEnderecoadm(txt_EndAdm.getText());       
        h.setCeladm(txt_CelAdm.getText());       
        h.setEmailadm(txt_EmailAdm.getText());       
        h.setDatnascadm(txt_DatNascAdm.getText());       
        h.setUser(txt_UsuarioAdm.getText());       
        h.setPassword(txt_SenhaAdm.getText());       
             
               
        adao.cadastrarAdm(h);
        
        lbl_IDm.setText("");
        txt_NomeAdm.setText("");
        txt_RgAdm.setText("");
        txt_CpfAdm.setText("");      
        txt_EndAdm.setText("");   
        txt_CelAdm.setText("");   
        txt_EmailAdm.setText("");   
        txt_DatNascAdm.setText("");   
        txt_UsuarioAdm.setText("");   
        txt_SenhaAdm.setText("");   
                               
                      
        
        lerTabela();
        
    }//GEN-LAST:event_btn_CadNovoAdmActionPerformed

    //Botão que realiza a atualização dos dados no banco. Após a inserção, o método lerTabela(); é chamado para mostrá-los na tabela.
    private void btn_AttAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttAdmActionPerformed
        
        if(tb_TabelaAdm.getSelectedRow() != -1){
        
            Adm h = new Adm();
            AdmDAO dao = new AdmDAO();
        
            h.setId((int)tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 0));
            h.setNomeadm(txt_NomeAdm.getText());        
            h.setRgadm(txt_RgAdm.getText());
            h.setCpfadm(txt_CpfAdm.getText());        
            h.setEnderecoadm(txt_EndAdm.getText());       
            h.setCeladm(txt_CelAdm.getText());       
            h.setEmailadm(txt_EmailAdm.getText());       
            h.setDatnascadm(txt_DatNascAdm.getText());       
            h.setUser(txt_UsuarioAdm.getText());       
            h.setPassword(txt_SenhaAdm.getText());   
             
            dao.atualizarAdm(h);
        
            lbl_IDm.setText("");
            txt_NomeAdm.setText("");
            txt_RgAdm.setText("");
            txt_CpfAdm.setText("");      
            txt_EndAdm.setText("");   
            txt_CelAdm.setText("");   
            txt_EmailAdm.setText("");   
            txt_DatNascAdm.setText("");   
            txt_UsuarioAdm.setText("");   
            txt_SenhaAdm.setText(""); 
        
            lerTabela();
        }
        
    }//GEN-LAST:event_btn_AttAdmActionPerformed

    //Botão que realiza a exclusão dos dados no banco. Após a exclusão, o método lerTabela(); é chamado para mostrar que foram retirados da tabela.
    private void btn_DelAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DelAdmActionPerformed
        
        if(tb_TabelaAdm.getSelectedRow() != -1) {
            
            Adm h = new Adm();
            AdmDAO dao = new AdmDAO();
        
            h.setId((int)tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 0));            
            dao.deletarAdm(h);
        
            lbl_IDm.setText("");
            txt_NomeAdm.setText("");
            txt_RgAdm.setText("");
            txt_CpfAdm.setText("");      
            txt_EndAdm.setText("");   
            txt_CelAdm.setText("");   
            txt_EmailAdm.setText("");   
            txt_DatNascAdm.setText("");   
            txt_UsuarioAdm.setText("");   
            txt_SenhaAdm.setText("");  
        
            lerTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este ADM!");
        }
        
    }//GEN-LAST:event_btn_DelAdmActionPerformed

    //Evento criado para que a tabela reconheça os valores ao clicarmos em cima da linha desejada. Ele atribui as linhas com as caixas de texto para identificação nos processo de Att, Del, Cad.
    private void tb_TabelaAdmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaAdmMouseClicked
        
        if(tb_TabelaAdm.getSelectedRow() != -1){
            
            lbl_IDm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 0).toString());
            txt_NomeAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 1).toString());
            txt_RgAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 2).toString());
            txt_CpfAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 3).toString());
            txt_EndAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 4).toString());
            txt_CelAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 5).toString());
            txt_EmailAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 6).toString());
            txt_DatNascAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 7).toString());
            txt_UsuarioAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 8).toString());
            txt_SenhaAdm.setText(tb_TabelaAdm.getValueAt(tb_TabelaAdm.getSelectedRow(), 9).toString());
            
            
        }        
        
    }//GEN-LAST:event_tb_TabelaAdmMouseClicked

    //Realiza a leitura da tabela utiliazndo o método lerTabelaPesq determinado no inicio deste código.
    private void btn_ProcurarAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcurarAdmActionPerformed
       
        lerTabelaPesq(txt_PesquisarAdm.getText());
        
    }//GEN-LAST:event_btn_ProcurarAdmActionPerformed

    private void btn_ApagarADMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarADMActionPerformed
       
            lbl_IDm.setText("");
            txt_NomeAdm.setText("");
            txt_RgAdm.setText("");
            txt_CpfAdm.setText("");      
            txt_EndAdm.setText("");   
            txt_CelAdm.setText("");   
            txt_EmailAdm.setText("");   
            txt_DatNascAdm.setText("");   
            txt_UsuarioAdm.setText("");   
            txt_SenhaAdm.setText("");  
        
            lerTabela();
        
    }//GEN-LAST:event_btn_ApagarADMActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaNewAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNewAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNewAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNewAdm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNewAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn_ApagarADM;
    private javax.swing.JButton btn_AttAdm;
    private javax.swing.JButton btn_CadNovoAdm;
    private javax.swing.JButton btn_DelAdm;
    private javax.swing.JButton btn_ProcurarAdm;
    private javax.swing.JButton btn_VoltarAdm;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CPFUser;
    private javax.swing.JLabel lbl_DatNascUser;
    private javax.swing.JLabel lbl_EmailUser;
    private javax.swing.JLabel lbl_EnderecoUser;
    private javax.swing.JLabel lbl_IDAdm;
    private javax.swing.JLabel lbl_IDm;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_PesquisaUser;
    private javax.swing.JLabel lbl_RGUser;
    private javax.swing.JLabel lbl_SenhaUser;
    private javax.swing.JLabel lbl_TelUser;
    private javax.swing.JLabel lbl_UsuarioUser;
    private javax.swing.JTable tb_TabelaAdm;
    private javax.swing.JTextField txt_CelAdm;
    private javax.swing.JTextField txt_CpfAdm;
    private javax.swing.JTextField txt_DatNascAdm;
    private javax.swing.JTextField txt_EmailAdm;
    private javax.swing.JTextField txt_EndAdm;
    private javax.swing.JTextField txt_NomeAdm;
    private javax.swing.JTextField txt_PesquisarAdm;
    private javax.swing.JTextField txt_RgAdm;
    private javax.swing.JTextField txt_SenhaAdm;
    private javax.swing.JTextField txt_UsuarioAdm;
    // End of variables declaration//GEN-END:variables
}
