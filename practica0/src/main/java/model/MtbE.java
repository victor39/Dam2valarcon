package model;

public class MtbE extends Btt{
	
	private int potenciaMotor;
	private int pesBateria;
	private int autonomia;
	
	
	public MtbE(int id, String descripcio, double preuCompra, double preuVenda, String talla, int midaRoda,
			int numPinyons, String color, String marca, String model, int numPlats, int tipusSuspensio,
			int potenciaMotor, int pesBateria, int autonomia) {
		super(id, descripcio, preuCompra, preuVenda, talla, midaRoda, numPinyons, color, marca, model, numPlats,
				tipusSuspensio);
		this.potenciaMotor = potenciaMotor;
		this.pesBateria = pesBateria;
		this.autonomia = autonomia;
	}
	public int getPotenciaMotor() {
		return potenciaMotor;
	}
	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}
	public int getPesBateria() {
		return pesBateria;
	}
	public void setPesBateria(int pesBateria) {
		this.pesBateria = pesBateria;
	}
	public int getAutonomia() {
		return autonomia;
	}
	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
	@Override
	public boolean altaBicleta () {
	
		return false;
	}
	@Override
	public boolean baixaBicicleta () {
		
		return false;
	}
	@Override
	public boolean modificaBicicleta () {
		
		return false;
	}
	@Override
	public String toString() {
		return super.toString()+ "mtbE [potenciaMotor=" + potenciaMotor + ", pesBateria=" + pesBateria + ", autonomia=" + autonomia + "]";
	}
	
	
	

}
