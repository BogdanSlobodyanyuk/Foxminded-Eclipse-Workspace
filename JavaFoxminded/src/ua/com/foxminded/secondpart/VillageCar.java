package ua.com.foxminded.secondpart;

public class VillageCar implements Serviceable {
	
	int distanceOnService ;
	int distance;
	
	
	
	
	
public boolean checkDistance() {
		
		if (distanceOnService > 100000) {
			return true;

		}

		return false;
	}
	
public void addDistance(int additionalDistance) {

	distance += additionalDistance;
	distanceOnService += additionalDistance;
	

}

public void addDistance(float additionalDistance) {

	distance += Math.round(additionalDistance);
	distanceOnService = distance + Math.round(additionalDistance);
}

@Override
public String toString() {
	return "VillageCar [distanceOnService=" + distanceOnService + ", distance=" + distance + "]";
}



}
