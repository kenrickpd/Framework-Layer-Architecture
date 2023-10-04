package factory;

import model.Bike;
import model.Car;
import model.HondaBike;
import model.HondaCar;

public class HondaFactory implements AbstractFactory{

	public HondaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new HondaCar();
	}

	@Override
	public Bike createBike() {
		// TODO Auto-generated method stub
		return new HondaBike();
	}

}
