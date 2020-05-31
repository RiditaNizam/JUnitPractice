import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilitiesTestCapitalized {

	@Test
	public void testIsCapitalized() {
		String capitalWord = "Apple";
		String lowerWord = "apple";
		String anotherLower = "grape";
		String nValue = null;
		String empty = "";
		
		StringUtilities utilities = new StringUtilities();
		assertTrue(utilities.isCapitalized(capitalWord));
		assertFalse(utilities.isCapitalized(lowerWord));
		assertFalse(utilities.isCapitalized(anotherLower));
		assertFalse(utilities.isCapitalized(nValue));
		assertFalse(utilities.isCapitalized(empty));
	}

}