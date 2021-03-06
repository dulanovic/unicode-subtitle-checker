package forme;

import java.awt.Color;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import logika.Kontroler;

public class FrmGlavna extends javax.swing.JFrame {

    /**
     * Creates new form FrmGlavna
     */
    public FrmGlavna() {
        initComponents();
        pripremiFormu();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlGlavni = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstVideoFajlovi = new javax.swing.JList<>();
        txtNazivFajla = new javax.swing.JTextField();
        lblPoruka = new javax.swing.JLabel();
        btnIzaberiTitl = new javax.swing.JButton();
        btnIzaberiFolder = new javax.swing.JButton();
        btnObradi = new javax.swing.JButton();
        txtNazivFoldera = new javax.swing.JTextField();
        cbIstiFolder = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstVideoFajlovi);

        btnIzaberiTitl.setText("Izaberi titl");
        btnIzaberiTitl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzaberiTitlActionPerformed(evt);
            }
        });

        btnIzaberiFolder.setText("Izaberi folder");
        btnIzaberiFolder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzaberiFolderActionPerformed(evt);
            }
        });

        btnObradi.setText("Obradi");
        btnObradi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnObradiActionPerformed(evt);
            }
        });

        cbIstiFolder.setText("Snimiti u isti folder");
        cbIstiFolder.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                cbIstiFolderStateChanged(evt);
            }
        });

        javax.swing.GroupLayout pnlGlavniLayout = new javax.swing.GroupLayout(pnlGlavni);
        pnlGlavni.setLayout(pnlGlavniLayout);
        pnlGlavniLayout.setHorizontalGroup(
            pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGlavniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlGlavniLayout.createSequentialGroup()
                        .addComponent(txtNazivFajla, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzaberiTitl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jScrollPane1)
                    .addComponent(lblPoruka, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbIstiFolder)
                    .addComponent(btnObradi)
                    .addGroup(pnlGlavniLayout.createSequentialGroup()
                        .addComponent(txtNazivFoldera, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnIzaberiFolder)))
                .addContainerGap())
        );
        pnlGlavniLayout.setVerticalGroup(
            pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGlavniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNazivFajla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzaberiTitl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbIstiFolder)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlGlavniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNazivFoldera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIzaberiFolder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblPoruka, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnObradi)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGlavni, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlGlavni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIzaberiTitlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberiTitlActionPerformed
        JFileChooser fc = new JFileChooser("D:\\Downloads");
        fc.setDialogTitle("Izaberite titl");
        fc.setApproveButtonText("Select file");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setMultiSelectionEnabled(false);
        FileFilter filterArhiva = new FileNameExtensionFilter("Arhiva (*.rar;*.zip;*.7z)", "rar", "zip", "7z");
        FileFilter filterTitl = new FileNameExtensionFilter("Titl (*.srt;*.sub;*.txt)", "srt", "sub", "txt");
        fc.addChoosableFileFilter(filterArhiva);
        fc.addChoosableFileFilter(filterTitl);
        fc.setFileFilter(filterArhiva);
        int signal = fc.showOpenDialog(null);

        if (fc.getSelectedFile() != null) {
            String putanja = fc.getSelectedFile().getAbsolutePath();
            txtNazivFajla.setText(putanja);
            txtNazivFoldera.setText(putanja.substring(0, putanja.lastIndexOf("\\")));
            lblPoruka.setText("Uspešno učitan titl!");
            lblPoruka.setForeground(new Color(2, 136, 11));
            btnObradi.setEnabled(true);
            isprazniListu();
        } else {
            if (signal == JFileChooser.CANCEL_OPTION) {
                lblPoruka.setText("Niste izabrali titl!");
                lblPoruka.setForeground(Color.RED);
                btnObradi.setEnabled(false);
            } else {
                lblPoruka.setText("Učitan neispravan format!");
                lblPoruka.setForeground(Color.RED);
                btnObradi.setEnabled(false);
                txtNazivFajla.setText("");
                azurirajListu();
            }
        }
    }//GEN-LAST:event_btnIzaberiTitlActionPerformed

    private void btnObradiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnObradiActionPerformed
        if (lstVideoFajlovi.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(this, "Niste izabrali film!", "Greška!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        boolean odgovor = Kontroler.getInstance().obradiFajl(txtNazivFajla.getText().trim(), txtNazivFoldera.getText().trim(), lstVideoFajlovi.getSelectedValue());
        if (odgovor) {
            lblPoruka.setText("Titl je uspešno obrađen.");
            lblPoruka.setForeground(new Color(2, 136, 11));
            btnObradi.setEnabled(false);
        } else {
            lblPoruka.setText("Došlo je do greške pri obradi titla!");
            lblPoruka.setForeground(Color.RED);
        }
    }//GEN-LAST:event_btnObradiActionPerformed

    private void btnIzaberiFolderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzaberiFolderActionPerformed
        if (txtNazivFajla.getText().equals("")) {
            lblPoruka.setText("Niste izabrali titl!");
            lblPoruka.setForeground(Color.RED);
            return;
        }
        JFileChooser fc = new JFileChooser("D:\\Filmovi");
        fc.setDialogTitle("Izaberite folder");
        fc.setApproveButtonText("Select folder");
        fc.setAcceptAllFileFilterUsed(false);
        fc.setMultiSelectionEnabled(false);
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        fc.showOpenDialog(null);
        if (fc.getSelectedFile() != null) {
            txtNazivFoldera.setText(fc.getSelectedFile().getAbsolutePath());
        }
        azurirajListu();
    }//GEN-LAST:event_btnIzaberiFolderActionPerformed

    private void cbIstiFolderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_cbIstiFolderStateChanged
        if (!cbIstiFolder.isSelected()) {
            btnIzaberiFolder.setEnabled(true);
        } else {
            btnIzaberiFolder.setEnabled(false);
            if (txtNazivFajla.getText().trim().equals("")) {
                txtNazivFoldera.setText("");
            } else {
                txtNazivFoldera.setText(txtNazivFajla.getText().substring(0, txtNazivFajla.getText().lastIndexOf("\\")));
            }
        }
    }//GEN-LAST:event_cbIstiFolderStateChanged

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmGlavna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmGlavna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIzaberiFolder;
    private javax.swing.JButton btnIzaberiTitl;
    private javax.swing.JButton btnObradi;
    private javax.swing.JCheckBox cbIstiFolder;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblPoruka;
    private javax.swing.JList<String> lstVideoFajlovi;
    private javax.swing.JPanel pnlGlavni;
    private javax.swing.JTextField txtNazivFajla;
    private javax.swing.JTextField txtNazivFoldera;
    // End of variables declaration//GEN-END:variables

    private void azurirajListu() {
        DefaultListModel model = new DefaultListModel();
        List<String> listaVideoFajlova = Kontroler.skenirajFolder(txtNazivFoldera.getText().trim());
        if (listaVideoFajlova.isEmpty()) {
            model.addElement("U izabranom folderu nema video fajlova!");
            lstVideoFajlovi.setModel(model);
            lstVideoFajlovi.setForeground(Color.RED);
            btnObradi.setEnabled(false);
        } else {
            for (int i = 0; i < listaVideoFajlova.size(); i++) {
                model.addElement(listaVideoFajlova.get(i));
                lstVideoFajlovi.setForeground(Color.BLACK);
                btnObradi.setEnabled(true);
            }
            lstVideoFajlovi.setModel(model);
            lstVideoFajlovi.setSelectedIndex(0);
        }
    }

    private void isprazniListu() {
        DefaultListModel model = new DefaultListModel();
        model.clear();
        lstVideoFajlovi.setModel(model);
        txtNazivFoldera.setText("");
    }

    private void pripremiFormu() {
        this.setTitle("Obrada titlova");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btnObradi.setEnabled(false);
        btnIzaberiTitl.setEnabled(true);
        btnIzaberiFolder.setEnabled(true);
        txtNazivFajla.setEditable(false);
        txtNazivFoldera.setEditable(false);
        cbIstiFolder.setSelected(false);
    }
}
