package tests;



import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import logic.SumMultiples;

public class TestSumMultiples {
	private ArrayList<Integer> multiples = new ArrayList<Integer>();
	private ArrayList<Integer> listToSum = new ArrayList<Integer>();
	
	// 3%3 = 0
	@Test
	public void testMultipleOf() {
		assertTrue("number is not multiple of 3 or 5",SumMultiples.isMultipleOf(3));
	}
	
	// 5%5 = 0
	@Test
	public void testMultipleOf5() {
		assertTrue("number is not multiple of 3 or 5", SumMultiples.isMultipleOf(5));
	}
	
	// 7 is not multiple of 3 or 5
	@Test
	public void testMultipleOf3or5() {
		assertFalse("number is multiple of 3 or 5", SumMultiples.isMultipleOf(7));
	}
	
	// list multiples is not empty after finding a multiple
	@Test
	public void testIsListEmpty() {
		assertEquals(3,SumMultiples.listOfMultiples(3, multiples).get(0));
	}
	
	// check sum of 3, 5, 6  and 9 in the list is 23
	@Test
	public void testSumOfElementsInList() {
		listToSum.add(3);
		listToSum.add(5);
		listToSum.add(6);
		listToSum.add(9);
		assertEquals(23, SumMultiples.sumOfElementsInList(listToSum));
	}
	
	// check sum for 1000 terms
	@Test
	public void testSumOfElementsInLimit() {
		
	}
	

}
