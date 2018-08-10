package demo;


import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleTest {
	@Test
	public void multiplicationParZero(){
		MyClass tester = new MyClass();
		
		
		assertEquals(0, tester.multiply(10, 0));
		assertEquals(0, tester.multiply(0, 10));
		assertEquals(0, tester.multiply(0, 0));
	}
}
