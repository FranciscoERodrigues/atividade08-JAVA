package atividade8;

import java.util.Scanner;

public class MediaNota {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int count = 0;
        double soma = 0;
        while (true) {
            System.out.print("Digite uma nota (0 a 10): ");
            double nota = sc.nextDouble();
            if (nota < 0 || nota > 10) break;
            soma += nota;
            count++;
        }
        if (count > 0) {
            double media = soma / count;
            System.out.println("Média: " + media);
        } else {
            System.out.println("Nenhuma nota válida foi inserida.");
        }
    sc.close();
}
}
