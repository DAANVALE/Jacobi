
package daan.jacobi;
//import java.util.Scanner;

public class Calculadora {
    double[][] matriz;
    double[] definido, temporal, valor;
    //Scanner sc = new Scanner(System.in);
    
    public Calculadora(){
    }
    
    public Calculadora(double[][] matriz, double[] definido){
        setMatriz(matriz);
        setDefinido(definido);
        setValor();
        setTemp();
    }
    
    void cal(){
        for(int i = 0; i < matriz.length;i++){
            for(int j = 0; j < matriz[0].length; j++){
                if(i != j){
                    if(j != matriz[0].length - 1){
                        temporal[i] = temporal[i] + ((matriz[i][j] * (-definido[j])) / valor[i]);
                        //System.out.print("temp " + (matriz[i][j] * definido[j]) / valor[i] + "\n");
                        //System.out.print("suma " + temporal[i] + "\n");
                    }else{
                        temporal[i] = temporal[i] + (matriz[i][j] / valor[i]);
                    }     
                }
            }
        }
    }
    
    /*public double[][] Tamano_Matriz(){
        double[][] Matr;
        System.out.println("Ingrese el tamano de la matriz");
        String datosIngresados = sc.next();
        String[] datos = datosIngresados.split("&");
        int filas = Integer.parseInt(datos[0]);
        int columnas = Integer.parseInt(datos[1]);
        
        Matr = new double[filas][columnas];
        return Matr;
    }*/ 
    
    /*public double[][] IngresarMatriz(double[][] Matr){
        System.out.println("Ingrese los valores de la matriz");
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[i].length; j++){
                Matr[i][j] = Double.parseDouble(sc.next());
            }
        }
          return Matr;  
    }*/
    
    public void Imprimir_Matriz(){
    
        String[] linea = new String[matriz.length]; 
        
        int i,j;
        for(i = 0; i < matriz.length; i++){
            
            linea[i] = " ";
            
            for(j = 0; j < matriz[1].length; j++){
                linea[i] = linea[i] + matriz[i][j] + "n" + (i+1) + (j+1) + "     ";
            }
        }
        
        for(i = 0; i < matriz.length; i++){
            System.out.print(linea[i]);
            System.out.print(" \n ---- \n");
        }
    }
    
    public void setMatriz(double[][] matriz){
        this.matriz = matriz;
    }
    public void setDefinido(double[] definido){
        this.definido = definido;
    }
    
    public void setValor(){
        this.valor = new double[matriz.length];
        
        for(int i = 0; i < matriz.length; i++){
            this.valor[i] = this.matriz[i][i];
        }
    }
    
    public void setTemp(){
        this.temporal = new double [matriz.length];
        cal();
    }
    
    double[][] getMatriz(){
        return matriz;
    }
    
    double[] getDefinido(){
        return definido;
    }
    
    double[] getTemp(){
        return temporal;
    }
}
