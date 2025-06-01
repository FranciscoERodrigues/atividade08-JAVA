package atividade8;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int num = sc.nextInt();

        int contador = 0;

        while (contador <11){
            System.out.println(num+"X"+contador+"="+(num*contador));

            contador++;
        }
        
        sc.close();
    }
}
