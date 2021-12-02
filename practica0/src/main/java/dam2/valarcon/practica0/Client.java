package dam2.valarcon.practica0;

public class Client extends Persona {
	
	private String adreca;
	private String email;
	
	public Client(String dni, String nom, String cognom1, String cognom2, String adreca, String email) {
		super(dni, nom, cognom1, cognom2);
		this.adreca = adreca;
		this.email = email;
	}
	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return super.toString()+ "client [adreca=" + adreca + ", email=" + email + "]";
	}
	public boolean altaClient () {
		
		return false;
	}
	public boolean baixaClient () {
		
		return false;
	}
	public boolean modificaClient () {

		return false;
	}
}
