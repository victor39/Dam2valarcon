package model;

import java.util.ArrayList;

public class Component extends Article {
	
	ArrayList <Bicicleta> compatibilitat = new ArrayList <Bicicleta>();

	public Component(int id, String descripcio, double preuCompra, double preuVenda) {
		super(id, descripcio, preuCompra, preuVenda);
	}
	public ArrayList<Bicicleta> getCompatibilitat() {
		return compatibilitat;
	}
	public void setCompatibilitat(ArrayList<Bicicleta> compatibilitat) {
		this.compatibilitat = compatibilitat;
	}
	public void addCompatibilitat (Bicicleta compatibilitat  ) {
		this.compatibilitat.add(compatibilitat);	
	}
	public void delCompatibilitat (Bicicleta compatibilitat  ) {
		this.compatibilitat.remove(compatibilitat);	
	}
	@Override
	public String toString() {
		return toString();
	}
	public boolean altaComponent () {
		
		return false;
	}
	public boolean baixaComponent () {
		
		return false;
	}
	public boolean modificaComponent () {

		return false;
	}
	
}
