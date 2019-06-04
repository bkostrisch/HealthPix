/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Telas;

/**
 *
 * @author Pichau
 */
public class TelaInformativa extends javax.swing.JFrame {

    /**
     * Creates new form TelaInformativa
     */
    public TelaInformativa() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_Informacao = new javax.swing.JLabel();
        btn_VoltarInfo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Fundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        lbl_Informacao.setFont(new java.awt.Font("Leelawadee UI", 0, 30)); // NOI18N
        lbl_Informacao.setForeground(new java.awt.Color(0, 153, 204));
        lbl_Informacao.setText("Informações");
        getContentPane().add(lbl_Informacao);
        lbl_Informacao.setBounds(200, 10, 170, 40);

        btn_VoltarInfo.setFont(new java.awt.Font("Leelawadee UI", 0, 11)); // NOI18N
        btn_VoltarInfo.setText("Voltar");
        btn_VoltarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_VoltarInfoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_VoltarInfo);
        btn_VoltarInfo.setBounds(483, 10, 80, 30);

        jLabel1.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 204));
        jLabel1.setText("Trabalho de Engenharia de Software II");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 80, 340, 30);

        jLabel2.setFont(new java.awt.Font("Leelawadee UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 204));
        jLabel2.setText("Grupo:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 130, 70, 25);

        jLabel3.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 153));
        jLabel3.setText("- Bárbara Hedwig von Kostrisch Corrêa de Oliveira");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 200, 410, 30);

        jLabel4.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 153));
        jLabel4.setText("- Matheus Teixeira da Costa Chagas");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 280, 410, 30);

        jLabel5.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("- Thiago Henrique Gomes da Silva");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 320, 410, 30);

        jLabel6.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 153));
        jLabel6.setText("- Victor Paulo da Silva Arruda");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(20, 360, 410, 30);

        jLabel7.setFont(new java.awt.Font("Leelawadee UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 153));
        jLabel7.setText("- Gabriel Ferreira de Andrade Siqueira");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 240, 410, 30);

        Fundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.jpg"))); // NOI18N
        getContentPane().add(Fundo);
        Fundo.setBounds(0, 0, 630, 550);

        setSize(new java.awt.Dimension(591, 544));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_VoltarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_VoltarInfoActionPerformed
        
        TelaMenuAdm tlm = new TelaMenuAdm();
        tlm.setVisible(true);
        
        dispose();
        
    }//GEN-LAST:event_btn_VoltarInfoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInformativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInformativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInformativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInformativa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInformativa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fundo;
    private javax.swing.JButton btn_VoltarInfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbl_Informacao;
    // End of variables declaration//GEN-END:variables
}
