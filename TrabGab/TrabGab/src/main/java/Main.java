
import java.io.Console;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nicolas
 */

public class Main {
    public static void main( String[] args ){
   
    
    
    Console cnsl = System.console();

    String texto;
    
    System.out.println("Digite um texto qualquer, porém só use letras!");
    texto = cnsl.readLine();  
    TheadLog thread2 = new TheadLog(texto);
    TheadLog thread = new TheadLog("ThreadLog#1");
            
    }
    
}
