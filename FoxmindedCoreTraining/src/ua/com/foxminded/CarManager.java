package ua.com.foxminded;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {
		
		Car toyota = new PassengerCar("Prius", 2008, 15000, 1200, "GREEN",10000);
		Car renault = new PassengerCar("Laguna", 2000, 9700, 1600 , "WHITE",10000);
		
		Car renaultPassenger = new PassengerCar("Megan", 2016, 13000, 1700, "BLACK", 9000);
        Car renaultBus = new BusyMum ("Megan", 2010, 12000, 2000, "WHITE",50001);
        
		Motorcycle suzuki = new Motorcycle ("Suzuki GSX-R1000", 2021, 16000, 600, "Bl AcK" , "Disel", false);
		Motorcycle yamaha  = new Motorcycle ("Yamaha FZ1", 2007, 9000, 700, "  orange", "Gas" , false);
		Motorcycle yamahaCompareble  = new Motorcycle ("FZ1", 2007, 9000, 700, "ORanGe", "Gas" , false);
		
		
		List < Motorcycle> printListOfMotorcycle = new ArrayList <> ();
		printListOfMotorcycle.add(suzuki);
		printListOfMotorcycle.add(yamaha);
		
		
		

		suzuki.paintMotorcycle("green");
		
		

		System.out.println(toyota);

		System.out.println(renault);
		System.out.println(suzuki);
		System.out.println(yamaha);
		System.out.println(renaultPassenger);
		System.out.println(renaultBus);
		System.out.println(yamahaCompareble.equals(yamaha));
		System.out.println("Does this Renault Laguna Passenger Car need to repair ?   -   "  + renaultPassenger.checkDistance() );
        System.out.println("Does this Renault Megan Bus need to repair ?   -   "  + renaultBus.checkDistance() );
        System.out.println(printListOfMotorcycle);
		
	}

}
