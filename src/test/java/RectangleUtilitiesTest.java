import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RectangleUtilitiesTest {
	
	@Test
	public void testGetArea() {
		int expected = 6;
		int actual = RectangleUtilities.getArea(2, 3);
		assertEquals(expected, actual);
	}
	
}
