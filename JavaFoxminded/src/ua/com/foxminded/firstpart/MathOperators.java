package ua.com.foxminded.firstpart;

public class MathOperators {

	public static void main(String[] args) {
	
		String number = "-24";
		int result = Integer.parseInt(number) + 3;
		int divisionModul = 521124244 % 6;
		int forEvenNumber = 4;
		boolean evenNumber = false;
		
		
		
		
		
		if ( forEvenNumber % 2 == 0) { evenNumber = true ;} 
		else evenNumber = false;
		
		String oneMoreAnswer = result + " " + "HelloWorld!";
		System.out.println(oneMoreAnswer + "\n" + divisionModul );
		System.out.println(evenNumber);
		

	}

}
