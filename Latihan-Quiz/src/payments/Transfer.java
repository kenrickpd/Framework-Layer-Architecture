package payments;

public class Transfer implements Payment{
	private double price;

	public Transfer(double price) {
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
		System.out.println("Transfer");
	}

	@Override
	public void showPaymentInfo() {
		// TODO Auto-generated method stub
		System.out.println("Price  : $ " + this.price + " with Account Number: 1523151352");
	} 
	
	
}
