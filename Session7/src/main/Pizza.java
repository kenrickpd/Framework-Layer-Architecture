package main;

public class Pizza {
	private String crust;
	private String topping;
	
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	public String getTopping() {
		return topping;
	}
	public void setTopping(String topping) {
		this.topping = topping;
	}
	
	public Pizza(String crust, String topping) {
		super();
		this.crust = crust;
		this.topping = topping;
	}
	
}
