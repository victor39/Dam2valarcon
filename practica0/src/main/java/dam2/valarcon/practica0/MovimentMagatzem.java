package dam2.valarcon.practica0;

public class MovimentMagatzem {
	
	private int id;
	private Magatzem origen ;
	private Magatzem desti ;
	private Article article;
	private int unitats;
	
	

	public MovimentMagatzem(int id, Magatzem origen, Magatzem desti, Article article, int unitats) {
		super();
		this.id = id;
		this.origen = origen;
		this.desti = desti;
		this.article = article;
		this.unitats = unitats;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Magatzem getOrigen() {
		return origen;
	}

	public void setOrigen(Magatzem origen) {
		this.origen = origen;
	}

	public Magatzem getDesti() {
		return desti;
	}
	public void setDesti(Magatzem desti) {
		this.desti = desti;
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
	@Override
	public String toString() {
		return  "movimentMagatzem [id=" + id + ", origen=" + origen + ", desti=" + desti + ", article=" + article
				+ ", unitats=" + unitats + "]";
	}
	public boolean altaMovimentMagatzem () {
		
		return false;
	}
	public boolean baixaMovimentMagatzem () {
			
		return false;
	}
	public boolean modificaMovimentMagatzem () {

		return false;
	}
}
