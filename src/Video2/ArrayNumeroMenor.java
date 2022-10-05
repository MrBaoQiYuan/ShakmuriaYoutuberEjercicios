package Video2;
import java.util.Scanner;
public class ArrayNumeroMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");

        int numeros []=new int[5];
        int numMenor;
        numMenor=numeros[0];


        for(int i = 0; i<numeros.length; i++) {

            numeros[i] = sc.nextInt();

            if(numeros[i]<=numMenor){
                numMenor = numeros[i];
            }
        }
        System.out.println("el numero menor es: " +numMenor);
    }
}
