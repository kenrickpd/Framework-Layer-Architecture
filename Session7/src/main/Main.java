package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//without facade
//		Cashier c = new Cashier();
//		String topping = "cheese";
//		String crust = "Thin Crust";
//		String addr = "Binus Anggrek";
//		
//		c.takeOrder(topping, crust,  addr);
//		Chef ch = new Chef();
//		Pizza p = ch.makePizza(topping, crust);
//		DeliveryMan dm = new DeliveryMan();
//		dm.deliverPizza(p, addr);
		
		OrderFacade of = new OrderFacade();
		of.orderPizza("Tomato", "Thin", "Binus Anggrek");
	}

}
