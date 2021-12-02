package dam2.valarcon.practica0;

public class Bicicleta extends Article{
	
	private String talla;
	private int midaRoda;
	private int numPinyons;
	private String color;
	private String marca;
	private String model;
	
	public Bicicleta(int id, String descripcio, double preuCompra, double preuVenda, String talla, int midaRoda,
			int numPinyons, String color, String marca, String model) {
		super(id, descripcio, preuCompra, preuVenda);
		this.talla = talla;
		this.midaRoda = midaRoda;
		this.numPinyons = numPinyons;
		this.color = color;
		this.marca = marca;
		this.model = model;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public int getMidaRoda() {
		return midaRoda;
	}
	public void setMidaRoda(int midaRoda) {
		this.midaRoda = midaRoda;
	}
	public int getNumPinyons() {
		return numPinyons;
	}
	public void setNumPinyons(int numPinyons) {
		this.numPinyons = numPinyons;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public boolean altaBicleta () {
	
		return false;
	}
	public boolean baixaBicicleta () {
		
		return false;
	}
	public boolean modificaBicicleta () {
		
		return false;
	}
	@Override
	public String toString() {
		return super.toString() + "Bicicleta [talla=" + talla + ", midaRoda=" + midaRoda + ", numPinyons=" + numPinyons + ", color="
				+ color + ", marca=" + marca + ", model=" + model + "]";
	}

}
