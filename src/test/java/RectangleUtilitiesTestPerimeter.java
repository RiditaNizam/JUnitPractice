import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleUtilitiesTestPerimeter {

	@Test
	public void testGetPerimeter() {
		int height = 4;
		int width = 6;
		int expected = 20;
		int actual = RectangleUtilities.getPerimeter(height, width);
		assertEquals(expected, actual);
	}

}
