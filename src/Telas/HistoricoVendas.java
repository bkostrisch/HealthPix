package Telas;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Historico;
import modelo.dao.HistoricoDAO;


public class HistoricoVendas extends javax.swing.JFrame {

   
    public HistoricoVendas() {
        initComponents();
         DefaultTableModel modelo = (DefaultTableModel) tb_Historico.getModel();
         tb_Historico.setRowSorter(new TableRowSorter(modelo));
         
         lerTabela();
        
    }
    
    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_Historico.getModel();
        modelo.setNumRows(0);
        HistoricoDAO hdao = new HistoricoDAO();
        
        for(Historico h: hdao.lerHistorico()){
            
            modelo.addRow(new Object[]{
                
                h.getIdhistorico(),
                h.getVendahist(),
                h.getValorhist(),
                h.getVendedorhist(),                                               
                                               
                                              
            });
        }
    }
    
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_Historico.getModel();
        modelo.setNumRows(0);
        HistoricoDAO hdao = new HistoricoDAO();
        
        for(Historico h: hdao.pesquisaHist(pesq)){
            
            modelo.addRow(new Object[]{                
                
                h.getIdhistorico(),
                h.getVendahist(),
                h.getValorhist(),
                h.getVendedorhist(),
                
            });
        }
    }
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesqVend(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_Historico.getModel();
        modelo.setNumRows(0);
        HistoricoDAO hdao = new HistoricoDAO();
        
        for(Historico h: hdao.pesquisaHistII(pesq)){
            
            modelo.addRow(new Object[]{                
                
                h.getIdhistorico(),
                h.getVendahist(),
                h.getValorhist(),
                h.getVendedorhist(),
                
            });
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbl_PesqProd = new javax.swing.JLabel();
        lbl_PesqVend = new javax.swing.JLabel();
        txt_PesquisaProduto = new javax.swing.JTextField();
        txt_PesqVendedor = new javax.swing.JTextField();
        btn_PesqProd = new javax.swing.JButton();
        btn_PesqVend = new javax.swing.JButton();
        btn_VoltarHistorico = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Historico = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Histórico de Vendas");
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Histórico de Vendas");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 0, 280, 60);

        lbl_PesqProd.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_PesqProd.setText("Pesquisar por Produto:");
        getContentPane().add(lbl_PesqProd);
        lbl_PesqProd.setBounds(30, 70, 158, 22);

        lbl_PesqVend.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_PesqVend.setText("Pesquisar por Vendedor:");
        getContentPane().add(lbl_PesqVend);
        lbl_PesqVend.setBounds(30, 110, 170, 22);

        txt_PesquisaProduto.setText("Nome do Produto");
        getContentPane().add(txt_PesquisaProduto);
        txt_PesquisaProduto.setBounds(210, 70, 220, 30);

        txt_PesqVendedor.setText("Nome do Vendedor");
        getContentPane().add(txt_PesqVendedor);
        txt_PesqVendedor.setBounds(210, 110, 220, 30);

        btn_PesqProd.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_PesqProd.setText("Produto");
        btn_PesqProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesqProdActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PesqProd);
        btn_PesqProd.setBounds(450, 70, 80, 30);

        btn_PesqVend.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_PesqVend.setText("Vendedor");
        btn_PesqVend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PesqVendActionPerformed(evt);
            }
        });
        getContentPane().add(btn_PesqVend);
        btn_PesqVend.setBounds(450, 110, 83, 30);

        btn_VoltarHistorico.setFont(new java.awt.Font("Leelawadee UI", 0, 12)); // NOI18N
        btn_VoltarHistorico.setText("Voltar");
        btn_VoltarHistorico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarHistoricoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarHistorico);
        btn_VoltarHistorico.setBounds(460, 10, 73, 23);

        tb_Historico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Produto", "Valor", "Vendedor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tb_Historico);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 520, 420);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        Fundo.setText("jLabel1");
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 640, 680);

        setSize(new java.awt.Dimension(555, 630));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarHistoricoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarHistoricoActionPerformed
       
        TelaMenuAdm tlm = new TelaMenuAdm();
        tlm.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_VoltarHistoricoActionPerformed

    private void btn_PesqProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesqProdActionPerformed
       
        
       lerTabelaPesq(txt_PesquisaProduto.getText());
        
    }//GEN-LAST:event_btn_PesqProdActionPerformed

    private void btn_PesqVendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PesqVendActionPerformed
        
        lerTabelaPesqVend(txt_PesqVendedor.getText());

        
    }//GEN-LAST:event_btn_PesqVendActionPerformed

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
            java.util.logging.Logger.getLogger(HistoricoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistoricoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistoricoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistoricoVendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistoricoVendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btn_PesqProd;
    private javax.swing.JButton btn_PesqVend;
    private javax.swing.JButton btn_VoltarHistorico;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_PesqProd;
    private javax.swing.JLabel lbl_PesqVend;
    private javax.swing.JTable tb_Historico;
    private javax.swing.JTextField txt_PesqVendedor;
    private javax.swing.JTextField txt_PesquisaProduto;
    // End of variables declaration//GEN-END:variables
}
