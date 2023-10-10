package main;

public class SquarePegToRoundPegAdapter extends RoundPeg{
	SquarePeg sp;

	public SquarePegToRoundPegAdapter(SquarePeg sp) {
		super();
		this.setDiameter((int)(sp.getside() * Math.sqrt(2)));
		this.sp = sp;
	}

}
