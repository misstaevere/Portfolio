package com.qa.portfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LargestTest {

	private Largest answers;
	
	@Before
	public void setup() {
		answers = new Largest();
	}
	
	@Test
	public void test1() {
		assertEquals(14, answers.largest("55 72 86"));		
	}
	
	@Test
	public void test2() {
		assertEquals(11, answers.largest("15 72 80 164"));		
	}
	
	@Test 
	public void test3() {
		assertEquals(15, answers.largest("555 72 86 45 10"));		
	}
	
}
