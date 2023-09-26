package sushi;

public class MakiSushi extends Sushi implements Edible{

	public MakiSushi(String name, int price) {
		super(name, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void buySushi() {
		// TODO Auto-generated method stub
		System.out.println("beli bang");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("makan bang");
	}
	
}
