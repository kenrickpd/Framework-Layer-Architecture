package observer;

import object.Customer;
import object.Promo;

public class RegularCustomer extends Customer{

	public RegularCustomer(String customerName) {
		super(customerName);
		this.customerType = "Regular";
	}

	@Override
	public void update(Promo newPromo, int type) {
		// TODO Auto-generated method stub
		if(type == 1) {
			this.restoPromo = newPromo;
			System.out.println(this.customerName + "--" + newPromo.toString());
		}
	}

}
