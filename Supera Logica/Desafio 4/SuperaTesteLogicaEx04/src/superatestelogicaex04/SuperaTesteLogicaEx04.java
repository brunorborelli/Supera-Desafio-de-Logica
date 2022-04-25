/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superatestelogicaex04;
import java.util.Scanner;
/**
 *
 * @author Bruno Borelli
 */
public class SuperaTesteLogicaEx04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
        
        Scanner leia = new Scanner(System.in);

        
        
                  System.out.print("Numero de frases a serem impressas: ");
	int n = leia.nextInt();
                  int numeroDeFrases=0;
                  
                  
	for (int i = 0; i < n; i++) {
            
                           numeroDeFrases +=  1;
                          System.out.print("Digite "+numeroDeFrases+"° frase a ser impressa: ");
                          String frase = readLine(leia);                       
                          StringBuilder parte1 = new StringBuilder(frase.substring(0, frase.length() / 2));
                          StringBuilder parte2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
                          parte1.reverse();
                          parte2.reverse();
                          System.out.println("");
                          System.out.println(parte1.toString() + parte2.toString());
                          System.out.println("");
                          
                          
	}
	}
	
	public static String readLine(Scanner leia) {
                        String line = leia.nextLine();
                        while (line.isEmpty()){
                        line = leia.nextLine();
                        }
                            return line;
	}
	
}
        
        
    
    
