package after;

public class ChickenDumpling extends Dumpling{

	public ChickenDumpling() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "Chicken DUmpling";
		this.price = 20;
	}
	
	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Mix Beef with spices");
		System.out.println("Cook chicken");
		System.out.println("Wrap in fumpling sheet");
		System.out.println("Steam chicken dumpling");
	}
}
