package dam2.valarcon.practica0;

public class Magatzem {
	
	private int codi;
	private String descripcio;
	private String adreca;
	
	
	public Magatzem(int codi, String descripcio, String adreca) {
		super();
		this.codi = codi;
		this.descripcio = descripcio;
		this.adreca = adreca;
	}
	public int getCodi() {
		return codi;
	}
	public void setCodi(int codi) {
		this.codi = codi;
	}
	public String getDescripcio() {
		return descripcio;
	}
	public void setDescripcio(String descripcio) {
		this.descripcio = descripcio;
	}
	public String getAdreca() {
		return adreca;
	}
	public void setAdreca(String adreca) {
		this.adreca = adreca;
	}
	@Override
	public String toString() {
		return  "magatzem [codi=" + codi + ", descripcio=" + descripcio + ", adreca=" + adreca + "]";
	}
	public boolean altaMagatzem () {
			
		return false;
	}
	public boolean baixaMagatzem () {
			
		return false;
	}
	public boolean modificaMagatzem () {

		return false;
	}

}
