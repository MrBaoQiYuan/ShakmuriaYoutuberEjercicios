package Video2;

import java.util.Scanner;

public class Video2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número entre 0 y 10:");
        int n = input.nextInt();
        int arrayNumeros[] = new int[n];

        for (int i = 0; i < n; i++) {

            System.out.println("inserte un numero en la posicion: " + i);

            int num;

            do{
                num = input.nextInt();

                if(!(num>=0 && num<=10)){
                    System.out.println("ERRORRRR!!! El numero debe estar entre 0 y 10");
                }

            }while(!(num>=0 && num<=10));

            arrayNumeros[i] = num;

        }

        for (int i = 0; i<arrayNumeros.length; i++) {

            System.out.println(arrayNumeros[i]);
        }
    }
}

