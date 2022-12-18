package ua.com.foxminded.secondpart;

import java.util.ArrayList;
import java.util.List;

public class CarManager {

	public static void main(String[] args) {

		Car toyota = new PassengerCar("Prius", 2008, 15000, 12000, Color.GREEN.toString());
		//Car renault = new Bus("Laguna", 2000, 9700, 16000, "White");

		Car cars = new PassengerCar(null, 0, 0, 0, null);
		VillageCar villageCars = new VillageCar();

		Motorcycle suzuki = new Motorcycle("GSX-R1000", 2021, 16000, 600, " black", "Disel", true);
		Motorcycle yamaha = new Motorcycle("FZ1", 2007, 9000, 700, "orangE", "Gas", false);
		// Motorcycle yamaha1 = new Motorcycle("FZ1", 2007, 9000, 700, "orangE", "Gas",
		// false,12000);
		
		
		List<Motorcycle> Moto = new ArrayList <>();
		
		Moto.add(suzuki);
		Moto.add(yamaha);

		cars.addDistance(100);
		toyota.addDistance(-11.5f);
		villageCars.addDistance(900000);
		

		System.out.println(Moto);

	}

}
