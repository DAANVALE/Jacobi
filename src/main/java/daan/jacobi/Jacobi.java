/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daan.jacobi;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Sanja
 */
public class Jacobi {    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        double [] definido = {0,0,0};
        double [][]matriz = {{6,2,1,22},{-1,8,2,30},{1,-2,6,23}};
        
        Calculadora cal = new Calculadora(matriz,definido);
        
            for(int j = 0; j < cal.getTemp().length; j++){
                System.out.println(cal.getTemp()[j] + "  ");
            }
            System.out.println("/n");
    }
}
