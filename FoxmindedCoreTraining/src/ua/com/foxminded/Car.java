package ua.com.foxminded;

public abstract class Car implements Serviciable {

    String name;

    int yearOfProduction;

    int price;

    int weight;
    
    Color color;
    
    private int distance = 0 ; 
    
    protected int distanceForRepair;
  

	public Car(String name, int yearOfProduction, int price, int weight, String color, int distanceForRepair) {
		super();
		this.name = name;
		this.yearOfProduction = yearOfProduction;
		this.price = price;
		this.weight = weight;
		this.color = Color.valueOf(color);
		this.distanceForRepair = distanceForRepair;
		
		
	}







	public void addDistance (int additionalDistance) {
		
	    if (additionalDistance <= 0) {
	    
	    	 throw new IllegalArgumentException("Illegal ACTION !");
	    	
	    } else {distance += additionalDistance;}
	    
	    }
	
	
	
	
	
	
	
public int getDistance() {
		return distance;
	}






	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price + ", weight="
				+ weight + ", color=" + color + ", distance=" + distance + ", distanceForRepair=" + distanceForRepair
				+ "]";
	}

  
	
}
