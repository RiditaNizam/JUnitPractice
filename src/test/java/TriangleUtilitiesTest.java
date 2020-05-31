import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleUtilitiesTest {

	@Test
	public void testIsEquilateral() {
		assertFalse(TriangleUtilities.isEquilateral(2, 3, 5));
		assertFalse(TriangleUtilities.isEquilateral(2, 4, 4));
		assertTrue(TriangleUtilities.isEquilateral(5, 5, 5));
	}

}
