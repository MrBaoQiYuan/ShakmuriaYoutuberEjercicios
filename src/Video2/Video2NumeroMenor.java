package Video2;
import java.util.Scanner;
public class Video2NumeroMenor {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe 5 numeros");

        int numeros []=new int[5];
        int numMenor=0;

        for(int i = 0; i<5; i++) {

            if(numMenor==0) {
                numeros[i] = numMenor;
                numMenor= sc.nextInt();
            }else if (numeros[i]<numMenor){
                numMenor = numeros[i];
            }
        }
        System.out.println("el numero menor es: " + numMenor);
    }
}
