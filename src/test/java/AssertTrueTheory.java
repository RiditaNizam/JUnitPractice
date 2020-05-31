import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTrueTheory {

	@Test
	public void test1() {
		assertTrue(true);
	}
	
	@Test
	public void test2() {
		assertTrue(5 == 5);
	}
	
	@Test
	public void test3() {
		assertTrue("Ridita".length() == 6);
	}

}
