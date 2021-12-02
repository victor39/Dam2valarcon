package dam2.valarcon.practica0;

public class Passeig extends Bicicleta{
	
	private int numPlats;
	
	public Passeig(int id, String descripcio, double preuCompra, double preuVenda, String talla, int midaRoda,
			int numPinyons, String color, String marca, String model, int numPlats) {
		super(id, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, marca, model);
		this.numPlats = numPlats;
	}
	public int getNumPlats() {
		return numPlats;
	}
	public void setNumPlats(int numPlats) {
		this.numPlats = numPlats;
	}
	@Override
	public boolean altaBicleta () {
	
		return false;
	}
	@Override
	public boolean baixaBicicleta () {
		
		return false;
	}
	@Override
	public boolean modificaBicicleta () {
		
		return false;
	}
	@Override
	public String toString() {
		return super.toString() +  "passeig [numPlats=" + numPlats + "]";
	}
}
