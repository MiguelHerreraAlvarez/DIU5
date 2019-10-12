
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Mostrador extends JPanel{
    BufferedImage originalImage;
    public Mostrador(){
        originalImage = null;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        System.out.println("Esto va bien ");
        g.drawImage(originalImage, 0, 0, this);
    }
    public void setImage(BufferedImage image){
        originalImage = image;
        repaint();
    }
}
