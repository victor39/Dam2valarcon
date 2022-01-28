package model;


public class LineaTicket {
	
	private int codiLinea;
	private Tiquet tiquet;
	private Article article;
	private int unitats;
	private double preuUnitat;
	
	
	public LineaTicket(int codiLinea, model.Tiquet tiquet, Article article, int unitats,
			double preuUnitat) {
		super();
		this.codiLinea = codiLinea;
		this.tiquet = tiquet;
		this.article = article;
		this.unitats = unitats;
		this.preuUnitat = preuUnitat;
	}
	public int getCodiLinea() {
		return codiLinea;
	}
	public void setCodiLinea(int codiLinea) {
		this.codiLinea = codiLinea;
	}
	public Tiquet getTiquet() {
		return tiquet;
	}
	public void setTiquet(Tiquet tiquet) {
		this.tiquet = tiquet;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	public int getUnitats() {
		return unitats;
	}
	public void setUnitats(int unitats) {
		this.unitats = unitats;
	}
	public double getPreuUnitat() {
		return preuUnitat;
	}
	public void setPreuUnitat(double preuUnitat) {
		this.preuUnitat = preuUnitat;
	}
	@Override
	public String toString() {
		return  "lineaTicket [codiLinea=" + codiLinea + ", tiquet=" + tiquet + ", article=" + article + ", unitats="
				+ unitats + ", preuUnitat=" + preuUnitat + "]";
	}
	public boolean altaLineaTicket () {
		
		return false;
	}
	public boolean baixaLineaTicket () {
			
		return false;
	}
	public boolean modificaLineaTicket () {

		return false;
	}
	
	
	
}
