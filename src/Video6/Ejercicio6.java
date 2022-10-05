package Video6;
//crear programa que muestre la multiplicacion de los primeros 10 numeros impares.
//Primeros 10 numeros impares: 1,3,5,7,8,9,11,13,15,17,19.
public class Ejercicio6 {

    public static void main(String[] args) {

        int array[] = {1,3,5,7,9,11,13,15,17,19};
        long multi=1;

        for (int i = 0; i<array.length; i++){
            multi = multi * array[i];
        }
        System.out.println("el total de la multiplicacion de los primeros 10 numeros impares es: " + multi);
    }
}
