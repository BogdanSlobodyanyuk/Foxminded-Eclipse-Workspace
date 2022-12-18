package ua.com.foxminded;

public class PassengerCar extends Car {

	public PassengerCar(String name, int yearOfProduction, int price, int weight, String color, int distanceForRepair) {
		super(name, yearOfProduction, price, weight, color, distanceForRepair);
		// TODO Auto-generated constructor stub
	}
	


@Override
public boolean checkDistance() {

	if (distanceForRepair > 50000)
		
	{return true;} else
	return false;
}





	
}
