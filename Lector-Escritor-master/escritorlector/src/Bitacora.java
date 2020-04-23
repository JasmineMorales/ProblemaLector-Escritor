/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;

/**
 *
 */

public class Bitacora {
    private static Bitacora bitacoraUnica;
    private BufferedWriter escritorLog;
    private int noTransaccion;
    private File bitacora;

    Bitacora(int Op) throws IOException {
        noTransaccion = 1;
        //Creamos el objeto que escribirá la bitácora
        String folder=System.getProperty("user.home")+File.separator+"desktop"+File.separator+"Bitacora Hotel";
        bitacora= new File(folder);
        //Obtenemos la fecha de la computadora
        java.util.GregorianCalendar calendario=new java.util.GregorianCalendar();
        java.util.Date fechaActual=calendario.getTime();
        //Comprobamos que la carpeta 'Bitacora Hotel' exista, si no la creamos
        if(!bitacora.exists()){
            if(!bitacora.mkdir())
                throw new IOException("No se pudo crear el directorio");
        }
//        //Comprobamos que la carpeta '.Hotel/<Año>' exista, si no la creamos
//        folder+=File.separator+(1900+fechaActual.getYear());
//        bitacora=new File(folder);
//        if(!bitacora.exists()){
//            if(!bitacora.mkdir())
//                throw new IOException("No se pudo crear el directorio");
//        }
//        //Comprobamos que la carpeta '.Hotel/<Año>/<Mes>' exista, si no la creamos
//        folder+=File.separator+(1+fechaActual.getMonth());
//        bitacora=new File(folder);
//        if(!bitacora.exists()){
//            if(!bitacora.mkdir())
//                throw new IOException("No se pudo crear el directorio");
//        }
        //Creamos el archivo con la fecha de hoy
        if (Op==1) 
        {
        folder+=File.separator+"Lector"+".txt";
        bitacora=new File(folder);
        escritorLog=new BufferedWriter(new java.io.FileWriter(bitacora, true));
        }
        else
        {
         folder+=File.separator+"Escritor"+".txt";
        bitacora=new File(folder);
        escritorLog=new BufferedWriter(new java.io.FileWriter(bitacora, true));
        }

    }
    

    public static Bitacora getBitacora() throws IOException{
        if (bitacoraUnica == null) {
            bitacoraUnica = new  Bitacora(0);
        }
        return bitacoraUnica;
    }
    
   
    public void HotelLog(int EsoLe, int id, int diasr) throws IOException{

        java.util.GregorianCalendar calendario=new java.util.GregorianCalendar();
        java.util.Date fechaTranc=calendario.getTime();
        String  fecha="<"+(1900+fechaTranc.getYear())+"/"+(fechaTranc.getMonth()+1)+"/"+fechaTranc.getDate()+" "+fechaTranc.getHours()+":"+fechaTranc.getMinutes()+":"+fechaTranc.getSeconds()+">";
        
        //Comprobamos que haya un mensaje en la bitácora
        
        if(bitacora.length()>0)  
            
        escritorLog.newLine();//Creamos la cadena a escribir
        String escribir ="";
        
        //Dependiendo del estado de la transacción se escriben diferentes tipos estados
        switch(EsoLe){
            case 1:
                escribir="Usuario " +id + " Consultando base de datos  Fecha: "+fecha+" ";
                break;
            case 2:
                escribir="Usuario " +id + " Reservo por "+diasr+" dias    "+"Fecha: "+fecha+" ";
                break;
        }
        //Escribe la nueva línea al final del archivo
        escritorLog.append(escribir);
        escritorLog.flush();
       
    }
}
