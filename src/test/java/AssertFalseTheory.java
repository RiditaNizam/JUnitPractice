import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertFalseTheory {

	@Test
	public void myTest() {
		assertFalse(false);
		assertFalse(1 == 5);
		assertFalse("Ridita".length() == 10);
	}

}
