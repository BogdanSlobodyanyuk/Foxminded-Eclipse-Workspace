package ua.com.foxminded;

public class BusyMum extends Car {

	public BusyMum(String name, int yearOfProduction, int price, int weight, String color, int distanceForRepair) {
		super(name, yearOfProduction, price, weight, color, distanceForRepair);
	
	}
	
@Override
	public boolean checkDistance() {
		
	if (distanceForRepair > 50000)
			
		{return true;} else
		return false;
	}

	
	
}
