package Connection.Telas;
import Connection.MySql.ClienteDao.ClienteDao;
import Connection.drinks.BebidasAlcoolicas;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author adamy
 */
public class CrudCompleto extends javax.swing.JFrame {
    ClienteDao clienteDao = new ClienteDao();
    BebidasAlcoolicas b = new BebidasAlcoolicas();
   
    public CrudCompleto() {
        initComponents();
        }   


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnDeleta = new javax.swing.JButton();
        BtnSalvar = new javax.swing.JButton();
        lblNome = new javax.swing.JLabel();
        lblIdade = new javax.swing.JLabel();
        lblCpf = new javax.swing.JLabel();
        lblRg = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jTextFieldTipo = new javax.swing.JTextField();
        jTextFieldOrigem = new javax.swing.JTextField();
        jTextFieldQuantidadeEstoque = new javax.swing.JTextField();
        checkBox = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crud Completo");
        getContentPane().setLayout(null);

        btnDeleta.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnDeleta.setText("Deletar");
        btnDeleta.setToolTipText("Deletar");
        btnDeleta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        btnDeleta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletaActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleta);
        btnDeleta.setBounds(40, 250, 100, 30);

        BtnSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        BtnSalvar.setText("Cadastrar");
        BtnSalvar.setToolTipText("Salvar");
        BtnSalvar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        BtnSalvar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BtnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnSalvar);
        BtnSalvar.setBounds(160, 250, 100, 30);

        lblNome.setText("Nome:");
        getContentPane().add(lblNome);
        lblNome.setBounds(30, 40, 31, 14);

        lblIdade.setText("Tipo:");
        getContentPane().add(lblIdade);
        lblIdade.setBounds(30, 80, 24, 14);

        lblCpf.setText("Origem:");
        getContentPane().add(lblCpf);
        lblCpf.setBounds(30, 120, 40, 14);

        lblRg.setText("Quantidade no estoque: ");
        getContentPane().add(lblRg);
        lblRg.setBounds(30, 160, 120, 14);

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldNome);
        jTextFieldNome.setBounds(80, 40, 250, 20);

        jTextFieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTipoActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldTipo);
        jTextFieldTipo.setBounds(80, 80, 160, 20);
        getContentPane().add(jTextFieldOrigem);
        jTextFieldOrigem.setBounds(80, 120, 160, 20);
        getContentPane().add(jTextFieldQuantidadeEstoque);
        jTextFieldQuantidadeEstoque.setBounds(160, 160, 60, 20);

        checkBox.setText("Não Alcoolica");
        checkBox.setToolTipText("Bebida Não Alcoolica");
        checkBox.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        checkBox.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBoxActionPerformed(evt);
            }
        });
        getContentPane().add(checkBox);
        checkBox.setBounds(50, 200, 100, 21);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Tipo", "Origem", "QuantidadeEstoque"
            }
        ));
        jTable1.setToolTipText("");
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 360, 800, 190);

        jButton1.setText("Adicionar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(280, 250, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\adamy\\Desktop\\bebidas-logo-isolated-no-fundo-branco-98582185.jpg")); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 800, 550);

        setSize(new java.awt.Dimension(813, 588));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTipoActionPerformed

    private void BtnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalvarActionPerformed
       if(checkBox.isSelected()){    
       salvarDados();    
       }else{
       criaDados();
       }
    }//GEN-LAST:event_BtnSalvarActionPerformed

    private void btnDeletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletaActionPerformed
        try {if(checkBox.isSelected()){
           deletaDados();
        }else{
             deletaRegistro();
                }
        } catch (SQLException ex) {
            Logger.getLogger(CrudCompleto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDeletaActionPerformed
    
    private void checkBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBoxActionPerformed
   
    }//GEN-LAST:event_checkBoxActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Vector v = new Vector();
        
       v.add(jTextFieldNome.getText());
       v.add(jTextFieldTipo.getText());
       v.add(jTextFieldOrigem.getText());
       v.add(jTextFieldQuantidadeEstoque.getText());
       DefaultTableModel dt = (DefaultTableModel) jTable1.getModel();
       dt.addRow(v);
    }//GEN-LAST:event_jButton1ActionPerformed

    @Override
    public int checkImage(Image image, ImageObserver io) {
        return super.checkImage(image, io); //To change body of generated methods, choose Tools | Templates.
    }
//bebida nao alcoolica
  private void deletaDados() throws SQLException {
        b.setNome(jTextFieldNome.getText());
        clienteDao.deletaDados(b);
    }
    //bebida alcoolica
    private void deletaRegistro() throws SQLException {
        b.setNome(jTextFieldNome.getText());
        clienteDao.deletaResgistro(b);
    }
    
    private boolean validaCamposObrigatorios() {
        return (jTextFieldNome.getText().equals("")
                || jTextFieldTipo.getText().equals("")
                || jTextFieldOrigem.getText().equals("")
                || jTextFieldQuantidadeEstoque.getText().equals(""));
    }

    private void salvarDados() {
        if (validaCamposObrigatorios()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            try {
                b.setNome(jTextFieldNome.getText());
                b.setTipo(jTextFieldTipo.getText());
                b.setOrigem(jTextFieldOrigem.getText());
                b.setQuantidadeEstoque(Integer.parseInt(jTextFieldQuantidadeEstoque.getText()));
      
                clienteDao.criarResgistro(b);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + e.toString());
            }
        }
    }
    private void criaDados() {
        if (validaCamposObrigatorios()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        } else {
            try {
                b.setNome(jTextFieldNome.getText());
                b.setTipo(jTextFieldTipo.getText());
                b.setOrigem(jTextFieldOrigem.getText());
                b.setQuantidadeEstoque(Integer.parseInt(jTextFieldQuantidadeEstoque.getText()));

                clienteDao.salvaResgistro(b);
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Erro ao salvar os dados: " + e.toString());
            }
        }
    }

   
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrudCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrudCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrudCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrudCompleto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrudCompleto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnSalvar;
    private javax.swing.JButton btnDeleta;
    public javax.swing.JCheckBox checkBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldOrigem;
    private javax.swing.JTextField jTextFieldQuantidadeEstoque;
    private javax.swing.JTextField jTextFieldTipo;
    private javax.swing.JLabel lblCpf;
    private javax.swing.JLabel lblIdade;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblRg;
    // End of variables declaration//GEN-END:variables
}

