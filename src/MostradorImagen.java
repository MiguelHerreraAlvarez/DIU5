
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import org.opencv.core.Core;
import org.opencv.core.CvType;
import org.opencv.core.Mat;
import org.opencv.highgui.HighGui;
import org.opencv.imgproc.Imgproc;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class MostradorImagen extends JPanel{
    Mat originalImage;
    BufferedImage modifiedImage;
    public MostradorImagen(){
        modifiedImage = null;
        originalImage = null;
    }
    static {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(modifiedImage, 0, 0, this);
    }
    public void updateImage(Integer umbral){
        modifiedImage = (BufferedImage) HighGui.toBufferedImage(umbralizar(umbral));
        repaint();
    }
    public void setImage(Mat image,Integer umbral){
        originalImage = image;
        updateImage(umbral);
        
    }
    public BufferedImage getImage(){
        return modifiedImage;
    }
     private Mat umbralizar( Integer umbral) {
        // crear dos imágenes en niveles de gris con el mismo tamaño que la original
        Mat imagenGris = new Mat(originalImage.rows(), originalImage.cols(), CvType.CV_8U);
        Mat imagenUmbralizada = new Mat(originalImage.rows(), originalImage.cols(),
            CvType.CV_8U);
         
        // convierte a niveles de grises la imagen original
        Imgproc.cvtColor(originalImage, imagenGris, Imgproc.COLOR_BGR2GRAY);
         
        // umbraliza la imagen:  
        // ‐ píxeles con nivel de gris > umbral se ponen a 1
        // ‐ píxeles con nivel de gris <= umbra se ponen a 0
        Imgproc.threshold(imagenGris, imagenUmbralizada, umbral, 255, Imgproc.THRESH_BINARY);
        // se devuelve la imagen umbralizada
        return imagenUmbralizada;
    }
    
}
