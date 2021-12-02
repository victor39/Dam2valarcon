package dam2.valarcon.practica0;


public class Factura extends Tiquet{
	
	private Client client;
	

	public Factura(int id , double total, Client client) {
		super(id, total);
		this.client = client;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return super.toString() + "factura [client=" + client + "]";
	}
	@Override
	public boolean altaTicket () {
		
		return false;
	}
	@Override
	public boolean baixaTicket () {
			
		return false;
	}
	@Override
	public boolean modificaTicket () {

		return false;
	}
}
