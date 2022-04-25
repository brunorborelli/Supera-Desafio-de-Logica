/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superatestelogicaex02;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Bruno Borelli
 */
public class SuperaTesteLogicaEx02 {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        
        Scanner leia = new Scanner(System.in);
        
        // Declaração do valor total - INICIO//
        
        double dinheiroTotal;
        System.out.println("Bem vindo ao Mercadinho\n");
        System.out.print("Valor pago pelo cliente em R$ (Ex.: 55,30):");
        dinheiroTotal =  leia.nextDouble();
        System.out.println("");
        // Declaração do valor total - FIM//
        
        //Execução das operações - INICIO //
        
        int notas =  (int) dinheiroTotal;
        int moedas = (int) ((dinheiroTotal - notas) * 100);
        
        int notas100 = notas / 100; 
        notas = notas - notas100 * 100;  
        
        int notas50 = notas / 50; 
        notas = notas -  notas50 * 50; 
        
        int notas20 = notas / 20;  
        notas = notas - notas20 * 20; 
        
        int notas10 = notas / 10; 
        notas = notas -  notas10 * 10; 
        
        int notas5 = notas / 5; 
        notas = notas - notas5 * 5;
        
        int notas2 = notas / 2;
        notas = notas - notas2 * 2;
        
        int moedas1 = notas / 1;
        
        
        int moedas50 = moedas / 50;
        moedas = moedas  -  moedas50 * 50;
        
        int moedas25 = moedas / 25;
        moedas = moedas  -  moedas25 * 25;
        
        int moedas10 = moedas / 10;
        moedas = moedas  -  moedas10 * 10;
        
        int moedas05 = moedas / 5;
        moedas = moedas -  moedas05 * 5;
        
        int moedas01 = moedas;
        
        //Execução das operações - FIM //
        
        //Saida de dados - INICIO //
        
        System.out.println("A melhor opção de troco é:\n");
        
        System.out.println("Notas:\n");
        System.out.println(notas100 + " nota(s) de R$ 100.00");
        System.out.println(notas50 + " nota(s) de R$ 50.00");
        System.out.println(notas20 + " nota(s) de R$ 20.00");
        System.out.println(notas10 + " nota(s) de R$ 10.00");
        System.out.println(notas5 + " nota(s) de R$ 5.00");
        System.out.println(notas2 + " nota(s) de R$ 2.00\n");
        System.out.println("Moedas:\n");
        System.out.println(moedas1 + " moeda(s) de R$ 1.00");
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");
        System.out.println(moedas05 + " moeda(s) de R$ 0.05");
        System.out.println(moedas01 + " moeda(s) de R$ 0.01");
        
         //Saida de dados - FIM //
        
    }
	
}
        
        
    
   

