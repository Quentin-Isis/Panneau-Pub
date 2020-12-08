/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author QUENTIN
 */

public class AnimColor extends EffetAnimation {
    
    public AnimColor (Bandeau monBandeau) {
        super(monBandeau);
    }
    public void anim() {
        monBandeau.sleep(1000);
        monBandeau.setBackground(Color.RED);
        monBandeau.sleep(1000);
	monBandeau.setForeground(Color.BLUE);
    }
    
}
