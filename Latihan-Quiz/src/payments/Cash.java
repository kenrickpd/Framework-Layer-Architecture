package payments;

public class Cash implements Payment{
	private double price;

	public Cash(double price) {
		super();
		this.price = price;
	}
	
	public Cash() {}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public void showPaymentType() {
		// TODO Auto-generated method stub
		System.out.println("Cash");
	}

	@Override
	public void showPaymentInfo() {
		// TODO Auto-generated method stub
		System.out.println(this.price);
	}
	
}
