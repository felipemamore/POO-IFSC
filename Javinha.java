package poo01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Javinha {

	public static void main(String[] args) {
		
//		Scanner leitura = new Scanner(System.in);
//		
//		System.out.println("Informe algo");
//		
//		String leiaStr = leitura.nextLine();
//		
//		System.out.println(leiaStr);
//		
//		leitura.close();
		
		  List<String> lista = new ArrayList<>();
		  lista.add("Felipe");
		  lista.add("eh meu nome");
		  
		  
		  
//		  System.out.println(lista.size()); //tamanho da lista
//		  System.out.println(lista.isEmpty()); //lista vazia ?
//		  System.out.println(lista.toString()); // exibir conteudo da lista de uma só vez
		  
//		  for (String str : lista) {
//			  System.out.println(str);
//		  }
		  
//		  for (int i=0; i<lista.size(); i++) {
//			  System.out.println(lista.get(i));
//		  }
		  
		  int contador = 0;
		  while(contador < lista.size()) {
			  System.out.println(contador);
			  contador++;
		  }
