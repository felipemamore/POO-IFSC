package poo;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		int cont=0;
		

		Scanner op = new Scanner(System.in);
		Scanner leitura = new Scanner(System.in);

		ArrayList<Pessoa> lista = new ArrayList<>();
		Pessoa p = new Pessoa();
		p.setNome("Felipe");
		p.setCpf(1234567);
		p.setIdade(25);
		lista.add(p);

		Pessoa p2 = new Pessoa();
		p2.setNome("Javinha do grau");
		p2.setCpf(666666);
		p2.setIdade(999999);
		lista.add(p2);

		Pessoa p3 = new Pessoa();
		p3.setNome("Python colorido");
		p3.setCpf(557676766);
		p3.setIdade(2222);
		lista.add(p3);

		for (Pessoa pLista : lista) {
			System.out.println(pLista.getNome());
			System.out.println(pLista.getCpf());
			System.out.println(pLista.getIdade());
		}

		
		System.out.println("Digite uma op�ao valida !");
		
		int opcao = Integer.valueOf(op.nextLine());

		while (opcao != 0) {
		System.out.print("|-----------------------------|\n");
		System.out.print("| Opção 0 - Sair    			|\n");
		System.out.print("| Opção 1 - Cadastrar         |\n");
		System.out.print("| Opção 2 - Atualizar         |\n");
		System.out.print("| Opção 3 - Listar            |\n");
		System.out.print("|-----------------------------|\n");
		System.out.println("Digite uma op�ao valida !");
		opcao = Integer.valueOf(op.nextLine());
		
		
			

			switch (opcao) {
				
				
				
				case 1:
				
					Pessoa p4 = new Pessoa();
					System.out.println("Novo cadastro:\n");
					System.out.println("Digite o nome da pessoa: ");
					p4.nome = leitura.nextLine();
					p4.setNome(p4.nome);
					System.out.println("Digite o CPF da pessoa: ");
					p4.cpf = Integer.valueOf(leitura.nextLine());
					p4.setCpf(p4.cpf);
					System.out.println("Digite a idade da pessoa: ");
					p4.cpf = Integer.valueOf(leitura.nextLine());
					p4.setIdade(p4.idade);
					lista.add(p4);
					
					
					break;
				case 2:

					System.out.println("Atualizar um cadastro: \n");
					System.out.println("Escolha um dos cadastros a atualizar: \n");
					for (Pessoa pLista : lista) {
						System.out.println(pLista.getNome());
						System.out.println(pLista.getCpf());
						System.out.println(pLista.getIdade());
						break;
					}
				case 3: 
				for (Pessoa pp : lista) {
						System.out.println(pp.getNome());
						System.out.println(pp.getCpf());
						System.out.println(pp.getIdade());
						break;
					
				}

				default:
					System.out.println("opcao invalida!!!");
			}
		}

}

}
