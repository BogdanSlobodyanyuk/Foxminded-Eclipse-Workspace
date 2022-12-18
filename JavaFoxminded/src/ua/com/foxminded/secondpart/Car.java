package ua.com.foxminded.secondpart;

public class Car implements Serviceable {

	String name;

	int yearOfProduction;

	int price;

	int weight;

	int distanceOnService = 0;

	Color color;

	private int distance = 0;

	public Car(String name, int yearOfProduction, int price, int weight, String color) {
		super();
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color.replace(" ", "").toUpperCase());

	}
	
	public boolean checkDistance() {
		
		if (distanceOnService > 5000) {
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

	public int getDistance() {
		return distance;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", distanceOnService=" + distanceOnService + ", color=" + color + ", distance=" + distance
				+ "]";
	}

}
