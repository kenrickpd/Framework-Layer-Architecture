package factory;

import model.Bike;
import model.Car;
import model.ToyotaBike;
import model.ToyotaCar;

public class ToyotaFactory implements AbstractFactory{

	public ToyotaFactory() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Car createCar() {
		// TODO Auto-generated method stub
		return new ToyotaCar();
	}

	@Override
	public Bike createBike() {
		// TODO Auto-generated method stub
		return new ToyotaBike();
	}

}
