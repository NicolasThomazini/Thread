
import static javafx.beans.binding.Bindings.convert;
import sun.util.logging.resources.logging;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas
 */
public class TheadLog extends Thread {
    private String Texto;
    
    public TheadLog(String Texto){
        this.Texto=Texto;
        start();
    }
    
    public void run(){
        try{
            for(int i=0; i<Texto.length();i++){
            Integer.parseInt( ""+ Texto.charAt(i));
            }
            System.out.println("Tem algo errado"); 
           }
        catch(Exception e){
          System.out.println("Tudo certo"); 
        }
    }
    
}
