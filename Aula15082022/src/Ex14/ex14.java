package ex14;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        double[] notas = new double[3];
        double media = 0;

        System.out.println("Digite o nome do aluno: ");
        Scanner nome = new Scanner(System.in);
        nome.nextLine();
        System.out.println("Digite as notas: ");
        Scanner nota = new Scanner(System.in);

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Integer.valueOf(nota.nextLine());
            if (notas[i] <= 0) {
                System.out.println("Valor invalido!!!");
                i--;
            }
        }
        media = calculaMedia(notas);
        if (media >= 6) {
            System.out.printf("Aluno aprovado !!\nMedia final: %.2f", media);

        } else if (media >= 4) {
            System.out.printf("Aluno em recuperaçao !!\nMedia final: %.2f", media);
        } else {
            System.out.printf("Aluno reprovado!!\nMedia final: %.2f", media) ;
    }

    }

    public static double calculaMedia(double[] notas) {
        int soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }
        return soma / notas.length;

    }
}
