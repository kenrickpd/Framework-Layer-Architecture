package main;

import java.util.ArrayList;

import model.House;
import model.HouseBuilder;

public class Main {

//	public Main() {
//		// TODO Auto-generated constructor stub
//		House h1 = new House("rumah ipin", 2, 1);
//		House h2 = null;
//		try {
//			h2 = (House) h1.clone();
//		} catch (CloneNotSupportedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		System.out.println("house 1 = " + h1);
//		System.out.println("house 2 = " + h2);
//		
//		System.out.println("garden house 1 = " + h1.garden);
//		System.out.println("garden house 2 = " + h2.garden);
//		
//		h2.garden = 5;
//		System.out.println("garden house 1 = " + h1.garden);
//		System.out.println("garden house 2 = " + h2.garden);
//	}
	
	public Main() {
//		HouseBuilder builder = new HouseBuilder();
//		builder.setGarden(1);
//		builder.setRoom(2);
//		House myHouse = builder.build();
		
		ArrayList<House> houseList = new ArrayList<>();
		
		House myHouse = new HouseBuilder().setGarden(2).setName("Rumah upin").setRoom(2).build();
		houseList.add(myHouse);
		try {
			houseList.add((House) myHouse.clone());
			houseList.add((House) myHouse.clone());
			houseList.add((House) myHouse.clone());
			houseList.add(new HouseBuilder().setName("rumah ivan").setGarden(1).build());
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (House house : houseList) {
			house.sebutSaya();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
