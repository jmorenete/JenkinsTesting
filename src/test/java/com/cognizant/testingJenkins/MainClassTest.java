package com.cognizant.testingJenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainClassTest {
	@Test
	public void testPass() {
		MainClass mainClass = new MainClass();
		
		assertEquals(2,  mainClass.add(1,1));
		
	}
	
	@Test
	public void testPass2() {
		MainClass mainClass = new MainClass();
		
		assertEquals(3,  mainClass.add(1,2));
		
	}

}
