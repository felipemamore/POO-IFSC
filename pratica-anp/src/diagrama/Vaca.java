package diagrama;

public class Vaca extends Mamifero {
	private Boolean permiteOrdenha;

	public Vaca(String nome, String classe, Integer velocidade, Boolean permiteOrdenha) {
		
		
		super(nome, classe, velocidade);
		this.permiteOrdenha = permiteOrdenha;
		
		
	}
	
	public void ordenhar() {
		if(permiteOrdenha) {
			System.out.println("vaca sendo ordenhada");
		}
		else {
			System.out.println("Vaca não ordenhada");
		}
		
	}
	public void falar() {
		System.out.println("vaca muge: muuuu");
		
	}
	
	

}
