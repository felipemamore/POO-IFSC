package poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		
		ArrayList<Professor> listaProfessor = new ArrayList<Professor>();
		ArrayList<Aluno> listaAluno = new ArrayList<Aluno>();
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			Professor p = new Professor();
			System.out.println("Digite o nome do profe: ");
			p.setNome(ler.nextLine());
			System.out.println("Data de nascimento: ");
			p.setDataNasc(LocalDate.of(Integer.valueOf(ler.nextLine()), Integer.valueOf(ler.nextLine()),
					Integer.valueOf(ler.nextLine())));
			System.out.println("Digite o cpf: ");
			p.setCpf(Long.valueOf(ler.nextLine()));
			System.out.println("Digite o Siape: ");
			p.setSiape(Long.valueOf(ler.nextLine()));
			listaProfessor.add(p);

		}

		for (int i = 0; i < 3; i++) {
			Aluno a = new Aluno();
			System.out.println("Digite o nome do aluno: ");
			a.setNome(ler.nextLine());
			System.out.println("Data de nascimento: ");
			a.setDataNasc(LocalDate.of(Integer.valueOf(ler.nextLine()), Integer.valueOf(ler.nextLine()),
					Integer.valueOf(ler.nextLine())));
			System.out.println("Digite o cpf ");
			a.setCpf(Long.valueOf(ler.nextLine()));
			System.out.println("Digite a matricula: ");
			a.setMatricula(Long.valueOf(ler.nextLine()));
			listaAluno.add(a);

		}
		for (Professor professor : listaProfessor) {
			
			System.out.println(professor.getNome());
			System.out.println(professor.getCpf());
			System.out.println(professor.getDataNasc());
			System.out.println(professor.getSiape());
			
			
		}
		
		for (Aluno aluno : listaAluno) {
			System.out.println(aluno.getNome());
			System.out.println(aluno.getCpf());
			System.out.println(aluno.getDataNasc());
			System.out.println(aluno.getMatricula());
			
		}

	}

}
