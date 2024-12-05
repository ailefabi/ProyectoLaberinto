/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ailensalazar.laberintoproyecto.controlador;

import ailensalazar.laberintoproyecto.modelo.AreaJuego;
import java.awt.Graphics;

/**
 *
 * @author Usuario
 */
public class ControladorHilo extends Thread{
    
    private AreaJuego areaJuego;
    private ControladorLaberinto controladorLaberinto;
    private boolean estado;

    public ControladorHilo(ControladorLaberinto controladorLaberinto) {
        
        this.controladorLaberinto=controladorLaberinto;
        
    }
    
    public void run(){
    
        while(true){
            
            try{
            
                if(estado){
                    controladorLaberinto.moverEnemigo();
                    System.out.println("me estoy moviendo");
                
                }//fin if
                
            sleep(200);
            
            }//fin try
            
        catch(InterruptedException ex){
        
            System.out.println(""+ex);
        
        }//fin catch
        
        }
    
    }
    
}
