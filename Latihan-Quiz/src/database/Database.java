package database;

import java.util.ArrayList;

import models.Cake;

public class Database {
	private static final Database db = new Database();
	private ArrayList<Cake> cakeList = new ArrayList<Cake>();
	
	public ArrayList<Cake> getCakeList() {
		return cakeList;
	}
	public void addCake(Cake cake) {
		cakeList.add(cake);
	}
	public static Database getDb() {
		return db;
	}
	
	
}
