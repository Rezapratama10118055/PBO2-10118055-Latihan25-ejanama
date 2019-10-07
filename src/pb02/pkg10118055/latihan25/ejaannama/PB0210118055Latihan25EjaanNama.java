/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb02.pkg10118055.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class PB0210118055Latihan25EjaanNama {
 public static String input ;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput = new Scanner(System.in);
         System.out.print("Masukkan nama depan anda untuk di eja:");
         input = userInput.next();
         
       System.out.println("Ejaan untuk"+input+"adalah");
        
       for (int i=0;i<input.length();i++){
          
           System.out.println("Huruf ke-"+(i+1)+"="+input.substring(i,(i+1)));
       }
       
    }
    
}
