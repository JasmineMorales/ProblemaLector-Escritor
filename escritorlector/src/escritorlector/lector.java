/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorlector;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 */
public class lector extends Thread{
    private static Random rand = new Random();
    private gestorDB gestor;
    private int id;

    public lector(gestorDB gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }
    
    public void run(){
        while (true) {
            try {
                gestor.openL(id);
                Thread.sleep(rand.nextInt(200));
                gestor.closeL(id);  
                Thread.sleep(rand.nextInt(200));
            } catch (InterruptedException ex) {
                Logger.getLogger(lector.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
}
