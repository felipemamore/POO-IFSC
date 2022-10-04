package poo;

public class Gato extends Animal {
	public Gato(String nome, String raca, Float comprimento, 
			Integer nPatas, String cor, String ecossistema
			) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setnPatas(nPatas);
		super.setCor(cor);
		super.setEcossistema(ecossistema);
		
	}
	public void mia() {
		System.out.println("O gato mia: miau");
		
	}

}
