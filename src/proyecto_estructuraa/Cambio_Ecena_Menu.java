/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_estructuraa;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author bryan
 */
public class Cambio_Ecena_Menu  extends Thread  {
    JLabel fondo2;
    JLabel fondo3;
    JPanel panel;
    public Cambio_Ecena_Menu(JLabel fondonim,JLabel fondoesta,JPanel menuu) {
        fondo2=fondonim;
        fondo3=fondoesta;
        panel=menuu;
    }

	public void run () {
        try {
            Thread.sleep(7010);
            fondo3.setVisible(true);
            panel.setVisible(true);
            fondo2.setVisible(false);
            
        } catch (InterruptedException ex) {
           
        }
    }
    
}