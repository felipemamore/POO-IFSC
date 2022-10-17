package diagrama;

import java.util.ArrayList;

public class MainAninal {

	public static void main(String[] args) {
		
		
		BemTeVi bemTeVi = new BemTeVi("novo bem-te-vi", "ave");
		Papagaio papagaio = new Papagaio("louro", "Papagaio", "Louro, louro");
		Vaca vaca = new Vaca("mimosa", "Vaca", 20, true);
		Cachorro cachorro = new Cachorro ("rex", "Cachorro", 30, true);
		
		
		ArrayList<BemTeVi>arrayBemTeVi = new ArrayList<>();
		ArrayList<Papagaio>arrayPapagaio = new ArrayList<>();
		ArrayList<Vaca>arrayVaca = new ArrayList<>();
		ArrayList<Cachorro>arrayCachorro = new ArrayList<>();
		
		
		arrayBemTeVi.add(bemTeVi);
		arrayPapagaio.add(papagaio);
		arrayVaca.add(vaca);
		arrayCachorro.add(cachorro);
		
		System.out.println(bemTeVi.getNome());
		System.out.println(bemTeVi.getClasse());
		bemTeVi.falar();
		
		System.out.println(papagaio.getNome());
		System.out.println(papagaio.getClasse());
		papagaio.falar();
		
		System.out.println(vaca.getNome());
		System.out.println(vaca.getClasse());
		vaca.correr();
		vaca.ordenhar();
		vaca.falar();
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getClasse());
		cachorro.correr();
		cachorro.falar();
		
		
		

	}

}
