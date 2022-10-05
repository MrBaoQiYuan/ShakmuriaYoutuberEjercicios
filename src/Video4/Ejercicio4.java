package Video4;
//Crear un programa que se este pidiendo numeros enteros.
//Cuando un cero se haya introducido, finalizará el programa.
//sumar los numeros y mostrar la suma en pantalla.

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num;
        int suma=0;

        System.out.println("introduce un numero entero diferente a cero para finalizar la suma total");
        num=input.nextInt();

        while(num!=0){
            System.out.println("introduce otro numero mas");
            suma=suma+num;
            num=input.nextInt();

        }if(num==0){
            System.out.println("ejercicio finalizado");
        }

        System.out.println("la suma total es: " + suma);
    }
}
