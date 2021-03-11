package junit5subjecttutoring;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class J01Assertions {
	
	@Test
	void testToFail() {
		fail("Not yet implemented");
	}
	@Test
	void testLength() {
		int actualLength= "ABCD".length();
		int expectedLength=4;
		
		//assertEquals(expectedLength, actualLength);
		
		//assertEquals(expectedLength, actualLength, "Lengths Are not matching");
		//assertTrue(expectedLength!=actualLength);
		assertTrue(expectedLength==actualLength, "IT Failed");
		assertFalse(expectedLength!=actualLength, "failed");
		
	}
	
	@Test
	void testContainsMethod() {
		assertEquals(false, "AliCan".contains("jk"));
		
	}
	
	

}
