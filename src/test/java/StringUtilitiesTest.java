import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringUtilitiesTest {

	@Test
	public void testVowelCount() {
		String hello = "hello";
		String threeCharacters = "xyz";
		String emptyString = "";
		String nValue = null;
		
		StringUtilities utilities = new StringUtilities();
		assertEquals(2, utilities.vowelCount(hello));
		assertEquals(0, utilities.vowelCount(threeCharacters));
		assertEquals(0, utilities.vowelCount(emptyString));
		assertEquals(0, utilities.vowelCount(nValue));
	}

}
