package com.qa.portfolio;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class SuperBlockTest {
	
	private SuperBlock answers;
	
	@Before
	public void setup() {
		answers = new SuperBlock();
	}
	
	@Test
	public void consecutiveCharacterTest() {
		assertEquals(4, answers.superBlock("abbCCCddDDDDeeEEE")); 
	}
	
	@Test
	public void consecutiveNotSumTest() {
		assertEquals(5, answers.superBlock("fffgggggfffhhgg"));
	}
	
	@Test
	public void consecutiveCharNotIgnoreCaseTest() {
		assertEquals(4, answers.superBlock("iiIIIIijjjkll"));
	}
	
	@Test
	public void emptyInputTest() {
		assertEquals(0, answers.superBlock(""));
	}

}
