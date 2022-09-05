package ex7;

import java.util.Collections;
import java.util.Scanner;

/**
 * Exercicio7
 */
public class Exercicio7 {

    public static void main(String[] args) {
        int[] lista;
        lista = new int[10];
        int aux;
        Scanner lerNum = new Scanner(System.in);

        for (int i = 0; i < lista.length; i++) {
            lista[i] = lerNum.nextInt();

        }
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Numeros cadastrados: %d \n", lista[i]);

        }

        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] < lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;

                }

            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Numeros ordenados crescentes: %d\n", lista[i]);
            
        }
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista.length; j++) {
                if (lista[i] > lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;

                }

            }

        }
        for (int i = 0; i < lista.length; i++) {
            System.out.printf("Numeros ordenados decrescentes: %d\n", lista[i]);
        }

    }
}