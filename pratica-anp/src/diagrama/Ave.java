package diagrama;

public class Ave extends Animal{
	
	public Ave(String nome, String classe) {
		super.setNome(nome);
		super.setClasse(classe);
	}
	
	public void falar() {
		System.out.println("Testando metodo de fala: ");
		System.out.println("Ave não fala!!");
		
	}
	
	public void voar() {
		System.out.println("Testando metodo de voo");
		System.out.println("Aves voam");
		
		

	}

}
