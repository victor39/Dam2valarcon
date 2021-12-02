package dam2.valarcon.practica0;

public class Article {
	
	private int id ;
	private String descripcio;
	private double preuCompra;
	private double preuVenda;
	
	
	public Article(int id, String descripcio, double preuCompra, double preuVenda) {
		super();
		this.id = id;
		this.descripcio = descripcio;
		this.preuCompra = preuCompra;
		this.preuVenda = preuVenda;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public double getPreuCompra() {
		return preuCompra;
	}
	public void setPreuCompra(double preuCompra) {
		this.preuCompra = preuCompra;
	}
	public double getPreuVenda() {
		return preuVenda;
	}
	public void setPreuVenda(double preuVenda) {
		this.preuVenda = preuVenda;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", descripcio=" + descripcio + ", preuCompra=" + preuCompra + ", preuVenda="
				+ preuVenda + "]";
	}
}
