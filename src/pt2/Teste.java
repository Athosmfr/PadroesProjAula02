package pt2;

public class Teste {

	public static void main(String[] args) {
		
		//Classe Base
		Animal teste = new Animal();
		System.out.println(teste.Alimentar());
		
		//Classe Especializada
		Cachorro teste2 = new Cachorro();
		//System.out.println(teste2.especie);
		System.out.println(teste2.Alimentar());
		
		//Classe Especializada
		Baleia teste3 = new Baleia();
		//System.out.println(teste3.especie);
		System.out.println(teste3.Alimentar());
		
	}
	
}
