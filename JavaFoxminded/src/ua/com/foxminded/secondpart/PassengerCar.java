package ua.com.foxminded.secondpart;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, String color) {
		super(name, yearOfProduction, price, weight, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean checkDistance() {

		if (distanceOnService > 1000) {
			return true;

		}

		return false;
	}

}
