package main;

public class Chef {
	public Pizza makePizza(String topping, String crust) {
		System.out.println("Pizza is in the making!");
		return new Pizza(crust, topping);
	}
}
