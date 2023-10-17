package factory;

import models.Cake;
import models.Cupcake;
import payments.Payment;

public class CupcakeFactory implements CakeFactory{

	@Override
	public Cake create(String type, String name, String softness, String checkTopping, boolean hasTopping,
			String topping1, String topping2, String topping3, Double price, String paymentType, Payment payment) {
		// TODO Auto-generated method stub
		return new Cupcake(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, payment);
	}

}
