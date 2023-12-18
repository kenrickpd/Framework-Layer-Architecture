package model;

import state.ChefIdleState;
import state.State;

public class Chef {
	private String name;
	private Integer age;
	private State curr_state;
	
	public Chef(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
		this.curr_state = new ChefIdleState(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public State getCurr_state() {
		return curr_state;
	}

	public void setCurr_state(State curr_state) {
		this.curr_state = curr_state;
	}
	
	
}
