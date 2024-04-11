package com.solucionfactible.dev;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreSameTest {

	@Test
	public void validTest() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(true, AreSame.comp(a, b)); 
	}
	
	@Test
	public void invalidTest() {
		int[] a = new int[]{21, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertEquals(false, AreSame.comp(a, b)); 
	}	

}
