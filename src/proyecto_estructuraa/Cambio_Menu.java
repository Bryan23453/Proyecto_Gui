/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import java.awt.Label;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 *
 * @author bryan
 */

public class Cambio_Menu extends Thread {
    JPanel panel;
    JPanel panel4;
    JPanel panel5;
    JPanel panel6;
    JPanel panel7;
    JTabbedPane tabpane1;
    JTabbedPane tabpanel2;
    boolean pass;
    JLabel a;
    public Cambio_Menu(JPanel pane,JPanel pane4,JPanel pane5,JPanel pane6,JLabel a,JPanel pane7,JTabbedPane tabpane,JTabbedPane tabpane2,boolean pas){
        panel=pane;
        panel4=pane4;
        panel5=pane5;
        panel6=pane6;
        panel7=pane7;
        this.a=a;
        tabpane1=tabpane;
        tabpanel2=tabpane2;
        pass=pas;
        
    }
    
    public void run () {
        if (pass) {
            a.setEnabled(false);
            int w=1230;
            tabpane1.setLocation(w, 0);
            tabpanel2.setLocation(w, 0);
            panel4.setLocation(w, 0);
            panel5.setLocation(w, 0);
            panel6.setLocation(w, 0);
            panel7.setLocation(w, 0);
            while (w>80){
            try {
                    Thread.sleep(1);
                    panel.setLocation(w,0);
                    w=w-3;
                } catch (InterruptedException ex) {}
                
            }
            a.setEnabled(true);
        }else{
            a.setEnabled(false);
            int w=1230;
            panel.setLocation(w,0);
            tabpanel2.setLocation(w, 0);
            panel4.setLocation(w, 0);
            panel5.setLocation(w, 0);
            panel6.setLocation(w, 0);
            panel7.setLocation(w, 0);
            while (w>80){
            try {
                    Thread.sleep(1);
                    tabpane1.setLocation(w,0);
                    w=w-3;
                } catch (InterruptedException ex) {}
                
            }
            a.setEnabled(true);
        }
        
            
    }
    
}


