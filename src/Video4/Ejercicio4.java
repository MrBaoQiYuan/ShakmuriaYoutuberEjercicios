package Video4;
//Crear programa que nos pida capturar numeros positivos.
//Calcular la media de esos numeros.
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int contador=0;
        int suma=0;
        int num=0;
        double media=0;

        System.out.println("introduce un numero mayor que cero. si quieres parar el ejercicio escribe 0");
        num=input.nextInt();

        while (num>0) {

            suma = suma + num;
            contador++;
            System.out.println("Introduce un numero");
            num = input.nextInt();
        }

            if(contador==0){
                System.out.println("NUMERO MENOR QUE 0");

            }else{
                media=suma/contador;
                System.out.println("la suma de todos los numeros es de: " + suma);
                System.out.println("la media de los numeros introducidos es de: " + media);

        }
    }
}
