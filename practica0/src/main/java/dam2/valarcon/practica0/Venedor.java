package dam2.valarcon.practica0;

public class Venedor extends Persona {

	
	public Venedor(String dni, String nom, String cognom1, String cognom2) {
		super(dni, nom, cognom1, cognom2);
	}

	@Override
	public String toString() {
		return super.toString() ;
	}
    public boolean altaTreballador () {
		
		return false;
	}
	public boolean baixaTreballador () {
		
		return false;
	}
	public boolean modificaTreballador () {

		return false;
	}
}
