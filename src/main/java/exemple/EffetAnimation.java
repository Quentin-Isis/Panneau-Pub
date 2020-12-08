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
public abstract class EffetAnimation {
    
    public Bandeau monBandeau;
    
    public EffetAnimation(Bandeau monBandeau) {
        this.monBandeau=monBandeau;
    }
    
    public abstract void anim();
    
   
}
