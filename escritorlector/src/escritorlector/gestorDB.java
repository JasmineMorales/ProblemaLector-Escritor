/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escritorlector;

public class gestorDB {
    private int nLectores = 0;
    private boolean hayEscritor = false;
    private int nEscritor = 0;

    public synchronized void openL(int id) throws InterruptedException{
        while(hayEscritor || nEscritor > 0){
            wait();
        }
        nLectores++;
        System.out.println("Lector " + id + "entro a la BD");
    }

    public synchronized void closeL(int id) {
        System.out.println("Lector " + id + "salio de la BD");
        nLectores--;
        if(nLectores == 0 ) notifyAll();
    }

    public synchronized void openE(int id) throws InterruptedException{
        nEscritor++;
        while (hayEscritor || nLectores >50) {
            wait();
        }
        hayEscritor = true;
        System.out.println("Escritor" + id + "Entra la BD");
    }

    public synchronized void closeE(int id) {
        nEscritor--;
        System.out.println("Escritor"+ id + "Sale de BD");
        hayEscritor = false;
        notify();
    }
    
}
