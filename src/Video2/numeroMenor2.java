package Video2;
import java.util.Scanner;
public class numeroMenor2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");

        int numeros []=new int[5];
        int numMenor=0;

        for(int i = 0; i<numeros.length; i++) {

            numeros[i] = sc.nextInt();

            if (numMenor==0){
                numMenor = numeros[i];
            }
        }
        System.out.println("el numero menor es: " + numMenor);
    }
}


