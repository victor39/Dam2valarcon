package dam2.valarcon.practica0;

import java.util.ArrayList;

public class Tiquet {

	private int id;
	private ArrayList <LineaTicket> lineasticket = new ArrayList <LineaTicket>();
	private double total;
	
	
	public Tiquet(int id , double total) {
		super();
		this.id = id;
		this.total = total;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public ArrayList<LineaTicket> getLineasticket() {
		return lineasticket;
	}
	public void setLineasticket(ArrayList<LineaTicket> lineasticket) {
		this.lineasticket = lineasticket;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public void addTicket (LineaTicket lineasTicket ) {
		this.lineasticket.add(lineasTicket);	
	}
	public void delTicket (LineaTicket lineasTicket ) {
		this.lineasticket.remove(lineasTicket);	
	}
	@Override
	public String toString() {
		return  "tiquet [id=" + id + ", total=" + total + "]";
	}
	public boolean altaTicket () {
		
		return false;
	}
	public boolean baixaTicket () {
			
		return false;
	}
	public boolean modificaTicket () {

		return false;
	}
}
