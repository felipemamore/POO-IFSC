package diagrama;

public class Mamifero extends Animal {
	private Integer velocidade;
	public Mamifero (String nome, String classe, Integer velocidade ) {
		super.setNome(nome);
		super.setClasse(classe);
		this.velocidade = velocidade;
		
	}
	
	public void correr() {
		if(this.velocidade > 0) {
			System.out.println("Mamifero corredor");
		}
		else {
			System.out.println("Mamifero nao corredor");
		}

	}
	
	

}
