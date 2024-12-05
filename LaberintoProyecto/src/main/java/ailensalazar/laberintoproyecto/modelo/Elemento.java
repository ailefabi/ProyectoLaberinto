/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ailensalazar.laberintoproyecto.modelo;

import java.awt.Graphics;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Elemento {
    
    private int x;
    private int y;
    private ImageIcon imagen;
 
    public Elemento( int x, int y, ImageIcon imagen) {
        this.x = x;
        this.y = y;
        this.imagen = imagen;
    }//fin del constructor

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }
    
    
    public void show(Graphics g){
    
        imagen.paintIcon(null, g, x, y);
    
    }//fin show para dibujar
    
}
