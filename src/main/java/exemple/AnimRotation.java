/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author QUENTIN
 */
public class AnimRotation extends EffetAnimation {
    
    public AnimRotation (Bandeau monBandeau) {
        super(monBandeau);
    }
    public void anim() {
        for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
        }
    }
}
