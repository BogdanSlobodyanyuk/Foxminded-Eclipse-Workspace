package ua.com.foxminded.thirdpart;

import java.util.Arrays;

public class Massive {

	
	public static void main(String[] args) {

		Massive go = new Massive();

		go.printArray();
		go.split();
		go.stringBuilder();
		
	

	}
	
	
	
	public void printArray() {

		String word[] = new String[] { "Hello", "World" };

		for (int i = 0; i < word.length; i++) {

			System.out.println(word[i]);

			for (int b = 0; b < word[i].length(); b++) {

				char[] chars = word[i].toCharArray();
				System.out.println(chars[b]);
			}

		}

	}
	
	
	public void split () {
		
		String word = "Hello World";
		
		String [] cutWord = word.split(" ");
		
		
		
		char[ ] cutWord1 = cutWord[0].toCharArray();
		char [] cutWord2 = cutWord[1].toCharArray();

		char [][] doublArray = new char [][] {cutWord1 , cutWord2};
	System.out.println(Arrays.deepToString(doublArray));
		
		
	}
	
	public void stringBuilder () {
		
		String word[] = new String[] { "Hello", "World"};
	
		
		
		
		
		for (int i = 0; i < word.length ; i++ ) {
			
			StringBuilder recoverSource = new StringBuilder();
			char[] chars = word[i].toCharArray();
			
			System.out.println(word[i]);
			
			//System.out.println(recoverSource.append(chars));
			
			for (int a = 0 ; a < chars.length; a++)
				
		
			System.out.println( recoverSource.append(chars[a]) +  "(This is recoverSorce)" + "\n" + chars[a]);
		}
		
		
	}


}
