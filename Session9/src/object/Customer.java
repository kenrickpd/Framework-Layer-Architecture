package object;

import observer.Observer;

public abstract class Customer implements Observer{
	//VIP Customer
	//Regular Customer
	protected String customerName;
	protected String customerType;
	protected Promo restoPromo;
	
	public Customer(String customerName) {
		super();
		this.customerName = customerName;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String customer = String.format("%s %s", this.customerName, this.customerType);
		return customer;
	}
}
