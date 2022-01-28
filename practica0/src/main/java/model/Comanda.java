package model;

import java.util.ArrayList;

public class Comanda  {
	
	private int numComanda;
	private Client client;
	private double total;
	private ArrayList <LineaComanda> liniesComanda;
	
	
	public Comanda(int numComanda, model.Client client, double total,
			ArrayList<model.LineaComanda> lineaComanda) {
		
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
		return liniesComanda;
	}
	public void setLineaComanda(ArrayList<LineaComanda> lineaComanda) {

		this.liniesComanda = lineaComanda;
	}
	@Override
	public String toString() {
		return "comanda [numComanda=" + numComanda + ", client=" + client + ", total=" + total + ", lineaComanda="
				+ liniesComanda + "]"; //??

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
