package before;

public class BeefDumpling extends Dumpling{

	public BeefDumpling() {
		super();
		// TODO Auto-generated constructor stub
		this.name = "Beef Dumpling";
		this.price = 30;
	}

	@Override
	public void cook() {
		// TODO Auto-generated method stub
		System.out.println("Mix Beef with spices");
		System.out.println("Cook beef");
		System.out.println("Wrap in fumpling sheet");
		System.out.println("Steam beef dumpling");
	}

}
