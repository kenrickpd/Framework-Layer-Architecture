package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SquarePeg sp = new SquarePeg(5);
		RoundPeg rp = new RoundPeg(5);
		RoundHole rh = new RoundHole(5);
		
		rh.fit(new SquarePegToRoundPegAdapter(sp));
	}

}
