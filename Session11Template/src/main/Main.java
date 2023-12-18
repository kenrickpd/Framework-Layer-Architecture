package main;

import model.Chef;
import model.Police;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chef c  = new Chef("ADI");
		Police p = new Police("BUDIT");
		
		c.dailyRoutine();
		p.dailyRoutine();
	}

}
