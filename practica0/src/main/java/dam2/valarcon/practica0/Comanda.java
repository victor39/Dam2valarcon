package dam2.valarcon.practica0;

import java.util.ArrayList;

public class Comanda  {
	
	private int numComanda;
	private Client client;
	private double total;
	private ArrayList <LineaComanda> lineaComanda = new ArrayList <LineaComanda>();
	
	
	public Comanda(int numComanda, dam2.valarcon.practica0.Client client, double total,
			ArrayList<dam2.valarcon.practica0.LineaComanda> lineaComanda) {
		super();
		this.numComanda = numComanda;
		this.client = client;
		this.total = total;
		this.lineaComanda = lineaComanda;
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
		return lineaComanda;
	}
	public void setLineaComanda(ArrayList<LineaComanda> lineaComanda) {
		this.lineaComanda = lineaComanda;
	}
	@Override
	public String toString() {
		return "comanda [numComanda=" + numComanda + ", client=" + client + ", total=" + total + ", lineaComanda="
				+ lineaComanda + "]";
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
	
}
