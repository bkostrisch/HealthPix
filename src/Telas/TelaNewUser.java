package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Funcionario;
import modelo.dao.FuncionarioDAO;


public class TelaNewUser extends javax.swing.JFrame {

  
    public TelaNewUser() {
        initComponents();
                
        //Indentifica a tabela cujo qual será atribuida o método lerTabela(); logo após.
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaFunc.getModel();
        tb_TabelaFunc.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
    }

    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaFunc.getModel();
        modelo.setNumRows(0);
        FuncionarioDAO hdao = new FuncionarioDAO();
        
        for(Funcionario h: hdao.lerFunc()){
            
            modelo.addRow(new Object[]{
                h.getIdfunc(),
                h.getNomefunc(),
                h.getRgfunc(),
                h.getCpffunc(),
                h.getEnderecofunc(),                                
                h.getCelfunc(),                                
                h.getEmailfunc(),                                
                h.getDatnascfunc(),                               
                h.getUsuario(),                               
                h.getSenha(),                               
                                              
            });
        }
    }
    
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_TabelaFunc.getModel();
        modelo.setNumRows(0);
        FuncionarioDAO hdao = new FuncionarioDAO();
        
        for(Funcionario h: hdao.pesquisaFunc(pesq)){
            
            modelo.addRow(new Object[]{
                h.getIdfunc(),
                h.getNomefunc(),
                h.getRgfunc(),
                h.getCpffunc(),
                h.getEnderecofunc(),                                
                h.getCelfunc(),                                
                h.getEmailfunc(),                                
                h.getDatnascfunc(),                               
                h.getUsuario(),                               
                h.getSenha(),                
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
        txt_NomeFunc = new javax.swing.JTextField();
        txt_RgFunc = new javax.swing.JTextField();
        txt_CpfFunc = new javax.swing.JTextField();
        txt_EndFunc = new javax.swing.JTextField();
        txt_CelFunc = new javax.swing.JTextField();
        txt_EmailFunc = new javax.swing.JTextField();
        txt_UsuarioFunc = new javax.swing.JTextField();
        txt_SenhaFunc = new javax.swing.JTextField();
        txt_DatNascFunc = new javax.swing.JTextField();
        lbl_PesquisaUser = new javax.swing.JLabel();
        txt_PesquisarFunc = new javax.swing.JTextField();
        btn_PesqFunc = new javax.swing.JButton();
        btn_CadFunc = new javax.swing.JButton();
        btn_AttFunc = new javax.swing.JButton();
        btn_DelFunc = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_TabelaFunc = new javax.swing.JTable();
        txt_VoltarUser = new javax.swing.JButton();
        lbl_IDf = new javax.swing.JLabel();
        lbl_Id = new javax.swing.JLabel();
        btn_Apagar = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastrar Usuário");
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
        lbl_UsuarioUser.setBounds(440, 290, 60, 14);

        lbl_SenhaUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_SenhaUser.setText("Senha:");
        getContentPane().add(lbl_SenhaUser);
        lbl_SenhaUser.setBounds(450, 330, 50, 22);

        Titulo.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        Titulo.setForeground(new java.awt.Color(0, 153, 204));
        Titulo.setText("CADASTRO DE NOVO FUNCIONÁRIO");
        getContentPane().add(Titulo);
        Titulo.setBounds(200, 10, 520, 41);
        getContentPane().add(txt_NomeFunc);
        txt_NomeFunc.setBounds(110, 170, 330, 30);
        getContentPane().add(txt_RgFunc);
        txt_RgFunc.setBounds(110, 220, 130, 30);
        getContentPane().add(txt_CpfFunc);
        txt_CpfFunc.setBounds(110, 270, 160, 30);
        getContentPane().add(txt_EndFunc);
        txt_EndFunc.setBounds(110, 330, 320, 30);
        getContentPane().add(txt_CelFunc);
        txt_CelFunc.setBounds(110, 380, 150, 30);
        getContentPane().add(txt_EmailFunc);
        txt_EmailFunc.setBounds(520, 170, 340, 30);
        getContentPane().add(txt_UsuarioFunc);
        txt_UsuarioFunc.setBounds(520, 280, 170, 30);
        getContentPane().add(txt_SenhaFunc);
        txt_SenhaFunc.setBounds(520, 330, 170, 30);
        getContentPane().add(txt_DatNascFunc);
        txt_DatNascFunc.setBounds(520, 220, 150, 30);

        lbl_PesquisaUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_PesquisaUser.setText("Pesquisar:");
        getContentPane().add(lbl_PesquisaUser);
        lbl_PesquisaUser.setBounds(20, 70, 80, 22);

        txt_PesquisarFunc.setText("Digite o nome do usuário");
        txt_PesquisarFunc.setToolTipText("");
        getContentPane().add(txt_PesquisarFunc);
        txt_PesquisarFunc.setBounds(110, 70, 230, 30);

        btn_PesqFunc.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_PesqFunc.setText("Procurar");
        btn_PesqFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesqFuncActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PesqFunc);
        btn_PesqFunc.setBounds(350, 70, 90, 29);

        btn_CadFunc.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_CadFunc.setText("Cadastrar");
        btn_CadFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadFuncActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CadFunc);
        btn_CadFunc.setBounds(540, 400, 100, 30);

        btn_AttFunc.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_AttFunc.setText("Atualizar");
        btn_AttFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttFuncActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AttFunc);
        btn_AttFunc.setBounds(660, 400, 90, 30);

        btn_DelFunc.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_DelFunc.setText("Deletar");
        btn_DelFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DelFuncActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DelFunc);
        btn_DelFunc.setBounds(770, 400, 90, 30);

        tb_TabelaFunc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "RG", "CPF", "Endereço", "Tel/Celular", "Email", "Data de Nasc", "Usuário", "Senha"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_TabelaFunc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_TabelaFuncMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_TabelaFunc);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 440, 900, 310);

        txt_VoltarUser.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        txt_VoltarUser.setText("Voltar");
        txt_VoltarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_VoltarUserActionPerformed(evt);
            }
        });
        getContentPane().add(txt_VoltarUser);
        txt_VoltarUser.setBounds(800, 10, 70, 23);

        lbl_IDf.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        getContentPane().add(lbl_IDf);
        lbl_IDf.setBounds(110, 120, 40, 30);

        lbl_Id.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_Id.setText("ID:");
        getContentPane().add(lbl_Id);
        lbl_Id.setBounds(80, 120, 18, 30);

        btn_Apagar.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_Apagar.setText("Apagar");
        btn_Apagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Apagar);
        btn_Apagar.setBounds(770, 350, 90, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 910, 700);

        setSize(new java.awt.Dimension(902, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_VoltarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_VoltarUserActionPerformed
        
        TelaMenuAdm tlm = new TelaMenuAdm();
        tlm.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_txt_VoltarUserActionPerformed

    private void btn_CadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadFuncActionPerformed
       
        Funcionario h = new Funcionario();
        FuncionarioDAO adao = new FuncionarioDAO();
        
        h.setNomefunc(txt_NomeFunc.getText());        
        h.setRgfunc(txt_RgFunc.getText());
        h.setCpffunc(txt_CpfFunc.getText());        
        h.setEnderecofunc(txt_EndFunc.getText());       
        h.setCelfunc(txt_CelFunc.getText());       
        h.setEmailfunc(txt_EmailFunc.getText());       
        h.setDatnascfunc(txt_DatNascFunc.getText());       
        h.setUsuario(txt_UsuarioFunc.getText());       
        h.setSenha(txt_SenhaFunc.getText());       
             
               
        adao.cadastrarFunc(h);
        
        lbl_IDf.setText("");
        txt_NomeFunc.setText("");
        txt_RgFunc.setText("");
        txt_CpfFunc.setText("");      
        txt_EndFunc.setText("");   
        txt_CelFunc.setText("");   
        txt_EmailFunc.setText("");   
        txt_DatNascFunc.setText("");   
        txt_UsuarioFunc.setText("");   
        txt_SenhaFunc.setText("");   
                               
                      
        
        lerTabela();
        
    }//GEN-LAST:event_btn_CadFuncActionPerformed

    private void btn_AttFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttFuncActionPerformed
        
        if(tb_TabelaFunc.getSelectedRow() != -1){
        
            Funcionario h = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
        
            h.setIdfunc((int)tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 0));
            h.setNomefunc(txt_NomeFunc.getText());        
            h.setRgfunc(txt_RgFunc.getText());
            h.setCpffunc(txt_CpfFunc.getText());        
            h.setEnderecofunc(txt_EndFunc.getText());       
            h.setCelfunc(txt_CelFunc.getText());       
            h.setEmailfunc(txt_EmailFunc.getText());       
            h.setDatnascfunc(txt_DatNascFunc.getText());       
            h.setUsuario(txt_UsuarioFunc.getText());       
            h.setSenha(txt_SenhaFunc.getText());   
             
            dao.atualizarFunc(h);
        
            lbl_IDf.setText("");
            txt_NomeFunc.setText("");
            txt_RgFunc.setText("");
            txt_CpfFunc.setText("");      
            txt_EndFunc.setText("");   
            txt_CelFunc.setText("");   
            txt_EmailFunc.setText("");   
            txt_DatNascFunc.setText("");   
            txt_UsuarioFunc.setText("");   
            txt_SenhaFunc.setText(""); 
        
            lerTabela();
        }
        
    }//GEN-LAST:event_btn_AttFuncActionPerformed

    private void btn_DelFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DelFuncActionPerformed
        
        if(tb_TabelaFunc.getSelectedRow() != -1) {
            
            Funcionario h = new Funcionario();
            FuncionarioDAO dao = new FuncionarioDAO();
        
            h.setIdfunc((int)tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 0));            
            dao.deletarFunc(h);
        
            lbl_IDf.setText("");
            txt_NomeFunc.setText("");
            txt_RgFunc.setText("");
            txt_CpfFunc.setText("");      
            txt_EndFunc.setText("");   
            txt_CelFunc.setText("");   
            txt_EmailFunc.setText("");   
            txt_DatNascFunc.setText("");   
            txt_UsuarioFunc.setText("");   
            txt_SenhaFunc.setText("");  
        
            lerTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este Funcionário!");
        }
        
    }//GEN-LAST:event_btn_DelFuncActionPerformed

    private void btn_PesqFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesqFuncActionPerformed
       
        lerTabelaPesq(txt_PesquisarFunc.getText());
        
    }//GEN-LAST:event_btn_PesqFuncActionPerformed

    private void tb_TabelaFuncMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_TabelaFuncMouseClicked
        
        if(tb_TabelaFunc.getSelectedRow() != -1){
            
            lbl_IDf.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 0).toString());
            txt_NomeFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 1).toString());
            txt_RgFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 2).toString());
            txt_CpfFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 3).toString());
            txt_EndFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 4).toString());
            txt_CelFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 5).toString());
            txt_EmailFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 6).toString());
            txt_DatNascFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 7).toString());
            txt_UsuarioFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 8).toString());
            txt_SenhaFunc.setText(tb_TabelaFunc.getValueAt(tb_TabelaFunc.getSelectedRow(), 9).toString());
            
            
        }
        
    }//GEN-LAST:event_tb_TabelaFuncMouseClicked

    private void btn_ApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarActionPerformed
        
            lbl_IDf.setText("");
            txt_NomeFunc.setText("");
            txt_RgFunc.setText("");
            txt_CpfFunc.setText("");      
            txt_EndFunc.setText("");   
            txt_CelFunc.setText("");   
            txt_EmailFunc.setText("");   
            txt_DatNascFunc.setText("");   
            txt_UsuarioFunc.setText("");   
            txt_SenhaFunc.setText("");  
        
            lerTabela();
        
    }//GEN-LAST:event_btn_ApagarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaNewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaNewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btn_Apagar;
    private javax.swing.JButton btn_AttFunc;
    private javax.swing.JButton btn_CadFunc;
    private javax.swing.JButton btn_DelFunc;
    private javax.swing.JButton btn_PesqFunc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_CPFUser;
    private javax.swing.JLabel lbl_DatNascUser;
    private javax.swing.JLabel lbl_EmailUser;
    private javax.swing.JLabel lbl_EnderecoUser;
    private javax.swing.JLabel lbl_IDf;
    private javax.swing.JLabel lbl_Id;
    private javax.swing.JLabel lbl_NomeUser;
    private javax.swing.JLabel lbl_PesquisaUser;
    private javax.swing.JLabel lbl_RGUser;
    private javax.swing.JLabel lbl_SenhaUser;
    private javax.swing.JLabel lbl_TelUser;
    private javax.swing.JLabel lbl_UsuarioUser;
    private javax.swing.JTable tb_TabelaFunc;
    private javax.swing.JTextField txt_CelFunc;
    private javax.swing.JTextField txt_CpfFunc;
    private javax.swing.JTextField txt_DatNascFunc;
    private javax.swing.JTextField txt_EmailFunc;
    private javax.swing.JTextField txt_EndFunc;
    private javax.swing.JTextField txt_NomeFunc;
    private javax.swing.JTextField txt_PesquisarFunc;
    private javax.swing.JTextField txt_RgFunc;
    private javax.swing.JTextField txt_SenhaFunc;
    private javax.swing.JTextField txt_UsuarioFunc;
    private javax.swing.JButton txt_VoltarUser;
    // End of variables declaration//GEN-END:variables
}
