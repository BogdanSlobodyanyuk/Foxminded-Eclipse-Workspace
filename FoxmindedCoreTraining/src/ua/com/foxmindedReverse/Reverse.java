package ua.com.foxmindedReverse;



public class Reverse {

	public static void main(String[] args) {
		
		
		
		System.out.println(reverse("tsuJ oD tI"));
		
	}
	
	public static  String reverse(String input) { 
		
		
		if (input == "  " ) {return input = String.join(input, "  ");} 

		  String inputWords[] = input.split(" ");

		  String outputWords[] = new String[inputWords.length];

		  int i = 0;

		  for (String inputWord : inputWords) {

		  String reverse = new   StringBuilder(inputWord).reverse().toString();

		  outputWords[i] = reverse;

		  i++;

		  }

		  return String.join(" ", outputWords);

		  }

}
