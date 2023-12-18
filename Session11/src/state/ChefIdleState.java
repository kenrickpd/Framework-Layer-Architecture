package state;

import model.Chef;

public class ChefIdleState extends State{
	
	public ChefIdleState(Chef curr_chef) {
		super(curr_chef);
		System.out.println(curr_chef.getName() + " is idling..");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		curr_chef.setCurr_state(new ChefCookState(curr_chef));
	}
	
}
