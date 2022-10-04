package Video1.CopiaEjercicio1Youtube;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int ventas []=new int [5];
        System.out.println("Ingrese las ventas del mes");

        for (int i = 0; i < ventas.length; i++) {

            System.out.println("venta numero "  + (i+1));
            ventas [i] = input.nextInt();
        }

        int k=0;
        int total=0;

        System.out.println("Ventas de mas de 2k");
        while (k<5) {
            if (ventas[k] >= 2000) {
                System.out.println(ventas[k]);
                total++;
            }
            k++;
        }
        System.out.println("el total de ventas mayores a 2k es de: " + total);
    }
}
