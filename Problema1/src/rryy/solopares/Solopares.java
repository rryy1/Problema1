package rryy.solopares;

import java.util.Scanner;

/**
 *
 * @author rryy
 */

public class Solopares {

    public static void main(String[] args) {
        
        Metodos numPar = new Metodos();
        
        int numEntrada;    
        Scanner sc = new Scanner(System.in); //Lector de ingreso de datos
        
        //Entrada
        System.out.println("Ingrese numero:");  
        numEntrada = (int) sc.nextInt();
        
        //Salida
        numPar.llenarArray();
        numPar.mostrarPares(numEntrada);
        numPar.mostrarParesPart2(numEntrada);
    }
    
}
