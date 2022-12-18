package ua.com.foxminded;

public class BusMum extends Car {

	public BusMum(String name, int yearOfProduction, int price, int weight, String color, int distanceForRepair) {
		super(name, yearOfProduction, price, weight, color, distanceForRepair);
	
	}
	
@Override
	public boolean checkDistance() {
		
	if (distanceForRepair > 50000)
			
		{return true;} else
		return false;
	}

	
	
}
