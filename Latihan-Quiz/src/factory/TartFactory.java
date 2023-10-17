package factory;

import models.Cake;
import models.Tart;
import payments.Payment;

public class TartFactory implements CakeFactory{

	@Override
	public Cake create(String type, String name, String softness, String checkTopping, boolean hasTopping,
			String topping1, String topping2, String topping3, Double price, String paymentType, Payment payment) {
		// TODO Auto-generated method stub
		return new Tart(type, name, softness, checkTopping, hasTopping, topping1, topping2, topping3, price, paymentType, payment);
	}

}
