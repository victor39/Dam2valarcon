package model;

public class Btt extends Bicicleta{

	private int numPlats;
	private int tipusSuspensio;
	
	public Btt(int id, String descripcio, double preuCompra, double preuVenda, String talla, int midaRoda,
			int numPinyons, String color, String marca, String model, int numPlats, int tipusSuspensio) {
		super(id, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, marca, model);
		this.numPlats = numPlats;
		this.tipusSuspensio = tipusSuspensio;
	}
	public int getNumPlats() {
		return numPlats;
	}
	public void setNumPlats(int numPlats) {
		this.numPlats = numPlats;
	}
	public int getTipusSuspensio() {
		return tipusSuspensio;
	}
	public void setTipusSuspensio(int tipusSuspensio) {
		this.tipusSuspensio = tipusSuspensio;
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
		return super.toString() + "btt [numPlats=" + numPlats + ", tipusSuspensio=" + tipusSuspensio + "]";
	}
}
