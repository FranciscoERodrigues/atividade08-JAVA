package atividade8;

import java.util.Scanner;

public class Secreto {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int secreto = (int)(Math.random() * 10) + 1;
    	int chute = 0;
    	while (chute != secreto) {
    	    System.out.print("Adivinhe o número (1-10): ");
    	    chute = sc.nextInt();
    	}
    	System.out.println("Você acertou."); 
        
        sc.close();
    }
    
}
