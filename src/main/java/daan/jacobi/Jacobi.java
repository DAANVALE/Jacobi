/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daan.jacobi;

import java.util.HashSet;
import java.util.Set;

public class Jacobi {    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        int a = 0;
        int b = 0;
        double [] definido = {0,0,0};
        double [][]matriz = {{6,2,1,22},{-1,8,2,30},{1,-1,6,23}};
        
        do{ 
            System.out.println(" ---------------------- ITERACION NRO: " + (b++));
            
            a = 0;
            
            Calculadora cal = new Calculadora(matriz,definido);       
        
            for(int j = 0; j < cal.getTemp().length; j++){
                System.out.println((j+1) + "n : " + cal.getTemp()[j] + " ");
            }
            
            for(int k = 0; k < cal.getTemp().length; k++){
                if(definido[k] != cal.getTemp()[k]){
                    definido[k] = cal.getTemp()[k];
                }else{
                    a++;
                }
            }
            
        }while(a != definido.length);
        
            System.out.println("\n");
    }
}
