package ua.com.foxminded;

public class BusT4 extends Car {

	public BusT4(String name, int yearOfProduction, int price, int weight, String color, int distanceForRepair) {
		super(name, yearOfProduction, price, weight, color, distanceForRepair);
	
	}
	
@Override
	public boolean checkDistance() {
		
	if (distanceForRepair > 50000)
			
		{return true;} else
		return false;
	}

	
	
}
