/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package daan.jacobi;

import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class Jacobi {    
    public static void main(String[] args) {
        int a = 0, b = 0, c = 0;
        Scanner sc = new Scanner(System.in);
        double[][] matriz;
        System.out.println("Ingrese el tamano de la matriz");
        String datosIngresados = sc.next();
        String[] datos = datosIngresados.split("&");
        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);
        
        matriz = new double[filas][columnas];
        
        System.out.println("Ingrese los valores de la matriz");
        for(int i=0; i<matriz.length; i++){
            System.out.print("------  Linea: " + (i+1) + "----- \n");
            for(int j=0; j<matriz[i].length; j++){
                System.out.print((j+1) + "n: ");
                matriz[i][j] = Double.parseDouble(sc.next());
            }
        }
        
        //{{6,2,1,22},{-1,8,2,30},{1,-1,6,23}};
        //{{10,1,2,3},{4,6,-1,9},{-2,3,8,51}};
        //Calculadora call = new Calculadora();
        
        //double [][]matriz = call.Tamano_Matriz();
        //matriz = call.IngresarMatriz(matriz);
        double [] definido = new double[matriz.length];
        double [] temporal = new double[matriz.length];
        int imprimir = 0;
        
        while(c != definido.length){definido[c] = 0; c++;}
        
        //burbuja
        
        Calculadora imp = new Calculadora(matriz,definido);     
        System.out.print("--------- Matriz ingresada ---------- \n");
        imp.Imprimir_Matriz();
        
        for(int row = 0; row < matriz.length; row++){
            for(int column = 0; column < matriz.length; column++){
                if(row != column){
                    if(matriz[row][row] <= matriz[column][row] || matriz[row][row] != 0){
                        temporal = matriz[row];
                        matriz[row] = matriz[column];
                        matriz[column] = temporal;
                    }
                }
            }
        }
        
        do{
            
            a = 0;
                       
            Calculadora cal = new Calculadora(matriz,definido);     
            
            if(imprimir == 0){
                System.out.print("--------- Matriz corregida ---------- \n");
                cal.Imprimir_Matriz();
            }

            imprimir++;
            
            b++;
            System.out.print("--------- Iteracion " +  b + "---------- \n");
            
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
            
        }while(a != definido.length && b != 100);
        
            System.out.println("\n");
    }
}
