import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class BeforeAfterTests {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Print this first.");
	}

	@Test
	public void test1() {
		System.out.println("Now running Test 1");
	}

	@Test
	public void test2() {
		System.out.println("Now running Test 2");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Print this last.");
	}
	
}
