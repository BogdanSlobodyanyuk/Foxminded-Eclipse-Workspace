package ua.com.foxminded.secondpart;

import java.util.Objects;

public class Motorcycle {
	
	   String name; 

	    int yearOfProduction;

	    int price;

	    int weight;

	    Color color;

	    String engineType;
	    
	   private int distance =0;

	    boolean isReadyToDrive;

		public Motorcycle(String name, int yearOfProduction, int price, int weight, String color, String engineType,
				boolean isReadyToDrive) {
			super();
			this.name = name;
			this.yearOfProduction = yearOfProduction;
			this.price = price;
			this.weight = weight;
			this.color = Color.valueOf(color.replace(" ", "").toUpperCase());
			this.engineType = engineType;
			this.isReadyToDrive = isReadyToDrive;
			
		}
		
		
		
		
		public int getDistance() {
			return distance;
		}




		public void repair () {
			isReadyToDrive = true;
		} 
		
		public void checkDestroiEngine () {
			
			if (distance > 200000) { isReadyToDrive = false;}
		}
		
		public void changeColorOnBlack () {
			this.color = Color.BLACK;
		}
		
		public int addDistance (int k) {
			
			if (k >=0) distance = k+distance;
			
			return distance;
		}



		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Motorcycle other = (Motorcycle) obj;
			return color == other.color && isReadyToDrive == other.isReadyToDrive && Objects.equals(name, other.name);
		}




		@Override
		public String toString() {
			return "Motorcycle [name=" + name + ", yearOfProduction=" + yearOfProduction + ", price=" + price
					+ ", weight=" + weight + ", color=" + color + ", engineType=" + engineType + ", distance="
					+ distance + ", isReadyToDrive=" + isReadyToDrive + "]";
		}  
		
		
		
		
		
		



}
