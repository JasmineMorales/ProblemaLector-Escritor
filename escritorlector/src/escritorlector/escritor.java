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
public class escritor extends Thread{
    private static Random rand = new Random();
    private gestorDB gestor;
    private int id;

    public escritor(gestorDB gestor, int id) {
        this.gestor = gestor;
        this.id = id;
    }
    
    public void run(){
        while (true) {
            try {
                gestor.openE(id);
                Thread.sleep(rand.nextInt(200));
                gestor.closeE(id);                
                Thread.sleep(rand.nextInt(300));
            } catch (InterruptedException ex) {
                Logger.getLogger(escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
