import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class lector extends Thread{
    private static Random rand = new Random();
    private gestorDB gestor;
    private int id;
    private boolean ejecutar;
    

    public lector(gestorDB gestor, int id, boolean ejecutar) {
        this.gestor = gestor;
        this.id = id;
        this.ejecutar = ejecutar;
    }

    public void setEjecutar(boolean ejecutar) {
        this.ejecutar = ejecutar;
    }
        
    public void run(){
        while (ejecutar) {
            try {
                gestor.openL(id);
                Thread.sleep(rand.nextInt(200));
                gestor.closeL(id);  
                Thread.sleep(rand.nextInt(300));
            } catch (InterruptedException ex) {
                Logger.getLogger(lector.class.getName()).log(Level.SEVERE, null, ex);
            }            
        
        
                try 
               {
                   Bitacora Bit = new Bitacora(1);

                   Bit.HotelLog(1, id, 0);
               }
               catch (IOException ex) 
               {
                   JOptionPane.showMessageDialog(null, ex);
               }
        }
    }
}
