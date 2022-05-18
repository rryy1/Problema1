package rryy.impares;

/**
 *
 * @author rryy
 */
public class Metodos { 

    public void sumatoriaImpar(int x) {
        
        int sum = 0;
    
        //Sumatoria
        for (int i = 0; i <= x; i++) {
            if (i % 2 != 0) {        //Resto de la division
                sum = sum + i;
            }
        }
        
        //Salida
        System.out.println("Sumatoria de impares desde 0 hasta " + x + ":");
        System.out.println(sum);
        
    }
    
    public void minmaxImpar(int x, int y) {
        
        int sumM = 0;
    
        //Sumatoria
        for (int i = x; i <= y; i++) {
            if (i % 2 !=0) {
                sumM = sumM + i;
            }
        }
        
        //Salida
        System.out.println("Sumatoria de impares desde " + x + " hasta " + y + ":");
        System.out.println(sumM);
    }

}
