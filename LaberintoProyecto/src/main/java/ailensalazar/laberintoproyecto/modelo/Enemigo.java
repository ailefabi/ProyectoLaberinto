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
public class Enemigo extends Personaje{
    
    private int direccion;
    private int fila;
    
    public Enemigo (int fila, int columna, int x, int y, ImageIcon imagen){
    
        super(fila,columna,x,y,imagen);
        this.direccion=direccion;
        
    }
    
    public void moverEnemigo(){
    
        if((direccion==0)&&(fila>0)&&(fila<5)){
        fila--;
            
            if(fila==0){
                
                direccion=1;
                fila=15;
        
            }//fin if2
        
        }//if1

        if((direccion==1)&&(fila>0)&&(fila<5)){
        fila--;
            
            if(fila==5){
                
                direccion=0;
                fila=15;
        
            }//fin if2
        
        }//if1
        
        if((direccion==2)&&(columna>0)&&(columna<2)){
        
            columna--;
            
            if(columna==0){
            
                direccion=3;
                fila=16;
            
            }//if2
        
        }//if1
        if((direccion==2)&&(columna>0)&&(columna<2)){
        
            columna++;
            
            if(columna==16){
            
                direccion=2;
                fila=16;
            
            }//if2
        
        }//if1
        
//      x=x+10;

    }//fin moverEnemigo
    
}//fin Enemigo
