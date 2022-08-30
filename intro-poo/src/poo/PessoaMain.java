package poo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PessoaMain {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int op;
		List<Pessoa>lista = new ArrayList<>();
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
			
		System.out.println("Digite uma opçao valida !");
		s.nextLine();
		
		while (op!=0) {
			
		}
		
			
		}
	}

}
