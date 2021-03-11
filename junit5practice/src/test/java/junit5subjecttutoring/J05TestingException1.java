package junit5subjecttutoring;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

class J05TestingException1 {

	@Test
	void testException1(TestInfo info) {
		String str = null;

		assertThrows(NullPointerException.class,
				()->{
					System.out.println(info.getDisplayName()+ "  is working.");
					str.length();	
				}
				);
	}
	
	@Test
	 void numberFormatException(TestInfo info) {
		String str="123a";
		
		assertThrows(NumberFormatException.class,
				
				()->{
					System.out.println(info.getDisplayName()+ " is working");
					System.out.println(Integer.parseInt(str));
				}
				
				
				);
		
	}
	
	@Test
	void ArithmeticException(TestInfo info) {
		int a =2;
		int b=0;
		
		assertThrows(ArithmeticException.class,
				
				()-> {
					divide(a,b);
				}
				
				);
	}
	
	
	int divide(int a, int b) {
		return a/b;
	}
	
	@Test
	void illegalArgumentException() {
		
	}
	
	//IllegalArgumentException
	void age(int a) {
		if(a<0) {
			throw new IllegalArgumentException();
		}
		else {
			System.out.println(a);
		}
	}
	

}
