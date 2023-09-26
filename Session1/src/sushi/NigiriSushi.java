package sushi;

public class NigiriSushi extends Sushi implements Edible {

	public NigiriSushi(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buySushi() {
		// TODO Auto-generated method stub
		System.out.println("Beli bang");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("makan bang");
	}
	
	

}
