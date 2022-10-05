package Video2;
//Saber cual es el numero mayor de 5 numeros.
import java.util.Scanner;
public class Video2numeroMayor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");

        int numeros []=new int[5];

        int numMayor=numeros[0];

        for(int i = 0; i<numeros.length; i++) {
            numeros[i] = sc.nextInt();

            if(numeros[i]>numMayor){
                numMayor = numeros[i];
            }
        }

        System.out.println("el numero mayor es: " + numMayor);

    }
}
