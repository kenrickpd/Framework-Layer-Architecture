package sushi;

public class ToySushi extends Sushi{

	public ToySushi(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}
	
	public void hugSushi() {
		System.out.println("Hugging " + super.getName() + "..." + price);
	}

	@Override
	public void buySushi() {
		// TODO Auto-generated method stub
		System.out.println("Beli bang");
		
	}
	
}
