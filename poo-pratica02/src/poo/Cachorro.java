package poo;

public class Cachorro extends Animal {
	public Cachorro(String nome, String raca, Float comprimento, 
			Integer nPatas, String cor, String ecossistema) {
		super.setNome(nome);
		super.setRaca(raca);
		super.setComprimento(comprimento);
		super.setnPatas(nPatas);
		super.setCor(cor);
		super.setEcossistema(ecossistema);
	}
	public void late() {
		System.out.println("o o Cachorro late: auau");
		
	}
	

}
