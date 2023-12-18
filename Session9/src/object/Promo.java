package object;

public class Promo {
	private String promoTitle;
	private String promoContent;
	
	public Promo(String promoTitle, String promoContent) {
		super();
		this.promoTitle = promoTitle;
		this.promoContent = promoContent;
	}

	public String getPromoTitle() {
		return promoTitle;
	}

	public void setPromoTitle(String promoTitle) {
		this.promoTitle = promoTitle;
	}

	public String getPromoContent() {
		return promoContent;
	}

	public void setPromoContent(String promoContent) {
		this.promoContent = promoContent;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String newPromo = String.format("%s-%s", this.promoTitle, this.promoContent);
		return newPromo;
	}
}
