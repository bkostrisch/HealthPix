package Telas;

import conexao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import modelo.bean.Produtos;
import modelo.bean.Vendas;
import modelo.dao.ProdutosDAO;
import modelo.dao.VendasDAO;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.bean.Historico;
import modelo.dao.HistoricoDAO;





public class VendaProdutos extends javax.swing.JFrame {

    public static boolean condicao;
    Queue <Integer> hist = new LinkedList <Integer>();
 
    
    public VendaProdutos() {
        initComponents();
        
        //Indentifica a tabela cujo qual será atribuida o método lerTabela(); logo após.
        DefaultTableModel modelo = (DefaultTableModel) tb_Venda.getModel();
        tb_Venda.setRowSorter(new TableRowSorter(modelo));
        
        DefaultTableModel vendas = (DefaultTableModel) tb_NotaFiscal.getModel();
        tb_NotaFiscal.setRowSorter(new TableRowSorter(vendas));
               
        
        lerTabela();
        lerNotaFiscal();
        
        
    }
    
    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerTabela() {
        DefaultTableModel modelo = (DefaultTableModel) tb_Venda.getModel();
        modelo.setNumRows(0);
        ProdutosDAO hdao = new ProdutosDAO();
        
        for(Produtos h: hdao.lerProd()){
            
            modelo.addRow(new Object[]{
                
                h.getNomeprod(),
                h.getValorprod(),
                h.getReceitaprod(),
                h.getQntddprod(),                               
                                               
                                              
            });
        }
    }

    //Realiza a leitura dos componentes que serão alocados na tabela.
    public void lerNotaFiscal() {
        DefaultTableModel vendas = (DefaultTableModel) tb_NotaFiscal.getModel();
        vendas.setNumRows(0);
        VendasDAO vdao = new VendasDAO();
        
        for(Vendas h: vdao.lerVenda()){
            
            vendas.addRow(new Object[]{
                h.getIdvendas(),
                h.getVenda(),
                h.getValorvenda(),
                h.getVendedor(),
                                               
                                              
            });
        }
    }
    
