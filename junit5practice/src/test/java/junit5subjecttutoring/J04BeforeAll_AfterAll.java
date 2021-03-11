package junit5subjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J04BeforeAll_AfterAll {
	

		@BeforeAll
		static void beforeAll(TestInfo info) {
			System.out.println(info.getDisplayName()+ " connected to DB");
		}
		@AfterAll
		static void afterAll(TestInfo info) {
			System.out.println(info.getDisplayName()+ " closed connecto to DB");
			
		}
	@Test
	void testArrays(TestInfo info) {
		String str = "JUnit5 is better than JUnit4";
		String[] actualArr = str.split(" ");		
		String[] expectedArr = { "JUnit5", "is", "better", "than", "JUnit4" };
		System.out.println(info.getDisplayName()+" is executed");
		assertTrue(Arrays.equals(actualArr, expectedArr));

	}
	
	@Test
	void testStringLength(TestInfo info) {
		String str="Unit test with JUnit5";
		int actualLength=str.length();
		int expectedLength=21;
		assertEquals(expectedLength, actualLength, "Lengths are not mathing and equal");
		System.out.println(info.getDisplayName()+" is executed");
		
	}

}
