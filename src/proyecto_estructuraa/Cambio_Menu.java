/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */

public class Cambio_Menu extends Thread {
    JPanel panel;
    JPanel panel2;
    JPanel panel3;
    JPanel panel4;
    JPanel panel5;
    public Cambio_Menu(JPanel pane,JPanel pane2,JPanel pane3,JPanel pane4,JPanel pane5){
        panel=pane;
        panel2=pane2;
        panel3=pane3;
        panel4=pane4;
        panel5=pane5;
    }
    
    public void run () {
        int w=1230;
        panel2.setLocation(w, 0);
        panel3.setLocation(w, 0);
        panel4.setLocation(w, 0);
        panel5.setLocation(w, 0);
            while (w>87){
            try {
                    Thread.sleep(1);
                    panel.setLocation(w,0);
                    w=w-3;
                } catch (InterruptedException ex) {}
                
            }
    }
    
}


