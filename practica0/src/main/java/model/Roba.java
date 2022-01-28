package model;


public class Roba extends Article{

	private String talla;
	private String marca;
	
	
	public Roba(int id, String descripcio, double preuCompra, double preuVenda, String talla, String marca) {
		super(id, descripcio, preuCompra, preuVenda);
		this.talla = talla;
		this.marca = marca;
	}
	public String getTalla() {
		return talla;
	}
	public void setTalla(String talla) {
		this.talla = talla;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return super.toString() +  "roba [talla=" + talla + ", marca=" + marca + "]";
	}
	public boolean altaRoba () {
		
		return false;
	}
	public boolean baixaRoba () {
		
		return false;
	}
	public boolean modificaRoba () {

		return false;
	}
	
	
}
