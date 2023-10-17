package payments;

public class Crypto implements Payment{
	private double price;

	public Crypto(double price) {
		super();
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void showPaymentType() {
		// TODO Auto-generated method stub
		System.out.println("Crypto");
	}
	
	@Override
	public void showPaymentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Price  : ADA " + this.price + " with Address: 04j1n24huji1h");
	}
	
	
}
