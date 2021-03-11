package junit5subjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class J02Assertions {

	@Test
	void testToMindMin() {
		assertTrue(Math.min(12.3, 13.6)==12.3);
		assertFalse(Math.min(12.3, 13.6)!=12.3);
		assertEquals(12.3, Math.min(12.3, 13.6));
	}
	@Test
	void testArrays() {
		String str="JUnit5 is better than JUnit4";
		String [] actualArr= new String[str.length()];
		actualArr=str.split(" ");
		String[] expectedArr= {"JUnit5", "is", "better", "than", "JUnit4"};
		
		assertTrue(Arrays.equals(actualArr, expectedArr));
		
	}

}
