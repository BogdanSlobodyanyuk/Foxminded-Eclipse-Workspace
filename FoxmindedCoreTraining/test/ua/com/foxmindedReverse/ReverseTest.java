package ua.com.foxmindedReverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void testEmptyString() {
		assertEquals("",Reverse.reverse("") );
	}
	
	@Test
	void testOneLetterString() {
		assertEquals("a",Reverse.reverse("a") );
	}
	
	@Test
	void testTwoWordsWithTwoLetterString() {
		assertEquals("ab ab",Reverse.reverse("ba ba") );
	}
	
	@Test
	void testSomeSpacesString() {
		assertEquals(" ", " " );
	}
	
	

}
