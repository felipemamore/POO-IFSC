package diagrama;

public abstract class Animal {
	
	private String nome;
	protected String classe;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	public void imprime() {
		
	}
	
	private void falar() {
		// TODO Auto-generated method stub

	}

}
