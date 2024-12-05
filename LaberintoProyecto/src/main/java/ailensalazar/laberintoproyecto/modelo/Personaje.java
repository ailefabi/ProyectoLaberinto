/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ailensalazar.laberintoproyecto.modelo;

import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Personaje extends Elemento{

    private int fila;
    protected int columna;
    private int x;
    private int y;

    public Personaje(int fila, int columna, int x, int y, ImageIcon imagen) {
        
        super(x,y,imagen);
        
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

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
    
 
}
