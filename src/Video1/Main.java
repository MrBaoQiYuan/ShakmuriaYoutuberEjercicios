package Video1;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] ventas = new int[5];
        int num;

        for (int i = 0; i < ventas.length; i++) {
            num = input.nextInt();
            System.out.println("Introduce la venta " + (i + 1));
            ventas[i] = num;


            int j = 0;
            int total = 0;

            System.out.println("ventas mayores a 2k");
            while (i <= 0) {
                ventas[i] = num;
                if (ventas[i] >= 2000) {
                    System.out.println(ventas[j]);
                    total++;
                }
                j++;
            }


            System.out.println("el total de ventas mayores a 2k es de: " + total);
        }


    }
}


