
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
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
    String messageAbout = "Umbralizador es una aplicación de tratamiento de imágenes.\nA partir"
            + " de una imagen cargada por el usuario se puede umbralizar obteniendo una nueva +"
            + "imagen que dependerá\ndel factor umbral introducido por el usuario, pudiendo "
            + "descargar esta imagen resultante.\nCreadores: Víctor Herrera Delgado y Miguel"
            + " Herrera Álvarez.\nVersión: 1.0\n"
            + "Versión de Java: 1.8.0_181 "
                + "";
    BufferedImage originalImage = null;
    JFileChooser fc = new JFileChooser();
    Integer umbral;
    public Practica5() {
        initComponents();
        optionSalir.setMnemonic('P');
        umbral  = 128;
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("ArchivosJPG","jpg","jpeg");
        fc.addChoosableFileFilter(filtro);
        FileNameExtensionFilter filtro2 = new FileNameExtensionFilter("ArchivosPNG","png");
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

        mostradorImagen1 = new MostradorImagen();
        mostrador1 = new Mostrador();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        optionAbrir = new javax.swing.JMenuItem();
        optionGuardar = new javax.swing.JMenuItem();
        optionSalir = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        optionUmbralizar = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        optionAbout = new javax.swing.JMenuItem();

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
            .addGap(0, 0, Short.MAX_VALUE)
        );
        mostrador1Layout.setVerticalGroup(
            mostrador1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel1.setText("Víctor Herrera Delgado");

        jLabel2.setText("Miguel Herrera Álvarez");

        fileMenu.setText("Archivo");

        optionAbrir.setText("Abrir imagen");
        optionAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAbrirActionPerformed(evt);
            }
        });
        fileMenu.add(optionAbrir);

        optionGuardar.setText("Guardar imagen");
        optionGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionGuardarActionPerformed(evt);
            }
        });
        fileMenu.add(optionGuardar);

        optionSalir.setText("Salir");
        optionSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionSalirActionPerformed(evt);
            }
        });
        fileMenu.add(optionSalir);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Editar");

        optionUmbralizar.setText("Umbralizar");
        optionUmbralizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionUmbralizarActionPerformed(evt);
            }
        });
        editMenu.add(optionUmbralizar);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Ayuda");

        optionAbout.setText("Acerca de");
        optionAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionAboutActionPerformed(evt);
            }
        });
        helpMenu.add(optionAbout);

        jMenuBar1.add(helpMenu);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 388, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(300, 300, 300))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mostradorImagen1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mostrador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void optionSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionSalirActionPerformed
        // TODO add your handling code here:
        int res =JOptionPane.showConfirmDialog(null,"¿Está seguro de que quiere salir de la aplicación?","Salir",JOptionPane.YES_NO_OPTION);
        if(res == JOptionPane.YES_OPTION) System.exit(0);
    }//GEN-LAST:event_optionSalirActionPerformed

    private void optionUmbralizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionUmbralizarActionPerformed
        // TODO add your handling code here:
        
        while(true){
            if(originalImage ==null) {
                JOptionPane.showMessageDialog(null,"No hay ninguna imágen cargada","Error",JOptionPane.ERROR_MESSAGE);
                break;
            }
            String res =JOptionPane.showInputDialog(null,"Introduzca el valor del umbral (entre 0 y 255)",umbral);
            if(res == null) break;
            if(res.matches("[0-9]+") && parseInt(res) < 256 && parseInt(res) >= 0){
                System.out.println("El valor de umbralización es " + res);
                mostradorImagen1.updateImage(parseInt(res));
                umbral = parseInt(res);
                break;
            }else{
                JOptionPane.showMessageDialog(null,"Introduzca solo números del 0 al 255","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_optionUmbralizarActionPerformed

    private void optionAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAbrirActionPerformed
        // TODO add your handling code here:
        int res = fc.showOpenDialog(null);
        if (res == JFileChooser.APPROVE_OPTION) {
            File fichero = fc.getSelectedFile();
            System.out.println("Esto es " + fichero.getAbsolutePath());
            try {
                //originalImage = ImageIO.read(new URL(fichero.getAbsolutePath()));
                //originalImage = ImageIO.read(new File(fichero.getAbsolutePath()));
                originalImage = ImageIO.read(fichero);
            } catch (IOException ex) {
                Logger.getLogger(Practica5.class.getName()).log(Level.SEVERE, null, ex);
            }
            mostrador1.setImage((BufferedImage)originalImage);
            mostradorImagen1.setImage(Imgcodecs.imread(fichero.getAbsolutePath()), umbral);
            
        }
    }//GEN-LAST:event_optionAbrirActionPerformed

    private void optionGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionGuardarActionPerformed
        // TODO add your handling code here:
        
        if (fc.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
   
            
            //Mat images = Imgcodecs.imread(fichero.getAbsolutePath());
            try {
                if(fc.getFileFilter().getDescription().equals("ArchivosJPG")){
                    ImageIO.write(mostradorImagen1.getImage(), "jpg",new File(fc.getSelectedFile().getAbsolutePath() + ".jpg"));
                }else{
                    ImageIO.write(mostradorImagen1.getImage(), "png",new File(fc.getSelectedFile().getAbsolutePath() + ".png"));
                }
            } catch (IOException e) {
                System.out.println("Error de escritura");
            }
        }
       
    }//GEN-LAST:event_optionGuardarActionPerformed

    private void optionAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionAboutActionPerformed
        // TODO add your handling code here:
        
        JOptionPane.showMessageDialog(null,messageAbout,"Acerca de",JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_optionAboutActionPerformed

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
                Practica5 practica5 = new Practica5();
                practica5.setTitle("Umbralizador");
                practica5.setLocationRelativeTo(null);
                practica5.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private Mostrador mostrador1;
    private MostradorImagen mostradorImagen1;
    private javax.swing.JMenuItem optionAbout;
    private javax.swing.JMenuItem optionAbrir;
    private javax.swing.JMenuItem optionGuardar;
    private javax.swing.JMenuItem optionSalir;
    private javax.swing.JMenuItem optionUmbralizar;
    // End of variables declaration//GEN-END:variables
}
