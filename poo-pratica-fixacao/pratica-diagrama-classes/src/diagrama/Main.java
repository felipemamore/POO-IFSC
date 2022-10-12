package diagrama;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente ("Novo Cliente",LocalDate.of(1997, 8, 1), "novocliente@javinha.com", 000001, (double)50000);
		Cliente cliente2 = new Cliente("Mais um novo cliente", LocalDate.of(1994, 5, 5), "MaisUmNoovoCliente@javinha.com", 0000002, (double)800000);
		Funcionario funcionario = new Funcionario("Novo funcionario", LocalDate.of(1997, 3, 8), "novofunc@javinha.com", 0000000001, LocalDate.of(2018, 12, 12));
		Funcionario funcionario2 = new Funcionario("Mais um Novo funcionario", LocalDate.of(1990, 3, 8), "MaisUmNovofunc@javinha.com", 0000000002, LocalDate.of(2020, 01, 9) );
		
		ArrayList<Cliente> arrayCliente = new ArrayList<>();
		ArrayList<Funcionario> arrayFuncionario = new ArrayList<>();
		
		
		
		
		
		arrayCliente.add(cliente);
		arrayCliente.add(cliente2);
		
		arrayFuncionario.add(funcionario);
		arrayFuncionario.add(funcionario2);
		
		
			System.out.println(cliente.getNome());
			System.out.println(cliente.getDataNasc());
			System.out.println(cliente.getEmail());
			System.out.println(cliente.getNrConta());
			System.out.println(cliente.mostrarSaldo());
			System.out.println("");
			System.out.println(cliente2.getNome());
			System.out.println(cliente2.getDataNasc());
			System.out.println(cliente2.getEmail());
			System.out.println(cliente2.getNrConta());
			System.out.println(cliente2.mostrarSaldo());
			System.out.println("");
			
		
		
		
			System.out.println(funcionario.getNome());
			System.out.println(funcionario.getDataNasc());
			System.out.println(funcionario.getEmail());
			System.out.println(funcionario.getNrRegistro());
			System.out.println(funcionario.getDataNasc());
			System.out.println("");
			System.out.println(funcionario2.getNome());
			System.out.println(funcionario2.getDataNasc());
			System.out.println(funcionario2.getEmail());
			System.out.println(funcionario2.getNrRegistro());
			System.out.println(funcionario2.getDataNasc());
			
			
		
		
		
		
		

	}

}
