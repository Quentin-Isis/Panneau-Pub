/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author QUENTIN
 */
public class ScenarioAnimation { 
    
    public Bandeau bandeau = new Bandeau();
    public int r = 1;
    public int z = 2;
    public int c = 1;
    
    
    public static void main(String[] args){
        new ScenarioAnimation ().scenario();
    }
   
    public void effetRotation(){
        
        for (int i = 0; i<=r-1; i++) {
           AnimRotation rotation = new AnimRotation(bandeau);
        rotation.anim(); 
        }
    }
    
    public void effetZoom(){
        
        for (int i = 0; i<=z-1; i++) {
           AnimZoom zoom = new AnimZoom(bandeau);
        zoom.anim(); 
        }
    }
    
    public void effetColor(){
        
        for (int i = 0; i<=c-1; i++) {
           AnimColor color = new AnimColor(bandeau);
        color.anim(); 
        }
    }
    
    public void scenario(){    
        
        effetRotation();
        
        bandeau.sleep(1000);
        
        effetColor();
        
        bandeau.sleep(1000);
         
        effetZoom();
       
    }
    
}
