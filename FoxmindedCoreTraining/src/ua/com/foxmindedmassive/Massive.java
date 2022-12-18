package ua.com.foxmindedmassive;

public class Massive {

	public static void main(String[] args) {

	}

	public void stingManipulation() {
		String[] word = new String[] { "Hello", "World" };

		System.out.println(word.length);

		for (int i = 0; i < word.length; i++) {

			System.out.println(word[i]);

			for (int b = 0; b < word[i].length(); b++) {

				char[] chars = word[i].toCharArray();
				System.out.println(chars[b]);
			}
		}

	}

	public void stringBuilder() {

		String word[] = new String[] { "Hello", "World" };

		for (int i = 0; i < word.length; i++) {

			StringBuilder recoverSource = new StringBuilder();
			char[] chars = word[i].toCharArray();

			System.out.println(word[i]);

			// System.out.println(recoverSource.append(chars));

			for (int a = 0; a < chars.length; a++)

				System.out.println(recoverSource.append(chars[a]) + "(This is recoverSorce)" + "\n" + chars[a]);
		}

	}

}
