package Video5;

import java.util.Scanner;

public class Ejercicio5Copiado {

    public static void main(String[] args) {
        int num=0, suma=0, cantidadNumeros=0;
        double media=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce un numero");
        num=sc.nextInt();

        while(num>0){
            suma=suma+num;
            cantidadNumeros++;
            System.out.println("introduce otro numero:");
            num=sc.nextInt();
        }

        if(cantidadNumeros==0){
            System.out.println("datos erroneos");
        }else{
            media=suma/cantidadNumeros;
            System.out.println("la media es:" + media);
            System.out.println("la suma total es:" + suma);
        }
    }
}
