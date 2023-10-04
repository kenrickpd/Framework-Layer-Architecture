package factory;

import model.Bike;
import model.Car;

public interface AbstractFactory {
	public Car createCar();
	public Bike createBike();
}
