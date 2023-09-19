/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class cambio_ecena_login extends Thread  {
    JLabel fondo2;
    JLabel fondo3;
    JPanel panel;
    public cambio_ecena_login(JLabel fondo_2,JLabel fondo_3,JPanel panel) {
        fondo2=fondo_2;
        fondo3=fondo_3;
        this.panel=panel;
    }

	public void run () {
        try {
            Thread.sleep(2700);
            //2880
            fondo2.setVisible(true);
            fondo3.setVisible(false);
            panel.setVisible(true);
        } catch (InterruptedException ex) {
           
        }
    }
    
}
