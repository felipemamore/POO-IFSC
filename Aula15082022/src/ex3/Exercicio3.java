package ex3;

import java.util.Scanner;

public class Exercicio3 {
public static Double calculaLitros(Double pLitro, Double qtde) {
		
		if (pLitro == 0) {
			System.out.println("Valor nulo invalido!!");
		}
		else if (qtde == 0) {
			System.out.println("Valor nulo invalido");
		}

		return pLitro * qtde;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do litro");
		Double valor = Double.valueOf(scan.nextLine());
		System.out.println("digite a qtde de litros");
		Double qtde = Double.valueOf(scan.nextLine());

		System.out.println(calculaLitros(valor, qtde));

	}


}
