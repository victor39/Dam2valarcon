package dam2.valarcon.practica0;

import java.util.ArrayList;

public class Botiga {
	
	private String identificador;
	private String adreca;
	private Magatzem magatzem;
	private ArrayList  <Venedor> personal ;
	
	
	public Botiga(String identificador, String adreca, Magatzem magatzem) {
		super();//??
		this.identificador = identificador;
		this.adreca = adreca;
		this.magatzem = magatzem;
		this.personal = new ArrayList <Venedor>();
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	public Magatzem getMagatzem() {
		return magatzem;
	}
	public void setMagatzem(Magatzem magatzem) {
		this.magatzem = magatzem;
	}
	public ArrayList<Venedor> getPersonal() {
		return personal;
	}
	public void setPersonal(ArrayList<Venedor> personal) {
		this.personal = personal;
	}
	public void addPersonal( Venedor venedor) {
		this.personal.add(venedor);
	}
	public void delPersonal (Venedor venedor){
		this.personal.remove(venedor);
	}
	@Override
	public String toString() {
		return  "botiga [identificador=" + identificador + ", adreca=" + adreca + ", magatzem=" + magatzem + "]";
	}
	
	
	
}

