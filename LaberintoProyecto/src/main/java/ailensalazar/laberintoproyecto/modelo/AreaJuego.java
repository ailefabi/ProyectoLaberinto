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
public class AreaJuego {
    
    private Laberinto laberinto;
    private Personaje lumiaty;
    private Personaje semillita;
    private Personaje semillitaDos;
    private Personaje semillitaTres;
    private Enemigo enemigo;
    private Enemigo enemigoDos;
    private Enemigo enemigoTres;
    private int coordenadasX[]={37,46,60,112,140,160,185,210,235,265,285,310,335,360,385,410,435,460,486,512,540};
    private int coordenadasY[]={25,37,62,85,122,136,162,202,220,236,265,290,315,345,366,389,414,465,500,521,540};
    
    public AreaJuego(){
    
        laberinto=new Laberinto();
        posicionarPersonaje();
    
    }
    
    public void posicionarPersonaje(){
    
        lumiaty=new Personaje(19, 3,coordenadasX[3],coordenadasY[19], new ImageIcon("./src/main/resources/img/personaje.png"));
        enemigoDos=new Enemigo(16, 2,coordenadasX[2],coordenadasY[16], new ImageIcon("./src/main/resources/img/enemigodere.png"));
        enemigoTres=new Enemigo(10, 12,coordenadasX[12],coordenadasY[10], new ImageIcon("./src/main/resources/img/enemigodere.png"));
        enemigo=new Enemigo(5, 15,coordenadasX[15],coordenadasY[5], new ImageIcon("./src/main/resources/img/enemigoizq.png"));
        semillita=new Personaje(2, 13,coordenadasX[13],coordenadasY[2], new ImageIcon("./src/main/resources/img/semillabebe.png"));
        semillitaDos=new Personaje(13, 4,coordenadasX[4],coordenadasY[13], new ImageIcon("./src/main/resources/img/semillabebe.png"));
        semillitaTres=new Personaje(13, 16,coordenadasX[16],coordenadasY[13], new ImageIcon("./src/main/resources/img/semillabebe.png"));

        
    }//posicionarPersonaje
    
    public void caminarPersonaje(String direccion){
    
        int filaDestino=lumiaty.getFila();
        int columnaDestino=lumiaty.getColumna();
        
        
        
        
        switch(direccion){
        
            case "arriba":
                
                filaDestino--;
                
            break;
                
            case "abajo":
                
                filaDestino++;
                
            break;
            
            case "derecha":
                
                columnaDestino++;
                
            break;
            
            case "izquierda":
                
                columnaDestino--;
                
            break;
        
        }//switch
        
        
        if ((isValido(filaDestino,columnaDestino))&&(laberinto.getCelda(filaDestino, columnaDestino)==0)){
        lumiaty.setFila(filaDestino);
        lumiaty.setColumna(columnaDestino);
        lumiaty.setX(coordenadasX[columnaDestino]);
        lumiaty.setY(coordenadasY[filaDestino]);
        }//
    
    }//caminar
    
    public boolean isValido(int filaDestino, int columnaDestino){
    
        System.out.println("filaDestino"+ filaDestino +"columna destino"+columnaDestino);
        
        if((filaDestino>0) && (filaDestino<16) && (columnaDestino>0) && (columnaDestino<21)){
            
            System.out.println("entré a isValido");
            return true;
    
        }//if
        return false;
    }//metodo
    
    public void dibujar(Graphics g){
        
        lumiaty.show(g);
        enemigo.show(g);
        enemigoDos.show(g);
        enemigoTres.show(g);
        semillita.show(g);
        semillitaDos.show(g);
        semillitaTres.show(g);
    
    }//dibujar
    
    public void moverEnemigo(){
    
        enemigo.moverEnemigo();
        if ((isValido(enemigo.getFila(),enemigo.getColumna()))&&(laberinto.getCelda(enemigo.getFila(), enemigo.getColumna())==0)){

            enemigo.setX(coordenadasX[enemigo.getColumna()]);
            enemigo.setY(coordenadasY[enemigo.getFila()]);
        
            if(isChocar(enemigo)){
            
            System.out.println("choqué");
            
            }//if2
            
        }//if1
        
    }//mover enemigo
    
    public boolean isChocar(Enemigo enemigo){
    
        if (lumiaty.getFila()== enemigo.getFila()&&lumiaty.getColumna()== enemigo.getColumna()){
        return true;
        }//if
        return false;
    
    }//isChocar
        
        
        
    
}
