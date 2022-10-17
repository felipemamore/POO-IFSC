package diagrama;

public class Papagaio extends Ave {
	
	private String vocabulario;

	public Papagaio(String nome, String classe, String vocabulario) {
		super(nome, classe);
		this.vocabulario = vocabulario;
		
	}
	
	public void falar() {
		System.out.println(vocabulario);
		

	}

	public void setVocabulario(String vocabulario) {
		this.vocabulario = vocabulario;
	}
	

}
