package models;

import payments.Payment;

public class Cupcake extends Cake{

	public Cupcake(String type, String name, String softness, String checkTopping, boolean hasTopping, String topping1,
			String topping2, String topping3, Double price, String paymentType, Payment payment) {
		super(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, payment);
		// TODO Auto-generated constructor stub
	}
}
