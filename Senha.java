package atividade8;

import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senha = "Chico";
        String tentativa;
        do {
            System.out.print("Digite a senha: ");
            tentativa = sc.nextLine();
        } while (!tentativa.equals(senha));
        System.out.println("Senha correta !!!!");
        
        sc.close();
    }
}
