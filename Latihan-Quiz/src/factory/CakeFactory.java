package factory;

import models.Cake;
import payments.Payment;

public interface CakeFactory {
	public Cake create(String type, String name, String softness, String checkTopping, boolean hasTopping, String topping1,
			String topping2, String topping3, Double price, String paymentType, Payment payment);
}
