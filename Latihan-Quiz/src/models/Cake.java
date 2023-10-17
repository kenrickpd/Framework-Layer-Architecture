package models;

import payments.Payment;

public class Cake {
	private String type;
	private String name;
	private String softness;
	private String checkTopping;
	private boolean hasTopping;
	private String topping1;
	private String topping2;
	private String topping3;
	private Double price;
	private String paymentType;
	private Payment payment;
	
	public Cake(String type, String name, String softness, String checkTopping, boolean hasTopping, String topping1,
			String topping2, String topping3, Double price, String paymentType, Payment payments) {
		super();
		this.type = type;
		this.name = name;
		this.softness = softness;
		this.checkTopping = checkTopping;
		this.hasTopping = hasTopping;
		this.topping1 = topping1;
		this.topping2 = topping2;
		this.topping3 = topping3;
		this.price = price;
		this.paymentType = paymentType;
		this.payment = payments;
	}
	

	public Payment getPayment() {
		return payment;
	}



	public void setPayment(Payment payment) {
		this.payment = payment;
	}



	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSoftness() {
		return softness;
	}

	public void setSoftness(String softness) {
		this.softness = softness;
	}

	public String getCheckTopping() {
		return checkTopping;
	}

	public void setCheckTopping(String checkTopping) {
		this.checkTopping = checkTopping;
	}

	public boolean isHasTopping() {
		return hasTopping;
	}

	public void setHasTopping(boolean hasTopping) {
		this.hasTopping = hasTopping;
	}

	public String getTopping1() {
		return topping1;
	}

	public void setTopping1(String topping1) {
		this.topping1 = topping1;
	}

	public String getTopping2() {
		return topping2;
	}

	public void setTopping2(String topping2) {
		this.topping2 = topping2;
	}

	public String getTopping3() {
		return topping3;
	}

	public void setTopping3(String topping3) {
		this.topping3 = topping3;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	
}
