package model;

public class Supervisor extends Venedor{
	
	Botiga botiga;
	int telefon;
	
	public Supervisor(String dni, String nom, String cognom1, String cognom2, Botiga botiga, int telefon) {
		super(dni, nom, cognom1, cognom2);
		this.botiga = botiga;
		this.telefon = telefon;
	}
	public Botiga getBotiga() {
		return botiga;
	}
	public void setBotiga(Botiga botiga) {
		this.botiga = botiga;
	}
	public int getTelefon() {
		return telefon;
	}
	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}
	@Override
	public String toString() {
		return super.toString()+ "supervisor [Botiga=" + botiga + ", telefon=" + telefon + "]";
	}
	@Override
	 public boolean altaTreballador () {
			
			return false;
	}
	@Override
	public boolean baixaTreballador () {
			
		return false;
	}
	@Override
	public boolean modificaTreballador () {

		return false;
	}
}
