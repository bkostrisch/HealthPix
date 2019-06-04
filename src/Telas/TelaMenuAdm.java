package Telas;

public class TelaMenuAdm extends javax.swing.JFrame {

    public TelaMenuAdm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_CadNovoUser = new javax.swing.JButton();
        btn_AddProdEstoque = new javax.swing.JButton();
        btn_VendaProdutos = new javax.swing.JButton();
        btn_Deslogar = new javax.swing.JButton();
        btn_HistoricoVendas = new javax.swing.JButton();
        btn_CadNovoAdm = new javax.swing.JButton();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu do Administrador");
        setResizable(false);
        getContentPane().setLayout(null);

        btn_CadNovoUser.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_CadNovoUser.setText("Cadastrar Novo Funcionário");
        btn_CadNovoUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadNovoUserActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CadNovoUser);
        btn_CadNovoUser.setBounds(40, 100, 260, 50);

        btn_AddProdEstoque.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_AddProdEstoque.setText("Adicionar Produto ao Estoque");
        btn_AddProdEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddProdEstoqueActionPerformed(evt);
            }
        });
        getContentPane().add(btn_AddProdEstoque);
        btn_AddProdEstoque.setBounds(40, 180, 260, 50);

        btn_VendaProdutos.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_VendaProdutos.setText("Venda de Produtos");
        btn_VendaProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VendaProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VendaProdutos);
        btn_VendaProdutos.setBounds(40, 260, 260, 50);

        btn_Deslogar.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_Deslogar.setText("Deslogar");
        btn_Deslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeslogarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Deslogar);
        btn_Deslogar.setBounds(110, 410, 120, 40);

        btn_HistoricoVendas.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_HistoricoVendas.setText("Histórico de Vendas");
        btn_HistoricoVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_HistoricoVendasActionPerformed(evt);
            }
        });
        getContentPane().add(btn_HistoricoVendas);
        btn_HistoricoVendas.setBounds(40, 340, 260, 50);

        btn_CadNovoAdm.setFont(new java.awt.Font("Leelawadee UI", 0, 16)); // NOI18N
        btn_CadNovoAdm.setText("Cadastrar Novo ADM");
        btn_CadNovoAdm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CadNovoAdmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_CadNovoAdm);
        btn_CadNovoAdm.setBounds(40, 20, 260, 50);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 410, 540);

        setSize(new java.awt.Dimension(353, 524));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_CadNovoUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadNovoUserActionPerformed
        
        TelaNewUser tln = new TelaNewUser();
        tln.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_CadNovoUserActionPerformed

    private void btn_AddProdEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddProdEstoqueActionPerformed
       
        TelaAddProd tap = new TelaAddProd();
        tap.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_AddProdEstoqueActionPerformed

    private void btn_VendaProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VendaProdutosActionPerformed
        
        VendaProdutos vnp = new VendaProdutos();
        vnp.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_VendaProdutosActionPerformed

    private void btn_HistoricoVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_HistoricoVendasActionPerformed
        
        HistoricoVendas hst = new HistoricoVendas();
        hst.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_HistoricoVendasActionPerformed

    private void btn_DeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeslogarActionPerformed
        
        TelaLogin tlg = new TelaLogin();
        tlg.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_DeslogarActionPerformed

    private void btn_CadNovoAdmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CadNovoAdmActionPerformed
       
        TelaNewAdm tna = new TelaNewAdm();
        tna.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_CadNovoAdmActionPerformed

 
    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenuAdm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btn_AddProdEstoque;
    private javax.swing.JButton btn_CadNovoAdm;
    private javax.swing.JButton btn_CadNovoUser;
    private javax.swing.JButton btn_Deslogar;
    private javax.swing.JButton btn_HistoricoVendas;
    private javax.swing.JButton btn_VendaProdutos;
    // End of variables declaration//GEN-END:variables
}
