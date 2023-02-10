/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package datosabstractos;

import java.util.Random;


/**
 *
 * @author Juanes
 */
public class Datosabstractos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 5;
        int b = 3;
        
        int vectora[] = new int[a];
        int vectorb[] = new int[b];
        int vectorc[] = new int[a + b];

        Random r = new Random();
        System.out.println("Vector A:");

        for(int i = 0; i < vectora.length; i++){
            int n = r.nextInt(10)+1;
            vectora[i] = n;
            System.out.print(" " + n + " ");
        }
        System.out.println("");
        System.out.println("Vector B:");
        for(int i = 0; i < vectorb.length; i++){
            int n = r.nextInt(10)+1;
            vectorb[i] = n;
            System.out.print(" " + n + " ");
        }
        System.out.println("");

        
        for(int i = 0; i < vectora.length; i++){
            vectorc[i] = vectora[i];
        }
        
        
        int aux = vectora.length;
        boolean aux2 = true;
        for(int i = 0; i < vectorb.length; i++){
            aux2 = true;
            for(int j = 0; j < vectora.length; j ++){
                if(aux2 == true){
                    if(vectorb[i] == vectorc[j]){
                        aux2 = false;
                    }
                    
                }
            }
            if(aux2 == true){
                vectorc[aux] = vectorb[i];
            }
            aux = aux + 1;
        }
        System.out.println("");
        System.out.println("Vector C:");
        for(int i = 0; i < vectorc.length; i++){
            if(vectorc[i] != 0){
                System.out.print(" " +vectorc[i] + " ");
            }
        }
        
    }
    
}
