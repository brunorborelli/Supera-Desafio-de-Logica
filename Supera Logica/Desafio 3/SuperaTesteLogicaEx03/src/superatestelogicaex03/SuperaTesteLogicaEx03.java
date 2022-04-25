/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package superatestelogicaex03;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Bruno
 */

//Foi utilizada a solução com 'n' tendo valor predefinido porque não consegui criar o processo onde cada
//index da array de tamanho 'n' escolhido pelo usuario fizesse a subtração por toda a array[i].
//A ideia era que cada item da array fosse subtraido por todos outros outros, e quando chegasse ao final dessa array i<n, 
//o loop fosse interrompido pois n atenderia mais aos requisitos, assim obteriamos o resultado desejado.


public class SuperaTesteLogicaEx03 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner leia = new Scanner(System.in); 
       
       int k;
       int n;
       
       //Definindo o valor alvo - INICIO //
       
         System.out.print("Valor alvo: ");
                    k = leia.nextInt();
         System.out.println("");
         
          //Definindo o valor alvo - FIM //
          
          //Definindo a array (tamanho e elementos- INICIO//
       
         /*System.out.print("Escolha o tamanho da array: ");*/ 
                   /* n= leia.nextInt();*/ n=5;
         System.out.println("");
         
         
         int[] array = new int[n]; 
             
                    System.out.println("A sua array possui " +n+ " elementos");
                    System.out.println("");
         
         
         System.out.println("Escolha os elementos da array: ");  
       
                    for(int i=0; i<n; i++)  
                    {  
                          array[i]=leia.nextInt();  
                    }  
                         System.out.println("");
            
           
         System.out.println("Os elementos da array são:");  
            
                    for (int i=0; i<n; i++)   
                    {  
                         
                            System.out.println("");
                            System.out.print(array[i]);
                    }
                            System.out.println("");
      
        //Definindo a array (tamanho e elementos- FIM//
        
        
         //Solução onde a array tem o tamanho predefinido como n=5. - INICIO//
         int numParesIgualAlvo = 0;
         
         for (int i=0; i<n; i++){
                      
          if(array[0] - array[i] == k){
              
              numParesIgualAlvo = numParesIgualAlvo+1;
              
          }
          if(array[1] - array[i] == k){
              
              numParesIgualAlvo = numParesIgualAlvo+1;
              
          }
          if(array[2] - array[i] == k){
              
              numParesIgualAlvo = numParesIgualAlvo+1;
              
          }
          if(array[3] - array[i] == k){
              
              numParesIgualAlvo = numParesIgualAlvo+1;
              
          }
          if(array[4] - array[i] == k){
              
              numParesIgualAlvo = numParesIgualAlvo+1;
              
          }
          
              
         }
             System.out.println("Existem " +numParesIgualAlvo+ " valores cuja diferença é igual ao valor alvo" );
             
             
             
             
             //Solução a array tem o tamanho predefinido como n=5. - FIM//
             
             
    }
      
         }

//Foi utilizada a solução com 'n' tendo valor predefinido porque não consegui criar o processo onde cada
//index da array de tamanho 'n' escolhido pelo usuario fizesse a subtração por toda a array[i].
//A ideia era que cada item da array fosse subtraido por todos outros outros, e quando chegasse ao final dessa array i<n, 
//o loop fosse interrompido pois n atenderia mais aos requisitos, assim obteriamos o resultado desejado.
    
    

