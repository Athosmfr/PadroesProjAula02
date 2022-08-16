package pt2;

public class Cachorro extends Animal {

	Cachorro(){
		this.especie = "Cachorro";
	}
	
	@Override
	public String Alimentar() {
		return this.especie + " Come " + "Ração";
	}
	
}
