package dam2.valarcon.practica0;

import java.util.ArrayList;

public class Comanda  {
	
	private int numComanda;
	private Client client;
	private double total;
	private ArrayList <LineaComanda> liniesComanda;
	
	
<<<<<<< HEAD
	public Comanda(int numComanda, dam2.valarcon.practica0.Client client, double total) {
		super();
=======
	public Comanda(int numComanda, dam2.valarcon.practica0.Client client, double total,
			ArrayList<dam2.valarcon.practica0.LineaComanda> lineaComanda) {
>>>>>>> branch 'master' of git@github.com:victor39/Dam2valarcon.git
		this.numComanda = numComanda;
		this.client = client;
		this.total = total;
		this.liniesComanda = new ArrayList <LineaComanda>();
	}
	public int getNumComanda() {
		return numComanda;
	}
	public void setNumComanda(int numComanda) {
		this.numComanda = numComanda;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public ArrayList<LineaComanda> getLineaComanda() {
<<<<<<< HEAD
		return liniesComanda;
=======
		return lineaComanda; //ho comentarem a classe
>>>>>>> branch 'master' of git@github.com:victor39/Dam2valarcon.git
	}
	public void setLineaComanda(ArrayList<LineaComanda> lineaComanda) {
<<<<<<< HEAD
		this.liniesComanda = lineaComanda;
=======
		this.lineaComanda = lineaComanda;
	}
	@Override
	public String toString() {
		return "comanda [numComanda=" + numComanda + ", client=" + client + ", total=" + total + ", lineaComanda="
				+ lineaComanda + "]"; //??
>>>>>>> branch 'master' of git@github.com:victor39/Dam2valarcon.git
	}
	public boolean altaComanda () {
		
		return false;
	}
	public boolean baixaComanda () {
			
		return false;
	}
	public boolean modificaComanda () {

		return false;
	}
	@Override
	public String toString() {
		return "comanda [numComanda=" + numComanda + ", client=" + client + ", total=" + total + ", lineaComanda="
				+ liniesComanda + "]";
	}
	
	
}
