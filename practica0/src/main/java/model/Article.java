package model;
import java.sql.*;

public class Article {
	
	private int id ;
	private String descripcio;
	private double preuCompra;
	private double preuVenda;
	
	
	
	
	public Article(int id, String descripcio, double preuCompra, double preuVenda) {
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
	public void consultarArticles(){
		
		try {
		Connection connexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/projecte","root","");
		// stm per aixi fer la consulta 
		Statement stm = connexio.createStatement();
		String sql="SELECT * FROM article ;";
		
		// per guardar el resultat de la consulta 
		// podriem posar encomptes de sql , la consulta aqui dintre 
		ResultSet rst = stm.executeQuery(sql);
		
		//recorre tot el resultat fins que termini amb el next
		while(rst.next()) {
			String descripcio = rst.getString("descripcio");
			double preuCompra = rst.getDouble("preuCompra");
			
			System.out.println("");
		}
		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
    public void insertArticles(){
		try {
		Connection connexio = DriverManager.getConnection("jdbc:mysql://localhost:3306/projecte","root","");
		// stm per aixi fer la consulta 
		Statement stm = connexio.createStatement();
		

		
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
