
package daan.jacobi;

public class Calculadora {
    double[][] matriz;
    double[] definido, temporal, valor;
    
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
