package state;

import model.Chef;

public class ChefDeliverState extends State{

	public ChefDeliverState(Chef curr_chef) {
		super(curr_chef);
		System.out.println(curr_chef.getName() + " is delivering..");
	}

	@Override
	public void changeState() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		curr_chef.setCurr_state(new ChefIdleState(curr_chef));
	}

}
