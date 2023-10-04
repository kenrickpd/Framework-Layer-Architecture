package main;

import java.util.ArrayList;

import factory.HondaFactory;
import factory.ToyotaFactory;
import model.Bike;
import model.Car;

public class Main {
	
	public Main() {
		ArrayList<Bike> bikeList = new ArrayList<>();
		ArrayList<Car> carList = new ArrayList<>();
		
		HondaFactory hf = new HondaFactory();
		ToyotaFactory tf = new ToyotaFactory();
		
		bikeList.add(hf.createBike());
		carList.add(hf.createCar());
		bikeList.add(tf.createBike());
		carList.add(tf.createCar());
		
		for (Car car : carList) {
			System.out.println(car.getName());
		}
		
		for (Bike bike : bikeList) {
			System.out.println(bike.getName());
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
