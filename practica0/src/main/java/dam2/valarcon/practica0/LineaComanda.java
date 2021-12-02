package dam2.valarcon.practica0;


public class LineaComanda {
	
	private int codiLinia;
	private Comanda Comanda;
	private Article article;
	private int unitats;
	private double preuUnitat;

	
	public LineaComanda(int codiLinia, Comanda comanda, Article article, int unitats, double preuUnitat) {
		super();
		this.codiLinia = codiLinia;
		Comanda = comanda;
		this.article = article;
		this.unitats = unitats;
		this.preuUnitat = preuUnitat;
	}
	public int getCodiLinia() {
		return codiLinia;
	}
	public void setCodiLinia(int codiLinia) {
		this.codiLinia = codiLinia;
	}
	public Comanda getComanda() {
		return Comanda;
	}
	public void setComanda(Comanda comanda) {
		Comanda = comanda;
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
		return  "lineaComanda [codiLinia=" + codiLinia + ", Comanda=" + Comanda + ", article=" + article + ", unitats="
				+ unitats + ", preuUnitat=" + preuUnitat + "]";
	}
	public boolean altaLineaComanda () {
		
		return false;
	}
	public boolean baixaLineaComanda () {
			
		return false;
	}
	public boolean modificaLineaComanda () {

		return false;
	}

}
