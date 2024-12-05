/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ailensalazar.laberintoproyecto.controlador;

import ailensalazar.laberintoproyecto.modelo.AreaJuego;
import ailensalazar.laberintoproyecto.vista.GUILaberinto;
import ailensalazar.laberintoproyecto.vista.PanelJuego;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Usuario
 */
public class ControladorLaberinto implements KeyListener{
    
    private GUILaberinto guiLaberinto;
    private PanelJuego panelJuego;
    private AreaJuego areaJuego;
    private ControladorHilo hilo;
    

    public ControladorLaberinto(GUILaberinto guiLaberinto) {
        this.guiLaberinto = guiLaberinto;
        areaJuego=new AreaJuego();
        hilo = new ControladorHilo(this);
    }

    public PanelJuego getPanelJuego() {
        return panelJuego;
    }

    
    
    public void setPanelJuego(PanelJuego panelJuego) {
        this.panelJuego = panelJuego;
    }
    
    public ControladorHilo getHilo(){
    
        return hilo;
    
    }
    
    public void dibujar(Graphics g){
        areaJuego.dibujar(g);
        panelJuego.repaint();
    }

//    public void caminarPersonaje(){
//    
//        areaJuego.caminarPersonaje(direccion);
//        panelJuego.repaint();
//    
//    }
    
    public void moverEnemigo(){
    
        areaJuego.moverEnemigo();
        panelJuego.repaint();
    }
    
    
    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
        switch(e.getKeyCode()){
        
            case KeyEvent.VK_UP:
                
                areaJuego.caminarPersonaje("arriba");
                
            break;
        
            case KeyEvent.VK_DOWN:
                
                areaJuego.caminarPersonaje("abajo");
                
            break;
            
            case KeyEvent.VK_LEFT:
                
                areaJuego.caminarPersonaje("izquierda");
                
            break;
            
            case KeyEvent.VK_RIGHT:
                
                areaJuego.caminarPersonaje("derecha");
                
            break;
        
        }//switch
        
        
        System.out.println("presionó una tecla");
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
}
