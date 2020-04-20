
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class front extends javax.swing.JFrame {

    public int estado=0;
    public int[] prioridad = new int[3];
    gestorDB gestor = new gestorDB();
    
        @Override
public Image getIconImage() {
         Image retValue = Toolkit.getDefaultToolkit().
         getImage(ClassLoader.getSystemResource("imágenes/icono.png"));
  return retValue;
}
    
    public front() {
        initComponents();
        this.setLocationRelativeTo(null);
        ImageIcon fondo = new ImageIcon(getClass().getResource("/imágenes/fondo.jpg"));
        ImageIcon icon2 = new ImageIcon(fondo.getImage().getScaledInstance(lbl_fondo.getWidth(), lbl_fondo.getHeight(), Image.SCALE_DEFAULT));
        lbl_fondo.setIcon(icon2);
        ImageIcon desbloqueado = new ImageIcon(getClass().getResource("/imágenes/fondo_desbloqueado.png"));
        ImageIcon icon = new ImageIcon(desbloqueado.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
        lbl_pantalla1.setIcon(icon);
        lbl_pantalla2.setIcon(icon);
        lbl_pantalla3.setIcon(icon);
        lbl_pantalla4.setIcon(icon);
        Reservar1.setEnabled(false);
        Reservar2.setEnabled(false);
        Reservar3.setEnabled(false);
        Reservar4.setEnabled(false);
        lbl_ocupado1.setVisible(false);
        lbl_ocupado2.setVisible(false);
        lbl_ocupado4.setVisible(false);
        lbl_ocupado3.setVisible(false);
        Apartar1.setEnabled(false);
        Apartar2.setEnabled(false);
        Apartar3.setEnabled(false);
        Apartar4.setEnabled(false);
        for (int i = 0; i < prioridad.length; i++) {
            prioridad[i]=0;
        }
                
    }
    
       
    public class BloquearCuartos extends Thread
    {
        public void run(){
            ImageIcon desbloqueado = new ImageIcon(getClass().getResource("/imágenes/fondo_desbloqueado.png"));
            ImageIcon icon = new ImageIcon(desbloqueado.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla1.setIcon(icon);
            lbl_pantalla2.setIcon(icon);
            lbl_pantalla3.setIcon(icon);
            lbl_pantalla4.setIcon(icon);
            Reservar1.setEnabled(false);
            Reservar2.setEnabled(false);
            Reservar3.setEnabled(false);
            Reservar4.setEnabled(false);
            VerCuarto1.setEnabled(true);
            VerCuarto2.setEnabled(true);
            VerCuarto3.setEnabled(true);
            VerCuarto4.setEnabled(true);
        }
    }
    
    public class MostrarCuarto1 extends Thread
    {
        public void run(){
            ImageIcon cuarto = new ImageIcon(getClass().getResource("/imágenes/cuarto.jpg"));
            ImageIcon icon = new ImageIcon(cuarto.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla1.setIcon(icon);
            Reservar1.setEnabled(true);
        }
    }
    
    public class MostrarCuarto2 extends Thread
    {
        public void run(){
            ImageIcon cuarto = new ImageIcon(getClass().getResource("/imágenes/cuarto.jpg"));
            ImageIcon icon = new ImageIcon(cuarto.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla2.setIcon(icon);
            Reservar2.setEnabled(true);
        }
    }
    
    public class MostrarCuarto3 extends Thread
    {
        public void run(){
            ImageIcon cuarto = new ImageIcon(getClass().getResource("/imágenes/cuarto.jpg"));
            ImageIcon icon = new ImageIcon(cuarto.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla3.setIcon(icon);
            Reservar3.setEnabled(true);
        }
    }
    
    public class MostrarCuarto4 extends Thread
    {
        public void run(){
            ImageIcon cuarto = new ImageIcon(getClass().getResource("/imágenes/cuarto.jpg"));
            ImageIcon icon = new ImageIcon(cuarto.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla4.setIcon(icon);
            Reservar4.setEnabled(true);
        }
    }
    
    public class OcultarCuarto1 extends Thread
    {
        public void run(){
            ImageIcon fondo = new ImageIcon(getClass().getResource("/imágenes/fondoespera.jpg"));
            ImageIcon icon2 = new ImageIcon(fondo.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla1.setIcon(icon2);
            Reservar1.setEnabled(false);
        }
    }
    
    public class OcultarCuarto2 extends Thread
    {
        public void run(){
            ImageIcon fondo = new ImageIcon(getClass().getResource("/imágenes/fondoespera.jpg"));
            ImageIcon icon2 = new ImageIcon(fondo.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla2.setIcon(icon2);
            Reservar2.setEnabled(false);
        }
    }
    
    public class OcultarCuarto3 extends Thread
    {
        public void run(){
            ImageIcon fondo = new ImageIcon(getClass().getResource("/imágenes/fondoespera.jpg"));
            ImageIcon icon2 = new ImageIcon(fondo.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla3.setIcon(icon2);
            Reservar3.setEnabled(false);
        }
    }
    
    public class OcultarCuarto4 extends Thread
    {
        public void run(){
            ImageIcon fondo = new ImageIcon(getClass().getResource("/imágenes/fondoespera.jpg"));
            ImageIcon icon2 = new ImageIcon(fondo.getImage().getScaledInstance(lbl_pantalla1.getWidth(), lbl_pantalla1.getHeight(), Image.SCALE_DEFAULT));
            lbl_pantalla4.setIcon(icon2);
            Reservar4.setEnabled(false);
        }
    }
    
    
    public class CuentaRegresiva1 extends Thread
    {
        int numero = (int) (Math.random()*(2000-10000+1)+10000);
        BloquearCuartos m = new BloquearCuartos();
                                
        public void run(){    
            escritor e = new escritor(gestor, 1, numero);
            Correr cr = new Correr();
            Reservar1.setEnabled(false);
            Apartar1.setEnabled(false);
            Apartar2.setEnabled(true);
            Apartar3.setEnabled(true);
            Apartar4.setEnabled(true);
            lbl_ocupado1.setVisible(true);
            lbl_ocupado2.setVisible(true);
            lbl_ocupado4.setVisible(true);
            lbl_ocupado3.setVisible(true);
            lbl_ocupado1.setText("HABITACIÓN RESERVADA " + numero/1000 + " DIAS");
            e.start();
            for(int i=numero; i>=1000;i=i-1000)
            {
                lbl_ocupado2.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado4.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado3.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(prioridad[0]!=0)
            {
                if(prioridad[0]==2)
                {
                    CuentaRegresiva2 c2 = new CuentaRegresiva2();
                    c2.start();
                    cr.start();
                }
                if(prioridad[0]==3)
                {
                    CuentaRegresiva3 c3 = new CuentaRegresiva3();
                    c3.start();
                    cr.start();
                }
                if(prioridad[0]==4)
                {
                    CuentaRegresiva4 c4 = new CuentaRegresiva4();
                    c4.start();
                    cr.start();
                }
            }
            else
            {
                lbl_ocupado1.setVisible(false);
                lbl_ocupado2.setVisible(false);
                lbl_ocupado3.setVisible(false);
                lbl_ocupado4.setVisible(false);
                Apartar1.setEnabled(false);
                Apartar2.setEnabled(false);
                Apartar3.setEnabled(false);
                Apartar4.setEnabled(false);
                m.start();
            }
        }
    }
    
    public class CuentaRegresiva2 extends Thread
    {
        int numero = (int) (Math.random()*(2000-10000+1)+10000);
        BloquearCuartos m = new BloquearCuartos();
        public void run(){
            escritor e = new escritor(gestor, 2, numero);
            Correr cr = new Correr();
            Reservar2.setEnabled(false);
            lbl_ocupado1.setVisible(true);
            lbl_ocupado2.setVisible(true);
            lbl_ocupado4.setVisible(true);
            lbl_ocupado3.setVisible(true);
            Apartar2.setEnabled(false);
            Apartar3.setEnabled(true);
            Apartar4.setEnabled(true);
            Apartar1.setEnabled(true);
            lbl_ocupado2.setText("HABITACIÓN RESERVADA " + numero/1000 + " DIAS");
            e.start();
            for(int i=numero; i>=1000;i=i-1000)
            {
                lbl_ocupado4.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado1.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado3.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(prioridad[0]!=0)
            {
                if(prioridad[0]==3)
                {
                    CuentaRegresiva3 c3 = new CuentaRegresiva3();
                    c3.start();
                    cr.start();
                }
                if(prioridad[0]==4)
                {
                    CuentaRegresiva4 c4 = new CuentaRegresiva4();
                    c4.start();
                    cr.start();
                }
                if(prioridad[0]==1)
                {
                    CuentaRegresiva1 c1 = new CuentaRegresiva1();
                    c1.start();
                    cr.start();
                }
            }
            else
            {
                lbl_ocupado1.setVisible(false);
                lbl_ocupado2.setVisible(false);
                lbl_ocupado3.setVisible(false);
                lbl_ocupado4.setVisible(false);
                Apartar1.setEnabled(false);
                Apartar2.setEnabled(false);
                Apartar3.setEnabled(false);
                Apartar4.setEnabled(false);
                m.start();
            }
        }
    }
    
    public class CuentaRegresiva3 extends Thread
    {
        int numero = (int) (Math.random()*(2000-10000+1)+10000);
        BloquearCuartos m = new BloquearCuartos();
        public void run(){
            escritor e = new escritor(gestor, 3, numero);
            Correr cr = new Correr();
            Reservar3.setEnabled(false);
            lbl_ocupado1.setVisible(true);
            lbl_ocupado2.setVisible(true);
            lbl_ocupado4.setVisible(true);
            lbl_ocupado3.setVisible(true);
            Apartar3.setEnabled(false);
            Apartar4.setEnabled(true);
            Apartar1.setEnabled(true);
            Apartar2.setEnabled(true);
            lbl_ocupado3.setText("HABITACIÓN RESERVADA " + numero/1000 + " DIAS");
            e.start();
            for(int i=numero; i>=1000;i=i-1000)
            {
                lbl_ocupado1.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado2.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado4.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(prioridad[0]!=0)
            {
                if(prioridad[0]==2)
                {
                    CuentaRegresiva2 c2 = new CuentaRegresiva2();
                    c2.start();
                    cr.start();
                }
                if(prioridad[0]==4)
                {
                    CuentaRegresiva4 c4 = new CuentaRegresiva4();
                    c4.start();
                    cr.start();
                }
                if(prioridad[0]==1)
                {
                    CuentaRegresiva1 c1 = new CuentaRegresiva1();
                    c1.start();
                    cr.start();
                }
            }
            else
            {
                lbl_ocupado1.setVisible(false);
                lbl_ocupado2.setVisible(false);
                lbl_ocupado3.setVisible(false);
                lbl_ocupado4.setVisible(false);
                Apartar1.setEnabled(false);
                Apartar2.setEnabled(false);
                Apartar3.setEnabled(false);
                Apartar4.setEnabled(false);
                m.start();
            }
        }
    }
    
    public class CuentaRegresiva4 extends Thread
    {
        int numero = (int) (Math.random()*(2000-10000+1)+10000);
        BloquearCuartos m = new BloquearCuartos();
        public void run(){
            escritor e = new escritor(gestor, 4, numero);
            Correr cr = new Correr();
            Reservar4.setEnabled(false);
            lbl_ocupado1.setVisible(true);
            lbl_ocupado2.setVisible(true);
            lbl_ocupado4.setVisible(true);
            lbl_ocupado3.setVisible(true);
            Apartar4.setEnabled(false);
            Apartar1.setEnabled(true);
            Apartar2.setEnabled(true);
            Apartar3.setEnabled(true);
            lbl_ocupado4.setText("HABITACIÓN RESERVADA " + numero/1000 + " DIAS");
            e.start();
            for(int i=numero; i>=1000;i=i-1000)
            {                
                lbl_ocupado1.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado2.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                lbl_ocupado3.setText("HABITACIÓN DESOCUPADA EN " + i/1000 + " DIAS...");
                try {
                    sleep(2000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(front.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(prioridad[0]!=0)
            {
                if(prioridad[0]==3)
                {
                    CuentaRegresiva3 c3 = new CuentaRegresiva3();
                    c3.start();
                    cr.start();
                }
                if(prioridad[0]==2)
                {
                    CuentaRegresiva2 c2 = new CuentaRegresiva2();
                    c2.start();
                    cr.start();
                }
                if(prioridad[0]==1)
                {
                    CuentaRegresiva1 c1 = new CuentaRegresiva1();
                    c1.start();
                    cr.start();
                }
            }
            else
            {
                lbl_ocupado1.setVisible(false);
                lbl_ocupado2.setVisible(false);
                lbl_ocupado3.setVisible(false);
                lbl_ocupado4.setVisible(false);
                Apartar1.setEnabled(false);
                Apartar2.setEnabled(false);
                Apartar3.setEnabled(false);
                Apartar4.setEnabled(false);
                m.start();
            }
        }
    }
    
    public class Correr extends Thread
    {
        public void run()
        {
            for (int i = 0; i < prioridad.length-1; i++) {
                prioridad[i]=prioridad[i+1];
            }
        }
    }
    
    public class Apartar1 extends Thread
    {
        public void run()
        {
            int i=0;
            while(i<3) {
                if(prioridad[i]==0)
                {
                    prioridad[i]=1;
                    System.out.println(prioridad[i]);
                    i=5;
                }
                i++;
            }
        }
    }
    
    public class Apartar2 extends Thread
    {
        public void run()
        {
            int i=0;
            while(i<3) {
                if(prioridad[i]==0)
                {
                    prioridad[i]=2;
                    System.out.println(prioridad[i]);
                    i=5;
                }
                i++;
            }
        }
    }
    
    public class Apartar3 extends Thread
    {
        public void run()
        {
            int i=0;
            while(i<3) {
                if(prioridad[i]==0)
                {
                    prioridad[i]=3;
                    System.out.println(prioridad[i]);
                    i=5;
                }
                i++;
            }
        }
    }
    
    public class Apartar4 extends Thread
    {
        public void run()
        {
            int i=0;
            while(i<3) {
                if(prioridad[i]==0)
                {
                    prioridad[i]=4;
                    System.out.println(prioridad[i]);
                    i=5;
                }
                i++;
            }
        }
    }
  
 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_ocupado4 = new javax.swing.JLabel();
        lbl_ocupado2 = new javax.swing.JLabel();
        lbl_ocupado1 = new javax.swing.JLabel();
        lbl_ocupado3 = new javax.swing.JLabel();
        VerCuarto4 = new javax.swing.JButton();
        VerCuarto3 = new javax.swing.JButton();
        VerCuarto2 = new javax.swing.JButton();
        VerCuarto1 = new javax.swing.JButton();
        lbl_pantalla1 = new javax.swing.JLabel();
        Apartar3 = new javax.swing.JButton();
        Apartar2 = new javax.swing.JButton();
        Apartar1 = new javax.swing.JButton();
        lbl_pantalla2 = new javax.swing.JLabel();
        lbl_pantalla4 = new javax.swing.JLabel();
        Reservar4 = new javax.swing.JButton();
        Reservar3 = new javax.swing.JButton();
        lbl_pantalla3 = new javax.swing.JLabel();
        Reservar2 = new javax.swing.JButton();
        Reservar1 = new javax.swing.JButton();
        Apartar4 = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("RESERVACIONES");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_ocupado4.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        getContentPane().add(lbl_ocupado4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 440, 350, 180));

        lbl_ocupado2.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        getContentPane().add(lbl_ocupado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, 350, 180));

        lbl_ocupado1.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        getContentPane().add(lbl_ocupado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 350, 180));

        lbl_ocupado3.setFont(new java.awt.Font("Calisto MT", 1, 14)); // NOI18N
        getContentPane().add(lbl_ocupado3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 350, 180));

        VerCuarto4.setBorderPainted(false);
        VerCuarto4.setContentAreaFilled(false);
        VerCuarto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuarto4ActionPerformed(evt);
            }
        });
        getContentPane().add(VerCuarto4, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 495, 180, 90));

        VerCuarto3.setBorderPainted(false);
        VerCuarto3.setContentAreaFilled(false);
        VerCuarto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuarto3ActionPerformed(evt);
            }
        });
        getContentPane().add(VerCuarto3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 495, 180, 90));

        VerCuarto2.setBorderPainted(false);
        VerCuarto2.setContentAreaFilled(false);
        VerCuarto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuarto2ActionPerformed(evt);
            }
        });
        getContentPane().add(VerCuarto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(767, 180, 180, 90));

        VerCuarto1.setBorderPainted(false);
        VerCuarto1.setContentAreaFilled(false);
        VerCuarto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerCuarto1ActionPerformed(evt);
            }
        });
        getContentPane().add(VerCuarto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 180, 90));

        lbl_pantalla1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(lbl_pantalla1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 517, 275));

        Apartar3.setBackground(new java.awt.Color(250, 238, 233));
        Apartar3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Apartar3.setForeground(new java.awt.Color(102, 102, 102));
        Apartar3.setText("APARTAR");
        Apartar3.setAutoscrolls(true);
        Apartar3.setBorder(null);
        Apartar3.setRequestFocusEnabled(false);
        Apartar3.setRolloverEnabled(false);
        Apartar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apartar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Apartar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 670, 110, 30));

        Apartar2.setBackground(new java.awt.Color(250, 238, 233));
        Apartar2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Apartar2.setForeground(new java.awt.Color(102, 102, 102));
        Apartar2.setText("APARTAR");
        Apartar2.setAutoscrolls(true);
        Apartar2.setBorder(null);
        Apartar2.setRequestFocusEnabled(false);
        Apartar2.setRolloverEnabled(false);
        Apartar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apartar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Apartar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 110, 30));

        Apartar1.setBackground(new java.awt.Color(250, 238, 233));
        Apartar1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Apartar1.setForeground(new java.awt.Color(102, 102, 102));
        Apartar1.setText("APARTAR");
        Apartar1.setAutoscrolls(true);
        Apartar1.setBorder(null);
        Apartar1.setRequestFocusEnabled(false);
        Apartar1.setRolloverEnabled(false);
        Apartar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apartar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Apartar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 110, 30));

        lbl_pantalla2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(lbl_pantalla2, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 40, 517, 275));

        lbl_pantalla4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(lbl_pantalla4, new org.netbeans.lib.awtextra.AbsoluteConstraints(597, 385, 517, 275));

        Reservar4.setBackground(new java.awt.Color(250, 238, 233));
        Reservar4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Reservar4.setForeground(new java.awt.Color(102, 102, 102));
        Reservar4.setText("RESERVAR");
        Reservar4.setAutoscrolls(true);
        Reservar4.setBorder(null);
        Reservar4.setRequestFocusEnabled(false);
        Reservar4.setRolloverEnabled(false);
        Reservar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar4ActionPerformed(evt);
            }
        });
        getContentPane().add(Reservar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 670, 110, 30));

        Reservar3.setBackground(new java.awt.Color(250, 238, 233));
        Reservar3.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Reservar3.setForeground(new java.awt.Color(102, 102, 102));
        Reservar3.setText("RESERVAR");
        Reservar3.setAutoscrolls(true);
        Reservar3.setBorder(null);
        Reservar3.setRequestFocusEnabled(false);
        Reservar3.setRolloverEnabled(false);
        Reservar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar3ActionPerformed(evt);
            }
        });
        getContentPane().add(Reservar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, 110, 30));

        lbl_pantalla3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        getContentPane().add(lbl_pantalla3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 385, 517, 275));

        Reservar2.setBackground(new java.awt.Color(250, 238, 233));
        Reservar2.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Reservar2.setForeground(new java.awt.Color(102, 102, 102));
        Reservar2.setText("RESERVAR");
        Reservar2.setAutoscrolls(true);
        Reservar2.setBorder(null);
        Reservar2.setRequestFocusEnabled(false);
        Reservar2.setRolloverEnabled(false);
        Reservar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar2ActionPerformed(evt);
            }
        });
        getContentPane().add(Reservar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 330, 110, 30));

        Reservar1.setBackground(new java.awt.Color(250, 238, 233));
        Reservar1.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Reservar1.setForeground(new java.awt.Color(102, 102, 102));
        Reservar1.setText("RESERVAR");
        Reservar1.setAutoscrolls(true);
        Reservar1.setBorder(null);
        Reservar1.setRequestFocusEnabled(false);
        Reservar1.setRolloverEnabled(false);
        Reservar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reservar1ActionPerformed(evt);
            }
        });
        getContentPane().add(Reservar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 110, 30));

        Apartar4.setBackground(new java.awt.Color(250, 238, 233));
        Apartar4.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Apartar4.setForeground(new java.awt.Color(102, 102, 102));
        Apartar4.setText("APARTAR");
        Apartar4.setAutoscrolls(true);
        Apartar4.setBorder(null);
        Apartar4.setRequestFocusEnabled(false);
        Apartar4.setRolloverEnabled(false);
        Apartar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Apartar4ActionPerformed(evt);
            }
        });
        getContentPane().add(Apartar4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 670, 110, 30));
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1154, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerCuarto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuarto3ActionPerformed
        MostrarCuarto3 m3 = new MostrarCuarto3();
        lector l3 = new lector(gestor, 3, true);
        l3.start();
        m3.start();        
        VerCuarto3.setEnabled(false);
    }//GEN-LAST:event_VerCuarto3ActionPerformed

    private void VerCuarto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuarto4ActionPerformed
        MostrarCuarto4 m4 = new MostrarCuarto4();      
        lector l4 = new lector(gestor, 4, true);
        l4.start();
        m4.start();
        VerCuarto4.setEnabled(false);
    }//GEN-LAST:event_VerCuarto4ActionPerformed

    private void VerCuarto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuarto1ActionPerformed
        MostrarCuarto1 m1 = new MostrarCuarto1();
        lector l1 = new lector(gestor, 1, true);
        m1.start();
        l1.start();
        VerCuarto1.setEnabled(false);
    }//GEN-LAST:event_VerCuarto1ActionPerformed
    
    private void VerCuarto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerCuarto2ActionPerformed
        MostrarCuarto2 m2 = new MostrarCuarto2();
        lector l2 = new lector(gestor, 2, true);
        l2.start();        
        m2.start();
        VerCuarto2.setEnabled(false);
    }//GEN-LAST:event_VerCuarto2ActionPerformed

    private void Reservar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar1ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla1, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            OcultarCuarto2 o2 = new OcultarCuarto2();
            OcultarCuarto1 o1 = new OcultarCuarto1();
            OcultarCuarto3 o3 = new OcultarCuarto3();
            OcultarCuarto4 o4 = new OcultarCuarto4();
            CuentaRegresiva1 c1 = new CuentaRegresiva1();
            o2.start();
            o3.start();
            o4.start();    
            o1.start();   
            c1.start();
        }
    }//GEN-LAST:event_Reservar1ActionPerformed

    private void Reservar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar2ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla2, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            OcultarCuarto2 o2 = new OcultarCuarto2();
            OcultarCuarto1 o1 = new OcultarCuarto1();
            OcultarCuarto3 o3 = new OcultarCuarto3();
            OcultarCuarto4 o4 = new OcultarCuarto4();
            CuentaRegresiva2 c1 = new CuentaRegresiva2();
            o2.start();
            o3.start();
            o4.start();    
            o1.start();
            c1.start();
        }
    }//GEN-LAST:event_Reservar2ActionPerformed

    private void Reservar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar3ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla3, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            OcultarCuarto2 o2 = new OcultarCuarto2();
            OcultarCuarto1 o1 = new OcultarCuarto1();
            OcultarCuarto3 o3 = new OcultarCuarto3();
            OcultarCuarto4 o4 = new OcultarCuarto4();
            CuentaRegresiva3 c1 = new CuentaRegresiva3();
            o2.start();
            o3.start();
            o4.start();    
            o1.start(); 
            c1.start();
        }
    }//GEN-LAST:event_Reservar3ActionPerformed

    private void Reservar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reservar4ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla4, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            OcultarCuarto2 o2 = new OcultarCuarto2();
            OcultarCuarto1 o1 = new OcultarCuarto1();
            OcultarCuarto3 o3 = new OcultarCuarto3();
            OcultarCuarto4 o4 = new OcultarCuarto4();
            CuentaRegresiva4 c1 = new CuentaRegresiva4();
            o2.start();
            o3.start();
            o4.start();    
            o1.start();
            c1.start();
        }
    }//GEN-LAST:event_Reservar4ActionPerformed

    
    private void Apartar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apartar1ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla1, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            Apartar1 a1 = new Apartar1();
            a1.run();
        }
    }//GEN-LAST:event_Apartar1ActionPerformed

    private void Apartar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apartar2ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla2, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            Apartar2 a1 = new Apartar2();
            a1.run();
        }
    }//GEN-LAST:event_Apartar2ActionPerformed

    private void Apartar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apartar3ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla3, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            Apartar3 a1 = new Apartar3();
            a1.run();
        }
    }//GEN-LAST:event_Apartar3ActionPerformed

    private void Apartar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Apartar4ActionPerformed
        int selec = JOptionPane.showConfirmDialog(lbl_pantalla4, "Confirmar reservación", "Mensaje", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(selec==0)
        {
            Apartar4 a1 = new Apartar4();
            a1.run();
        }
    }//GEN-LAST:event_Apartar4ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new front().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Apartar1;
    private javax.swing.JButton Apartar2;
    private javax.swing.JButton Apartar3;
    private javax.swing.JButton Apartar4;
    private javax.swing.JButton Reservar1;
    private javax.swing.JButton Reservar2;
    private javax.swing.JButton Reservar3;
    private javax.swing.JButton Reservar4;
    private javax.swing.JButton VerCuarto1;
    private javax.swing.JButton VerCuarto2;
    private javax.swing.JButton VerCuarto3;
    private javax.swing.JButton VerCuarto4;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_ocupado1;
    private javax.swing.JLabel lbl_ocupado2;
    private javax.swing.JLabel lbl_ocupado3;
    private javax.swing.JLabel lbl_ocupado4;
    private javax.swing.JLabel lbl_pantalla1;
    private javax.swing.JLabel lbl_pantalla2;
    private javax.swing.JLabel lbl_pantalla3;
    private javax.swing.JLabel lbl_pantalla4;
    // End of variables declaration//GEN-END:variables
}
