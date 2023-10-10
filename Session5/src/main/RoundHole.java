package main;

public class RoundHole {
	private int diameter;
	
	public RoundHole() {}

	public RoundHole(int diameter) {
		super();
		this.diameter = diameter;
	}

	public int getDiameter() {
		return diameter;
	}

	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	
	public void fit(RoundPeg rp) {
		if(rp.getDiameter() < this.diameter) {
			System.out.println("Fit");
		}else {
			System.out.println("Does not fit!");
		}
	}
}
