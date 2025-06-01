package atividade8;

import java.util.Scanner;

public class ContagemVogal {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Digite uma palavra: ");
    	String palavra = sc.nextLine().toLowerCase();
    	int i = 0, contador = 0;
    	while (i < palavra.length()) {
    	    char c = palavra.charAt(i);
    	    if ("aeiou".indexOf(c) != -1) contador++;
    	    i++;
    	}
    	System.out.println("Total de vogais: " + contador);
        
        sc.close();
    }
    
    
}
