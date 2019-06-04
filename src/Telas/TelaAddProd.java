package Telas;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Produtos;
import modelo.dao.ProdutosDAO;

public class TelaAddProd extends javax.swing.JFrame {

    
    public TelaAddProd() {
        initComponents();
        
        //Indentifica a tabela cujo qual será atribuida o método lerTabela(); logo após.
        DefaultTableModel modelo = (DefaultTableModel) tb_Prod.getModel();
        tb_Prod.setRowSorter(new TableRowSorter(modelo));
        
        lerTabela();
        
    }
    
    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_Prod.getModel();
        modelo.setNumRows(0);
        ProdutosDAO hdao = new ProdutosDAO();
        
        for(Produtos h: hdao.lerProd()){
            
            modelo.addRow(new Object[]{
                h.getIdprod(),
                h.getNomeprod(),
                h.getValorprod(),
                h.getReceitaprod(),
                h.getQntddprod(),                               
                h.getValidade(),                               
                                               
                                              
            });
        }
    }
    
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_Prod.getModel();
        modelo.setNumRows(0);
        ProdutosDAO hdao = new ProdutosDAO();
        
        for(Produtos h: hdao.pesquisaProd(pesq)){
            
            modelo.addRow(new Object[]{
                h.getIdprod(),
                h.getNomeprod(),
                h.getValorprod(),
                h.getReceitaprod(),
                h.getQntddprod(),                
                h.getValidade(),                
            });
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_NomeProd = new javax.swing.JLabel();
        lbl_ValorProd = new javax.swing.JLabel();
        lbl_RecProd = new javax.swing.JLabel();
        lbl_QntddProd = new javax.swing.JLabel();
        txt_NomeProd = new javax.swing.JTextField();
        txt_ValorProd = new javax.swing.JTextField();
        txt_QntddProd = new javax.swing.JTextField();
        txt_RecProd = new javax.swing.JComboBox<>();
        lbl_TituloProd = new javax.swing.JLabel();
        lbl_PesquisarProd = new javax.swing.JLabel();
        txt_PesquisarProd = new javax.swing.JTextField();
        btn_PesquisarProd = new javax.swing.JButton();
        btn_AddProd = new javax.swing.JButton();
        btn_AlterarProd = new javax.swing.JButton();
        btn_DeletarProd = new javax.swing.JButton();
        btn_VoltarProd = new javax.swing.JButton();
        lbl_IDProd = new javax.swing.JLabel();
        lbl_IDp = new javax.swing.JLabel();
        btn_ApagarProd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_ValidadeLote = new javax.swing.JTextField();
        JScrollPane = new javax.swing.JScrollPane();
        tb_Prod = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Estoque");
        getContentPane().setLayout(null);

        lbl_NomeProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_NomeProd.setText("Nome do Produto:");
        getContentPane().add(lbl_NomeProd);
        lbl_NomeProd.setBounds(240, 150, 130, 22);

        lbl_ValorProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_ValorProd.setText("Valor:");
        getContentPane().add(lbl_ValorProd);
        lbl_ValorProd.setBounds(50, 210, 50, 22);

        lbl_RecProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_RecProd.setText("Exige Receita:");
        getContentPane().add(lbl_RecProd);
        lbl_RecProd.setBounds(310, 210, 93, 22);

        lbl_QntddProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_QntddProd.setText("Quantidade em Estoque:");
        getContentPane().add(lbl_QntddProd);
        lbl_QntddProd.setBounds(570, 220, 180, 22);

        txt_NomeProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        getContentPane().add(txt_NomeProd);
        txt_NomeProd.setBounds(380, 150, 270, 30);

        txt_ValorProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        getContentPane().add(txt_ValorProd);
        txt_ValorProd.setBounds(110, 210, 100, 30);

        txt_QntddProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        getContentPane().add(txt_QntddProd);
        txt_QntddProd.setBounds(750, 220, 110, 30);

        txt_RecProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        txt_RecProd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Não", "Sim" }));
        getContentPane().add(txt_RecProd);
        txt_RecProd.setBounds(420, 210, 80, 30);

        lbl_TituloProd.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        lbl_TituloProd.setForeground(new java.awt.Color(0, 153, 204));
        lbl_TituloProd.setText("Adicionar Produtos");
        getContentPane().add(lbl_TituloProd);
        lbl_TituloProd.setBounds(320, 10, 270, 41);

        lbl_PesquisarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_PesquisarProd.setText("Pesquisar:");
        getContentPane().add(lbl_PesquisarProd);
        lbl_PesquisarProd.setBounds(20, 80, 80, 22);

        txt_PesquisarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        txt_PesquisarProd.setText("Digite o nome do produto");
        getContentPane().add(txt_PesquisarProd);
        txt_PesquisarProd.setBounds(100, 80, 200, 30);

        btn_PesquisarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btn_PesquisarProd.setText("Procurar");
        btn_PesquisarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesquisarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PesquisarProd);
        btn_PesquisarProd.setBounds(320, 80, 90, 25);

        btn_AddProd.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_AddProd.setText("Adicionar");
        btn_AddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddProd);
        btn_AddProd.setBounds(460, 290, 90, 30);

        btn_AlterarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_AlterarProd.setText("Alterar");
        btn_AlterarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AlterarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AlterarProd);
        btn_AlterarProd.setBounds(570, 290, 90, 30);

        btn_DeletarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_DeletarProd.setText("Deletar");
        btn_DeletarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeletarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_DeletarProd);
        btn_DeletarProd.setBounds(680, 290, 90, 30);

        btn_VoltarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_VoltarProd.setText("Voltar");
        btn_VoltarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarProd);
        btn_VoltarProd.setBounds(800, 10, 70, 23);

        lbl_IDProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_IDProd.setText("ID:");
        getContentPane().add(lbl_IDProd);
        lbl_IDProd.setBounds(460, 110, 18, 20);

        lbl_IDp.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        getContentPane().add(lbl_IDp);
        lbl_IDp.setBounds(490, 110, 40, 20);

        btn_ApagarProd.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_ApagarProd.setText("Apagar");
        btn_ApagarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ApagarProd);
        btn_ApagarProd.setBounds(790, 290, 90, 30);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        jLabel1.setText("Validade do Lote:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 280, 119, 22);

        txt_ValidadeLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ValidadeLoteActionPerformed(evt);
            }
        });
        getContentPane().add(txt_ValidadeLote);
        txt_ValidadeLote.setBounds(180, 280, 90, 30);

        tb_Prod.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Valor", "Exigência de Receita", "Quantidade", "Validade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Prod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_ProdMouseClicked(evt);
            }
        });
        JScrollPane.setViewportView(tb_Prod);

        getContentPane().add(JScrollPane);
        JScrollPane.setBounds(0, 340, 900, 300);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        Fundo.setText("jLabel1");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 940, 640);

        setSize(new java.awt.Dimension(910, 650));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarProdActionPerformed
      
        TelaMenuAdm tlm = new TelaMenuAdm();
        tlm.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_VoltarProdActionPerformed

    private void btn_AddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProdActionPerformed
        
        Produtos h = new Produtos();
        ProdutosDAO adao = new ProdutosDAO();
        
        h.setNomeprod(txt_NomeProd.getText());        
        h.setValorprod(txt_ValorProd.getText());
        h.setReceitaprod((String)txt_RecProd.getSelectedItem());        
        h.setQntddprod(Integer.parseInt(txt_QntddProd.getText()));
        h.setValidade(txt_ValidadeLote.getText());
               
             
               
        adao.cadastrarProd(h);
        
        lbl_IDp.setText("");
        txt_NomeProd.setText("");
        txt_ValorProd.setText("");
        txt_QntddProd.setText("");
        txt_ValidadeLote.setText("");
          
                               
                      
        
        lerTabela();
        
    }//GEN-LAST:event_btn_AddProdActionPerformed

    private void btn_AlterarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AlterarProdActionPerformed
        
        if(tb_Prod.getSelectedRow() != -1){
        
            Produtos h = new Produtos();
            ProdutosDAO dao = new ProdutosDAO();
        
            h.setIdprod((int)tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 0));
            h.setNomeprod(txt_NomeProd.getText());        
            h.setValorprod(txt_ValorProd.getText());
            h.setReceitaprod((String)txt_RecProd.getSelectedItem());        
            h.setQntddprod(Integer.parseInt(txt_QntddProd.getText()));   
            h.setValidade(txt_ValidadeLote.getText());   
             
            dao.atualizarProd(h);
        
            lbl_IDp.setText("");
            txt_NomeProd.setText("");
            txt_ValorProd.setText("");
            txt_QntddProd.setText(""); 
            txt_ValidadeLote.setText(""); 
        
            lerTabela();
        }
        
    }//GEN-LAST:event_btn_AlterarProdActionPerformed

    private void btn_DeletarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeletarProdActionPerformed
        
        if(tb_Prod.getSelectedRow() != -1) {
            
            Produtos h = new Produtos();
            ProdutosDAO dao = new ProdutosDAO();
        
            h.setIdprod((int)tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 0));            
            dao.deletarProd(h);
        
            lbl_IDp.setText("");
            txt_NomeProd.setText("");
            txt_ValorProd.setText("");
            txt_QntddProd.setText("");
            txt_ValidadeLote.setText("");
        
            lerTabela();
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este Produto!");
        }
        
    }//GEN-LAST:event_btn_DeletarProdActionPerformed

    private void btn_ApagarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarProdActionPerformed
      
            lbl_IDp.setText("");
            txt_NomeProd.setText("");
            txt_ValorProd.setText("");
            txt_QntddProd.setText("");
            txt_PesquisarProd.setText("");
            txt_ValidadeLote.setText("");
        
            lerTabela();
        
    }//GEN-LAST:event_btn_ApagarProdActionPerformed

    private void btn_PesquisarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesquisarProdActionPerformed
        
        lerTabelaPesq(txt_PesquisarProd.getText());
        
    }//GEN-LAST:event_btn_PesquisarProdActionPerformed

    private void tb_ProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_ProdMouseClicked
        
        if(tb_Prod.getSelectedRow() != -1){
            
            lbl_IDp.setText(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 0).toString());
            txt_NomeProd.setText(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 1).toString());
            txt_ValorProd.setText(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 2).toString());
            txt_RecProd.setSelectedItem(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 3).toString());
            txt_QntddProd.setText(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 4).toString());
            txt_ValidadeLote.setText(tb_Prod.getValueAt(tb_Prod.getSelectedRow(), 5).toString());
                       
            
        }        
        
    }//GEN-LAST:event_tb_ProdMouseClicked

    private void txt_ValidadeLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ValidadeLoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ValidadeLoteActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAddProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAddProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btn_AddProd;
    private javax.swing.JButton btn_AlterarProd;
    private javax.swing.JButton btn_ApagarProd;
    private javax.swing.JButton btn_DeletarProd;
    private javax.swing.JButton btn_PesquisarProd;
    private javax.swing.JButton btn_VoltarProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_IDProd;
    private javax.swing.JLabel lbl_IDp;
    private javax.swing.JLabel lbl_NomeProd;
    private javax.swing.JLabel lbl_PesquisarProd;
    private javax.swing.JLabel lbl_QntddProd;
    private javax.swing.JLabel lbl_RecProd;
    private javax.swing.JLabel lbl_TituloProd;
    private javax.swing.JLabel lbl_ValorProd;
    private javax.swing.JTable tb_Prod;
    private javax.swing.JTextField txt_NomeProd;
    private javax.swing.JTextField txt_PesquisarProd;
    private javax.swing.JTextField txt_QntddProd;
    private javax.swing.JComboBox<String> txt_RecProd;
    private javax.swing.JTextField txt_ValidadeLote;
    private javax.swing.JTextField txt_ValorProd;
    // End of variables declaration//GEN-END:variables
}
