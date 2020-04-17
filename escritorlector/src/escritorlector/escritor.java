/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorlector;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class escritor extends Thread{
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
                
                gestor.closeE(id);
            } catch (InterruptedException ex) {
                Logger.getLogger(escritor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
