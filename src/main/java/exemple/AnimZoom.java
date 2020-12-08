/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author QUENTIN
 */
public class AnimZoom extends EffetAnimation {
    public AnimZoom (Bandeau monBandeau) {
        super(monBandeau);
    }
    public void anim() {
        for (int i = 5; i < 60 ; i+=5) {
		monBandeau.setFont(new Font(monBandeau.getMessage(), Font.BOLD, 5+i));
		monBandeau.sleep(500);
        }
    }
}
