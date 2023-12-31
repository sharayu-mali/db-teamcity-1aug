package com.db.demo.math;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	
	Calc calc=new Calc();
	
	@Test
	public void testAddNums() {
		Integer expected = 10;
		Integer actual = calc.addNums(5, 5);
		assertEquals(expected, actual);

	}

	@Test
	public void testAddNums2() {
		assertEquals(20, calc.addNums(10, 10));
	}
	

	@Test
	public void testAddNums3() {
		assertEquals(10, calc.addNums(8, 2));
	}
	
	@Test
	public void testSubtractNums() {
		Integer expected = 10;
		Integer actual = calc.subtractNums(30, 20);
		assertEquals(expected, actual);

	}

	@Test
	public void testSubtract2() {
		assertEquals(-5, calc.subtractNums(5, 10));
	}
	@Test
	public void testMultiplyNums() {
		Integer expected = 10;
		Integer actual = calc.multiplyNums(2,5);
		assertEquals(expected, actual);

	}

	@Test
	public void testMultiply2() {
		assertEquals(-25, calc.multiplyNums(5,-5));
	}
	

}
