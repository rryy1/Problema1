package rryy.fibonacci;

/**
 *
 * @author rryy
 */
public class Metodos {

    public void algoritmoFibo(int x) {

        int numA = 0;
        int numB = 1;
        int numC;

        System.out.println("Secuencia fibonacci de " + x + " elementos:");

        for (int i = 0; i < x; i++) {
            //print primer numero
            System.out.println(numA);

            //cambio de numeros
            numC = numA + numB;
            numA = numB;
            numB = numC;

        }

    }

}
