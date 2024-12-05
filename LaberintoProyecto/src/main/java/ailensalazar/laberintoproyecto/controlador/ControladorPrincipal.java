/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ailensalazar.laberintoproyecto.controlador;


import ailensalazar.laberintoproyecto.vista.GUIHistoria;
import ailensalazar.laberintoproyecto.vista.GUIInstrucciones;
import ailensalazar.laberintoproyecto.vista.GUILaberinto;
import ailensalazar.laberintoproyecto.vista.GUIPrincipal;
import ailensalazar.laberintoproyecto.vista.PanelJuego;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Usuario
 */
public class ControladorPrincipal implements ActionListener, MouseListener{

    private GUIPrincipal guiPrincipal;
    private GUIInstrucciones guiInstrucciones;
    private GUIHistoria guiHistoria;
    private PanelJuego panelJuego;
    private GUILaberinto guiLaberinto;
    private ControladorLaberinto controladorLaberinto;
    private ControladorHilo hilo;

    public ControladorPrincipal() {
        
        guiPrincipal= new GUIPrincipal(this);
        guiInstrucciones= new GUIInstrucciones();
        guiInstrucciones.escuchar(this);
        guiHistoria=new GUIHistoria();
        guiHistoria.escuchar(this);
        guiPrincipal.setVisible(true);
        guiLaberinto = new GUILaberinto();
//        guiLaberinto.escucharTeclado(controladorLaberinto);
        guiLaberinto.setFocusable(true);
        guiLaberinto.requestFocusInWindow();
        panelJuego= guiLaberinto.getPanelJuego();
        controladorLaberinto=new ControladorLaberinto(guiLaberinto);
        controladorLaberinto.setPanelJuego(panelJuego);
        panelJuego.setControlador(controladorLaberinto);
        hilo=new ControladorHilo(controladorLaberinto);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        switch(e.getActionCommand()){
        
            case "jugar":
                
                System.out.println("Presionó jugar");
                guiPrincipal.setVisible(false);
                guiLaberinto.setVisible(true);
                
                hilo.start();
                
            break;
            
            case "instrucciones":
                guiPrincipal.setVisible(false);
                guiInstrucciones.setVisible(true);
                System.out.println("Presionó instrucciones");
                
            break;
            
            case "historia":
                
                guiPrincipal.setVisible(false);
                guiHistoria.setVisible(true);
                System.out.println("Presionó historia");
                
            break;
            
            case "salir":
                
                System.exit(0);
                
            break;
        
            case "salirInstrucciones":
                
                guiInstrucciones.setVisible(false);
                guiPrincipal.setVisible(true);
                
            break;
            
            case "salirHistoria":
                
                guiHistoria.setVisible(false);
                guiPrincipal.setVisible(true);
                
            break;
            
            case "menu":
                
                guiLaberinto.setVisible(false);
                guiPrincipal.setVisible(true);
                
            break;
            
        }
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
