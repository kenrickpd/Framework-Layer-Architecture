package state;

import model.Chef;

public abstract class State {
	protected Chef curr_chef;
	
	public State(Chef curr_chef) {
		super();
		this.curr_chef = curr_chef;
	}

	public abstract void changeState();
}
