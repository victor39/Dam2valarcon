package dam2.valarcon.practica0;


public class roba extends Article{

	String talla;
	String marca;
	
	
	public roba(int id, String descripcio, double preuCompra, double preuVenda, String talla, String marca) {
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
	
	
}
