package poo;

public class MainAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cachorro cachorro = new Cachorro("Hades", "American Bully Micro", (float) 1.0, 4, "cinza","domestico");
		Gato gato = new Gato("pompeu", "siames", (float)0.60, 4, "cinza e preto", "domestico");
		
		System.out.println(cachorro.getNome());
		System.out.println(cachorro.getRaca());
		System.out.println(cachorro.getComprimento());
		System.out.println(cachorro.getnPatas());
		System.out.println(cachorro.getCor());
		System.out.println(cachorro.getEcossistema());
		cachorro.late();
		System.out.println("----------------------");
		System.out.println(gato.getNome());
		System.out.println(gato.getRaca());
		System.out.println(gato.getComprimento());
		System.out.println(gato.getnPatas());
		System.out.println(gato.getCor());
		System.out.println(gato.getEcossistema());
		gato.mia();
		

	}

}
