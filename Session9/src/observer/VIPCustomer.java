package observer;

import object.Customer;
import object.Promo;

public class VIPCustomer extends Customer{
	
	public VIPCustomer(String customerName) {
		super(customerName);
		this.customerType = "VIP";
	}
	
	public void update(Promo newPromo, int type) {
		// TODO Auto-generated method stub
		if(type == 1 || type == 2) {
			this.restoPromo = newPromo;
			System.out.println(this.customerName + "--" + newPromo.toString());
		}
	}
}
