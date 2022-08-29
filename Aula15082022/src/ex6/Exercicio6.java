package ex6;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {
        Scanner lerSal = new Scanner(System.in);

        int[] salario;
        int aux;
        salario = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite o salario:");
            salario[i] = lerSal.nextInt();

        }
        

        for (int i = 0; i < 3; i++) {
            aux = salario[i];
            
            if (aux>salario[i]) {
                aux = salario[i];

            }
            System.out.printf("salario[%d]= %d\n", i, aux);
        }

       /*  Arrays.sort(salario);
        for (int salarios : salario)
            System.out.println(salarios);
        System.out.println();

        System.out.println("\n"); */

        /*
         * for (int i = 0; i < 3; i++) {
            aux = salario[i];
            
            if (aux > salario[i]) {
                aux = salario[i];

            }
            System.out.printf("salario[%d]= %d\n", i, aux);
        }
         * 
         * }
         */
        
    }

}
