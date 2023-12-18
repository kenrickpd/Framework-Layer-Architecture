package publisher;

import java.util.ArrayList;

import object.Customer;
import object.Promo;

public class Restaurant {
	ArrayList<Customer> CustomerList;

	public Restaurant() {
		super();
		this.CustomerList = new ArrayList<>();
	}
	
	public void addSubscriber(Customer cust) {
		CustomerList.add(cust);
		System.out.println("Added " + cust.toString());
	}
	
	public void removeSubscriber(Customer cust) {
		CustomerList.remove(cust);
		System.out.println("Removed " + cust.toString());
	}
	
	public void notifySubscriber(Promo newPromo, int type) {
		for (Customer customer : CustomerList) {
			customer.update(newPromo, type);
		}
	}
}
