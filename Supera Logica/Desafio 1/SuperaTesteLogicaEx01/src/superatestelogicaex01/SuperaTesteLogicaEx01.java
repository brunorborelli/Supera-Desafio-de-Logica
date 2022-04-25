/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superatestelogicaex01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;


/**
 *
 * @author Bruno Borelli
 */
public class SuperaTesteLogicaEx01 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
    

        // TODO code application logic here
        
     
//Indicativo do tamanho da array - INICIO //



System.out.println("Escolha o tamanho da sua lista: "); 
    
        BufferedReader leiaBuffer = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer leiaToken = new StringTokenizer(leiaBuffer.readLine());        
         
        int N = Integer.parseInt(leiaToken.nextToken());   


        
 //Indicativo do tamanho da array - FIM //
 
 //Inidicativo dos elementos da array - INICIO //
                    
        System.out.println("Escolha os numeros que serão adicionados a sua lista: "); 
    
    
        
        ArrayList<Integer> entrada = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();
       
        for (int i = 0; i < N; i++) {
            
            leiaToken = new StringTokenizer(leiaBuffer.readLine());
            entrada.add(Integer.parseInt(leiaToken.nextToken()));
            
       
            
            if (entrada.get(i) % 2 == 0) {
                
                pares.add(entrada.get(i));
            
            } else {
               
                impares.add(entrada.get(i));
            
            }
         
        }
        
        //Inidicativo dos elementos da array - FIM //
        
        //Sorting dos elemtnos da array - INICIO//
        
        System.out.println("A sua nova lista esta organizada da seguinte forma: Numeros inteiros pares primeiro, em ordem crescente e impares em segundo, em ordem decrescente: "); 
        
        Collections.sort(pares);    
        Collections.sort(impares);        

        Collections.reverse(impares);

        for (int par : pares) {
        
            System.out.println(par);
        
        }
        
        for (int impar : impares) {
            
            System.out.println(impar);
        
        }
        
        //Sorting dos elementos da array - FIM//
}



}
