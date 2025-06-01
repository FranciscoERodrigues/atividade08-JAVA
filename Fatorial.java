package atividade8;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite um número: ");
    	int numero = sc.nextInt();
    	int fatorial = 1;
    	while (numero > 1) {
    	    fatorial *= numero;
    	    numero--;
    	}
    	System.out.println("Fatorial: " + fatorial);
        
        sc.close();
    }
}
