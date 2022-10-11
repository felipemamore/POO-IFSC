package diagrama;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente ("Novo Cliente",LocalDate.of(1997, 8, 1), "novocliente@javinha.com", 000001, (double)50000);
		Cliente cliente2 = new Cliente("Mais um novo cliente", LocalDate.of(1994, 5, 5), "MaisUmNoovoCliente@javinha.com", 0000002, (double)800000);
		Funcionario funcionario = new Funcionario("Novo funcionario", LocalDate.of(1997, 3, 8), "novofunc@javinha.com");
		Funcionario funcionario2 = new Funcionario("Mais um Novo funcionario", LocalDate.of(1990, 3, 8), "MaisUmNovofunc@javinha.com");
		
		ArrayList<Cliente> arrayCliente = new ArrayList<>();
		ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
		
		
		
		
		
		arrayCliente.add(cliente);
		arrayCliente.add(cliente2);
		
		arrayFuncionario.add(funcionario);
		arrayFuncionario.add(funcionario2);
		
		for (int i = 0; i < arrayCliente.size(); i++) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getDataNasc());
			System.out.println(cliente.getEmail());
			System.out.println(cliente.getNrConta());
			System.out.println(cliente.mostrarSaldo());
			System.out.println(cliente2.getNome());
			System.out.println(cliente2.getDataNasc());
			System.out.println(cliente2.getEmail());
			
		}
		
		for (int i = 0; i < arrayFuncionario.size(); i++) {
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getDataNasc());
			System.out.println(funcionario.getEmail());
			System.out.println(funcionario2.getNome());
			System.out.println(funcionario2.getDataNasc());
			System.out.println(funcionario2.getEmail());
			
			
		}
		
		
		
		

	}

}
