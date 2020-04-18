/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorlector;

/**
 *
 *
 */
public class gestorDB {
    private int nLectores = 0;
    private boolean hayEscritor = false;
    private int nEscritor = 0;

    void openL(int id) throws InterruptedException{
        while(hayEscritor || nEscritor > 0){
            wait();
        }
        nLectores++;
        System.out.println("Lector " + id + "entro a la BD");
    }

    void closeL(int id) {
        System.out.println("Lector " + id + "salio de la BD");
        nLectores--;
        if(nLectores == 0 ) notifyAll();
    }

    void openE(int id) throws InterruptedException{
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void closeE(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
