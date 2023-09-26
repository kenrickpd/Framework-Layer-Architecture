package sushi;

public abstract class Sushi {
	
	private String name; 
	protected int price;

	public Sushi(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	//alt shift s buat getter setter

	public int getPrice() {
		return price;
	}
	
	public abstract void buySushi();
	
}
