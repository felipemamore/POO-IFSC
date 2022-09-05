package ex8;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        String[] vetor = new String[5];
        int tamanho;

        Scanner s = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = s.nextLine();

        }
        tamanho = java.lang.reflect.Array.getLength(vetor);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%s\n", vetor[i]);

        }

        if (vetor.length == 0) {
            System.out.println("Vetor está vazio");
        } else {
            System.out.println("Não está vazio");
        }

        System.out.printf("Tamanho do vetor: %s\n", tamanho);
        System.out.println("O ultimo elemento do vetor: " + vetor[vetor.length - 1]);

    }
}
