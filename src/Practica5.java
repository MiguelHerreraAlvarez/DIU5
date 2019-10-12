
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgcodecs.Imgcodecs;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Practica5 extends javax.swing.JFrame {
    /**
     * Creates new form Practica5
     */
    Image imagenOriginal = null;
    JFileChooser fc = new JFileChooser();
    Integer umbral;
    public Practica5() {
        initComponents();
        optionSalir.setMnemonic('P');
        FileNameExtensionFilter filtro = null;
        FileNameExtensionFilter filtro2 = null;
        umbral  = 128;
        filtro = new FileNameExtensionFilter("ArchivosJPG","jpg","jpeg");
        
        fc.addChoosableFileFilter(filtro);
        filtro2 = new FileNameExtensionFilter("ArchivosPng","png");
        fc.addChoosableFileFilter(filtro2);
        fc.setAcceptAllFileFilterUsed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        mostradorImagen1 = new MostradorImagen();
        mostrador1 = new Mostrador();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        optionAbrir = new javax.swing.JMenuItem();
        optionGuardar = new javax.swing.JMenuItem();
        optionSalir = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        optionAcerca = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        optionUmbralizar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mostradorImagen1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mostradorImagen1Layout = new javax.swing.GroupLayout(mostradorImagen1);
        mostradorImagen1.setLayout(mostradorImagen1Layout);
        mostradorImagen1Layout.setHorizontalGroup(
            mostradorImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 574, Short.MAX_VALUE)
        );
        mostradorImagen1Layout.setVerticalGroup(
            mostradorImagen1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 341, Short.MAX_VALUE)
        );

        mostrador1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout mostrador1Layout = new javax.swing.GroupLayout(mostrador1);
        mostrador1.setLayout(mostrador1Layout);
        mostrador1Layout.setHorizontalGroup(
            mostrador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 559, Short.MAX_VALUE)
        );
        mostrador1Layout.setVerticalGroup(
            mostrador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jMenu1.setText("File");

        optionAbrir.setText("Abrir imagen");
        optionAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(optionAbrir);

        optionGuardar.setText("Guardar imagen");
        optionGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(optionGuardar);

        optionSalir.setText("Salir");
        optionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSalirActionPerformed(evt);
            }
        });
        jMenu1.add(optionSalir);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        optionAcerca.setText("Acerca de...");
        jMenu2.add(optionAcerca);

        jMenuItem5.setText("jMenuItem5");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem6.setText("Confirmacion");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem6);

        optionUmbralizar.setText("Umbralizar");
        optionUmbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionUmbralizarActionPerformed(evt);
            }
        });
        jMenu2.add(optionUmbralizar);

        jMenu3.setText("jMenu3");
        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mostrador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mostradorImagen1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostradorImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSalirActionPerformed
        // TODO add your handling code here:
        int res =JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere salir de la aplicación?","Salir",JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_optionSalirActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"Esto es un mensaje","message",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,"Esto es un mensaje","message",JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        int res =JOptionPane.showConfirmDialog(null,"Quiere salir de la aplicación","Confiramcion salir",JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION) System.exit(0);
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void optionUmbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionUmbralizarActionPerformed
        // TODO add your handling code here:
        String res =JOptionPane.showInputDialog(null,"Intoruzca el valor del umbral (entre 0 y 255)","Umbralizar");
        System.out.println("El valor de umbralización es " + res);
    }//GEN-LAST:event_optionUmbralizarActionPerformed

    private void optionAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAbrirActionPerformed
        // TODO add your handling code here:
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            System.out.println("Esto es" + fichero.getAbsolutePath());
            try {
                imagenOriginal = ImageIO.read(new URL(fichero.getAbsolutePath()));
            } catch (IOException ex) {
                Logger.getLogger(Practica5.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrador1.setImage((BufferedImage)imagenOriginal);
            //mostradorImagen1.setImage((BufferedImage)imagenOriginal, umbral);
        }
    }//GEN-LAST:event_optionAbrirActionPerformed

    private void optionGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionGuardarActionPerformed
        // TODO add your handling code here:
        int res = fc.showSaveDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            System.out.println("Esto es" + fichero.getAbsolutePath());
            Mat images = Imgcodecs.imread(fichero.getAbsolutePath());
        }
       
    }//GEN-LAST:event_optionGuardarActionPerformed

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
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Practica5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Practica5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private Mostrador mostrador1;
    private MostradorImagen mostradorImagen1;
    private javax.swing.JMenuItem optionAbrir;
    private javax.swing.JMenuItem optionAcerca;
    private javax.swing.JMenuItem optionGuardar;
    private javax.swing.JMenuItem optionSalir;
    private javax.swing.JMenuItem optionUmbralizar;
    // End of variables declaration//GEN-END:variables
}