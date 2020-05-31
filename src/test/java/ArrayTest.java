import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ArrayTest {

	@Test
	public void myTest() {
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		int[] array3 = {1, 7, 7};
		int[] array4 = {1, 2, 3, 4};
		
		assertArrayEquals(array1, array2);
	}
}