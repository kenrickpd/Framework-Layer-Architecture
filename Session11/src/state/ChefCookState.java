package state;

import model.Chef;

public class ChefCookState extends State{

	public ChefCookState(Chef curr_chef) {
		super(curr_chef);
		System.out.println(curr_chef.getName() + " is cooking...");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curr_chef.setCurr_state(new ChefDeliverState(curr_chef));
	}
	

}
