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
    

    
    public static void main(String[] args){
        new ScenarioAnimation ().scenario();
    }
    public void scenario(){    
        Bandeau bandeau = new Bandeau();
        
        AnimRotation rotation = new AnimRotation(bandeau);
        rotation.anim();
        
        bandeau.sleep(1000);
        
        AnimZoom zoom = new AnimZoom (bandeau);
        zoom.anim();
        
        bandeau.sleep(1000);
        
        AnimColor color = new AnimColor (bandeau);
        color.anim();
    }
    
}
