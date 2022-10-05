package Video3;

import java.util.Scanner;

// Cada pieza de pan tiene un precio de 5 euros.
// Si el cliente compra mas de 50 unidades, le costara 4,50.
// Si el cliente compra mas de 100 unidades, le costara 4,00.
// Programa que pida capturar la cantidad de piezas que el cliente compró y el total que pagará.
public class Ejecicio3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("¿Cuantos panes piensa comprar?");
        int cantidadPanes = input.nextInt();

        if (cantidadPanes <=50) {
            System.out.println("El cliente ha comprado menos de 50 panes. Le costara 5 euros el pan. Pagará " +
                    (cantidadPanes * 5) + "euros");

        }else if(cantidadPanes >50 && cantidadPanes<=100) {
            System.out.println("El cliente ha comprado entre 50 y 100 panes. Le costara 4.5 euros el pan. Pagará " +
                    (cantidadPanes * 4.5) + "euros");

        }else{
            System.out.println("El cliente ha comprado mas de 100 panes. Le costara 4 euros el pan. Pagará " +
                    (cantidadPanes * 4) + "euros");
        }
    }
}
