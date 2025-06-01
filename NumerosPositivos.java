package atividade8;

import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int soma = 0;
		int numero;
		do {
		    System.out.print("Digite um número positivo (ou negativo para sair): ");
		    numero = sc.nextInt();
		    if (numero >= 0) soma += numero;
		} while (numero >= 0);
		System.out.println("Soma total: " + soma);

		
sc.close();
	}

}
