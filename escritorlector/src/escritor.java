import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class escritor extends Thread{
//    private static Random rand = new Random();
    private gestorDB gestor;
    private int id;
    private int te;

    public escritor(gestorDB gestor, int id, int te) {
        this.gestor = gestor;
        this.id = id;
        this.te = te;
    }
    
    public void run(){
        try {
            gestor.openE(id);
            for(int i=te; i>=1000;i=i-1000)    
            {
                sleep(2000);
            }
            gestor.closeE(id);
        } catch (InterruptedException ex) {
            Logger.getLogger(escritor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
