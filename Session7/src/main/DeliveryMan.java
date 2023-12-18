package main;

public class DeliveryMan {
	public void deliverPizza(Pizza pizza, String address) {
		System.out.println("Pizza with crust " + pizza.getCrust() + " With topping " + pizza.getTopping() + " is delivered to " + address);
	}
}
