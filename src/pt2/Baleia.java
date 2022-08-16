package pt2;


public class Baleia extends Animal {

	Baleia(){
		this.especie = "Baleia";
	}
	
	@Override
	public String Alimentar() {
		return this.especie + " Come " + "Krill";
	}
	
}
