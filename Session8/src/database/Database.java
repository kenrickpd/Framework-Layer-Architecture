package database;

import java.util.Random;

import model.Executable;

public class Database implements Executable{

	@Override
	public int executeQuery(String query) {
		System.out.println("Executing query: " + query);
		Random rand = new Random();
		return rand.nextInt();
	}

}
