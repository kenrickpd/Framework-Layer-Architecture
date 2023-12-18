package main;

public class OrderFacade {
	public void orderPizza(String topping, String crust, String addr) {
		
		Cashier c = new Cashier();
		
		c.takeOrder(topping, crust,  addr);
		Chef ch = new Chef();
		Pizza p = ch.makePizza(topping, crust);
		DeliveryMan dm = new DeliveryMan();
		dm.deliverPizza(p, addr);
	}
}
