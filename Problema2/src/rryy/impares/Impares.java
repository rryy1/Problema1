package rryy.impares;

import java.util.Scanner;

/**
 *
 * @author rryy
 */
public class Impares {

    public static void main(String[] args) {

        Metodos imp = new Metodos();

        int numEntrada;
        int mEntrada_x, mEntrada_y;
        Scanner sc = new Scanner(System.in);

        //Entrada Parte 1
        System.out.println("Ingrese numero: ");
        numEntrada = (int) sc.nextInt();
        
        //Salida Parte 1
        imp.sumatoriaImpar(numEntrada);
        
        //Entrada Parte 2
        System.out.println("Ingrese numero minimo:");
        mEntrada_x = (int) sc.nextInt();
        System.out.println("Ingrese numero maximo:");
        mEntrada_y = (int) sc.nextInt();

        //Salida Parte 2
        imp.minmaxImpar(mEntrada_x, mEntrada_y);

    }

}
