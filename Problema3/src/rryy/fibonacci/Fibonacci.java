package rryy.fibonacci;

import java.util.Scanner;

/**
 *
 * @author rryy
 */
public class Fibonacci {

    public static void main(String[] args) {
        
        //Instancia clase metodos
        Metodos fib = new Metodos();

        int numEntrada;
        Scanner sc = new Scanner(System.in);

        //Entrada
        System.out.println("Ingrese numero:");
        numEntrada = sc.nextInt();

        //Salida
        fib.algoritmoFibo(numEntrada);
   
    }

}
