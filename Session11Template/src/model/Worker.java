package model;

public abstract class Worker {
	private String name;
	
	
	public Worker(String name) {
		super();
		this.name = name;
	}

	public void getUp() {
		System.out.println(name + " is waking up");
	}
	
	public void goToWork() {
		System.out.println(name + " is going to work");
	}
	
	public abstract void seeEarnings();
	public void goHome() {
		System.out.println(name + " is going to home");
	}
	
	public void dailyRoutine() {
		getUp();
		goToWork();
		seeEarnings();
		goHome();
	}
}
