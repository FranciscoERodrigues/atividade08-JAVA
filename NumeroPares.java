package atividade8;

import java.util.Scanner;

public class NumeroPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 2;

        while (numero <= 20) {
            System.out.println(numero);
            numero = numero + 2;
        }
        sc.close();

    }
}
