package rryy.solopares;

/**
 *
 * @author rryy
 */
public class Metodos {

    private final int parSize = 20;
    private final int[] pares = new int[parSize];

    public void llenarArray() {

        for (int i = 0; i < pares.length; i++) {
            pares[i] = (2 * i);
        }
    }

    public void mostrarPares(int x) {

        System.out.println("Primer(os) " + x + " numeros pares:");

        //Bucle para mostrar los n numeros pares
        for (int i = 0; i < x; i++) {
            System.out.println(pares[i]);
        }
    }

    public void mostrarParesPart2(int x) {

        System.out.println("Primer(os) " + x + " numeros pares sin incluir el 0:");

        //Bucle para mostrar los n numeros pares sin el 0
        for (int i = 0; i < x; i++) {
            System.out.println(pares[i + 1]);
        }
    }
}