    //Realiza a leitura dos componentes para pesquisar o valor determinado previamente na classe AdmDAO no método pesquisaADM.
    public void lerTabelaPesq(String pesq) {
        DefaultTableModel modelo = (DefaultTableModel) tb_Venda.getModel();
        modelo.setNumRows(0);
        ProdutosDAO hdao = new ProdutosDAO();
        
        for(Produtos h: hdao.pesquisaProd(pesq)){
            
            modelo.addRow(new Object[]{                
                
                h.getNomeprod(),
                h.getValorprod(),
                h.getReceitaprod(),
                h.getQntddprod(),                
            });
        }
    }


   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        lbl_NotaFiscal = new javax.swing.JLabel();
        lbl_NomeVenda = new javax.swing.JLabel();
        lbl_ValorVenda = new javax.swing.JLabel();
        btn_AddVenda = new javax.swing.JButton();
        btn_RemoverVenda = new javax.swing.JButton();
        lbl_VendedorVenda = new javax.swing.JLabel();
        txt_VendedorVenda = new javax.swing.JTextField();
        btn_GerarVenda = new javax.swing.JButton();
        btn_NovaVenda = new javax.swing.JButton();
        btn_VoltarVenda = new javax.swing.JButton();
        lbl_PesquisaVenda = new javax.swing.JLabel();
        txt_PesquisaVenda = new javax.swing.JTextField();
        btn_ProcuraVenda = new javax.swing.JButton();
        btn_ApagarVendas = new javax.swing.JButton();
        lbl_IDv = new javax.swing.JLabel();
        lbl_NomedaVenda = new javax.swing.JLabel();
        lbl_ValordaVenda = new javax.swing.JLabel();
        lbl_Total = new javax.swing.JLabel();
        lbl_ValorTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_Venda = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_NotaFiscal = new javax.swing.JTable();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Venda");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Venda de Produtos");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 10, 270, 41);

        lbl_NotaFiscal.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        lbl_NotaFiscal.setForeground(new java.awt.Color(0, 153, 204));
        lbl_NotaFiscal.setText("Nota Fiscal");
        getContentPane().add(lbl_NotaFiscal);
        lbl_NotaFiscal.setBounds(850, 10, 160, 50);

        lbl_NomeVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_NomeVenda.setText("Nome do Produto:");
        getContentPane().add(lbl_NomeVenda);
        lbl_NomeVenda.setBounds(20, 200, 130, 22);

        lbl_ValorVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_ValorVenda.setText("Valor:");
        getContentPane().add(lbl_ValorVenda);
        lbl_ValorVenda.setBounds(100, 242, 40, 20);

        btn_AddVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_AddVenda.setText("Adicionar");
        btn_AddVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddVenda);
        btn_AddVenda.setBounds(580, 360, 100, 29);

        btn_RemoverVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_RemoverVenda.setText("Remover");
        btn_RemoverVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RemoverVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_RemoverVenda);
        btn_RemoverVenda.setBounds(580, 420, 100, 29);

        lbl_VendedorVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        lbl_VendedorVenda.setText("Vendedor:");
        getContentPane().add(lbl_VendedorVenda);
        lbl_VendedorVenda.setBounds(70, 300, 80, 22);
        getContentPane().add(txt_VendedorVenda);
        txt_VendedorVenda.setBounds(160, 300, 190, 30);

        btn_GerarVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_GerarVenda.setText("Gerar Nota");
        btn_GerarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GerarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_GerarVenda);
        btn_GerarVenda.setBounds(690, 710, 110, 29);

        btn_NovaVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_NovaVenda.setText("Nova Nota");
        btn_NovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NovaVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_NovaVenda);
        btn_NovaVenda.setBounds(1060, 720, 100, 29);

        btn_VoltarVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_VoltarVenda.setText("Sair");
        btn_VoltarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarVenda);
        btn_VoltarVenda.setBounds(1083, 10, 80, 23);

        lbl_PesquisaVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lbl_PesquisaVenda.setText("Pesquisar:");
        getContentPane().add(lbl_PesquisaVenda);
        lbl_PesquisaVenda.setBounds(20, 90, 70, 30);

        txt_PesquisaVenda.setText("Digite o nome do produto");
        getContentPane().add(txt_PesquisaVenda);
        txt_PesquisaVenda.setBounds(90, 90, 180, 30);

        btn_ProcuraVenda.setText("Procurar");
        btn_ProcuraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ProcuraVendaActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ProcuraVenda);
        btn_ProcuraVenda.setBounds(280, 100, 90, 23);

        btn_ApagarVendas.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        btn_ApagarVendas.setText("Apagar");
        btn_ApagarVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ApagarVendasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ApagarVendas);
        btn_ApagarVendas.setBounds(580, 300, 100, 30);

        lbl_IDv.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        getContentPane().add(lbl_IDv);
        lbl_IDv.setBounds(700, 40, 30, 30);

        lbl_NomedaVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lbl_NomedaVenda.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(lbl_NomedaVenda);
        lbl_NomedaVenda.setBounds(170, 204, 160, 20);

        lbl_ValordaVenda.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        lbl_ValordaVenda.setForeground(new java.awt.Color(153, 0, 0));
        getContentPane().add(lbl_ValordaVenda);
        lbl_ValordaVenda.setBounds(170, 244, 110, 20);

        lbl_Total.setFont(new java.awt.Font("Leelawadee UI", 0, 24)); // NOI18N
        lbl_Total.setForeground(new java.awt.Color(204, 0, 0));
        lbl_Total.setText("Total:");
        getContentPane().add(lbl_Total);
        lbl_Total.setBounds(960, 630, 70, 30);

        lbl_ValorTotal.setFont(new java.awt.Font("Leelawadee UI", 0, 36)); // NOI18N
        lbl_ValorTotal.setText("0");
        getContentPane().add(lbl_ValorTotal);
        lbl_ValorTotal.setBounds(1030, 620, 120, 50);

        tb_Venda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor", "Exigência de Receita", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tb_Venda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_VendaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_Venda);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 360, 560, 390);

        tb_NotaFiscal.setModel(new javax.swing.table.DefaultTableModel(
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
        tb_NotaFiscal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_NotaFiscalMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tb_NotaFiscal);
        if (tb_NotaFiscal.getColumnModel().getColumnCount() > 0) {
            tb_NotaFiscal.getColumnModel().getColumn(3).setHeaderValue("Vendedor");
        }

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(690, 70, 470, 550);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, -30, 1260, 820);

        setSize(new java.awt.Dimension(1182, 791));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarVendaActionPerformed
                     
       
        if(condicao == false){            
            TelaLogin tgn = new TelaLogin();
            tgn.setVisible(true);            
            dispose();
            
        } else if(condicao == true) {
            TelaMenuAdm tma = new TelaMenuAdm();
            tma.setVisible(true);
            dispose();
        }
        
        
    }//GEN-LAST:event_btn_VoltarVendaActionPerformed

    private void btn_AddVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddVendaActionPerformed
                
        Connection con = ConnectionFactory.getConnection();         
        Vendas h = new Vendas();        
        VendasDAO adao = new VendasDAO();
        Historico s = new Historico();
        HistoricoDAO hdao = new HistoricoDAO();
        
       
        h.setVenda(lbl_NomedaVenda.getText());        
        h.setValorvenda(Double.parseDouble(lbl_ValordaVenda.getText()));               
        h.setVendedor(txt_VendedorVenda.getText());              
        s.setVendahist(lbl_NomedaVenda.getText());        
        s.setValorhist(lbl_ValordaVenda.getText());               
        s.setVendedorhist(txt_VendedorVenda.getText());         
        
           
        hdao.cadastrarHistorico(s);       
        adao.cadastrarVenda(h);
        
       
        
        lbl_NomedaVenda.setText("");
        lbl_ValordaVenda.setText("");
        txt_VendedorVenda.setText("");     
                               
               
        
        try {
        
        String sql = "SELECT SUM(valorvenda) from vendas";        
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        
        if(rs.next()){
            
            double soma = rs.getDouble(1);
            
            lbl_ValorTotal.setText(String.valueOf(soma));
        }
            } catch (SQLException ex) {
            Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        
        if(tb_Venda.getSelectedRow() != -1) {
            
            Produtos p = new Produtos();
            ProdutosDAO pdao = new ProdutosDAO();
        
            p.setQntddprod((int)tb_Venda.getValueAt(tb_Venda.getSelectedRow(), 3));         
                       
            pdao.diminuirQntdd(p);      
        
            
        }
      
        
        
        lerTabela();
        lerNotaFiscal();      
       
        
                
        
        
      

        
    }//GEN-LAST:event_btn_AddVendaActionPerformed

    private void btn_RemoverVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RemoverVendaActionPerformed
        
        Connection con = ConnectionFactory.getConnection();
        
        if(tb_NotaFiscal.getSelectedRow() != -1) {
            
            Vendas h = new Vendas();
            VendasDAO dao = new VendasDAO();
            Historico s = new Historico();
            HistoricoDAO hdao = new HistoricoDAO();
        
            h.setIdvendas((int)tb_NotaFiscal.getValueAt(tb_NotaFiscal.getSelectedRow(), 0));            
            s.setIdhistorico((int)tb_NotaFiscal.getValueAt(tb_NotaFiscal.getSelectedRow(), 0));            
            dao.deletarVenda(h);
            hdao.deletarHistorico(s);
        
            lbl_NomedaVenda.setText("");
            lbl_ValordaVenda.setText("");
            txt_VendedorVenda.setText("");            
            lbl_IDv.setText("");
        
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Não foi possível deletar este Produto!");
        }
        
        try {
        
        String sql = "SELECT SUM(valorvenda) from vendas";        
        PreparedStatement stm = con.prepareStatement(sql);
        ResultSet rs = stm.executeQuery();
        
        if(rs.next()){
            
            double soma = rs.getDouble(1);
            
            lbl_ValorTotal.setText(String.valueOf(soma));
        }
        } catch (SQLException ex) {
        Logger.getLogger(VendasDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        if(tb_NotaFiscal.getSelectedRow() != -1) {
            
            Produtos p = new Produtos();
            ProdutosDAO pdao = new ProdutosDAO();
        
            p.setNomeprod((String)tb_NotaFiscal.getValueAt(tb_NotaFiscal.getSelectedRow(), 1));         
                       
            pdao.aumentarQntdd(p);      
        
            
        }
        
        lerTabela();
        lerNotaFiscal();
        
    }//GEN-LAST:event_btn_RemoverVendaActionPerformed

    private void btn_ApagarVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ApagarVendasActionPerformed
        
            lbl_NomedaVenda.setText("");
            lbl_ValordaVenda.setText("");
            txt_VendedorVenda.setText("");            
            lbl_IDv.setText("");
        
            lerTabela();
            lerNotaFiscal();
        
    }//GEN-LAST:event_btn_ApagarVendasActionPerformed

    private void btn_ProcuraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ProcuraVendaActionPerformed
        
        lerTabelaPesq(txt_PesquisaVenda.getText());
    }//GEN-LAST:event_btn_ProcuraVendaActionPerformed

    private void tb_VendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_VendaMouseClicked
        
           if(tb_Venda.getSelectedRow() != -1){
                        
            lbl_NomedaVenda.setText(tb_Venda.getValueAt(tb_Venda.getSelectedRow(), 0).toString());
            lbl_ValordaVenda.setText(tb_Venda.getValueAt(tb_Venda.getSelectedRow(), 1).toString());       
            
                       
            
        }   
        
    }//GEN-LAST:event_tb_VendaMouseClicked

    private void tb_NotaFiscalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_NotaFiscalMouseClicked
       
                 
    }//GEN-LAST:event_tb_NotaFiscalMouseClicked

    private void btn_GerarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GerarVendaActionPerformed
       
       JOptionPane.showMessageDialog(null, "Imprimindo Nota!");
       
        
    }//GEN-LAST:event_btn_GerarVendaActionPerformed

    private void btn_NovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NovaVendaActionPerformed
        
        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("TRUNCATE TABLE vendas");          
            stmt.executeUpdate();           
           
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível gerar nova nota: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }     
       
        lbl_ValorTotal.setText("0");
        lerTabela();
        lerNotaFiscal();
        
        
    }//GEN-LAST:event_btn_NovaVendaActionPerformed

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
            java.util.logging.Logger.getLogger(VendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VendaProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendaProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btn_AddVenda;
    private javax.swing.JButton btn_ApagarVendas;
    private javax.swing.JButton btn_GerarVenda;
    private javax.swing.JButton btn_NovaVenda;
    private javax.swing.JButton btn_ProcuraVenda;
    private javax.swing.JButton btn_RemoverVenda;
    private javax.swing.JButton btn_VoltarVenda;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_IDv;
    private javax.swing.JLabel lbl_NomeVenda;
    private javax.swing.JLabel lbl_NomedaVenda;
    private javax.swing.JLabel lbl_NotaFiscal;
    private javax.swing.JLabel lbl_PesquisaVenda;
    private javax.swing.JLabel lbl_Total;
    private javax.swing.JLabel lbl_ValorTotal;
    private javax.swing.JLabel lbl_ValorVenda;
    private javax.swing.JLabel lbl_ValordaVenda;
    private javax.swing.JLabel lbl_VendedorVenda;
    private javax.swing.JTable tb_NotaFiscal;
    private javax.swing.JTable tb_Venda;
    private javax.swing.JTextField txt_PesquisaVenda;
    private javax.swing.JTextField txt_VendedorVenda;
    // End of variables declaration//GEN-END:variables
}
