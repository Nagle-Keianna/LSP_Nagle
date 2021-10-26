package org.howard.edu.lsp.assignment5.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import org.howard.edu.lsp.assignment5.integerset.IntegerSet;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

/**
 * <h1>Integer Set Class</h1>
 * Implement a class, IntegerSet, given the specification below. <p>
 * 
 * @author pbc91 @/02922214
 *@since 2021-10-08]
 *
 */

public class IntegerSetTest {
	@Test
	@DisplayName("Test case for equals")
	public void testClear() {
		IntegerSet set = new IntegerSet();
		set.clear();
		assertEquals(0, 0);
		//JUnit test case(s) for equal
	}
	
	@Test
	public void testLength() {
	 IntegerSet set = new IntegerSet();
	 assertEquals(0, set.length());
	   }
	
	@Test
	public void testEqualsIntegerSet() {
		IntegerSet set1 = new IntegerSet();
	    set1.add(10);
	    set1.add(20);
	    set1.add(30);
	    IntegerSet set2 = new IntegerSet();
	    set2.add(10);
	    set2.add(20);
	    set2.add(30);

	    assertEquals(true, set1.equals(set2));
	   }
	
	@Test
	   public void testEqualsIntegerSet2() {
	       // sets of different elements
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       IntegerSet set2 = new IntegerSet();
	       set2.add(50);
	       set2.add(70);
	       set2.add(80);

	       assertEquals(false, set1.equals(set2));
	   }
	 
	 @Test
	   public void testContains() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       assertEquals(true, set1.contains(10));

	   }
	 
	 @Test
	   public void testLargest() throws IntegerSetException {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.add(5);
	       int expectedValue = 0;
	       try {
			expectedValue = set1.largest();
		} catch (org.howard.edu.lsp.assignment5.integerset.IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       assertEquals(30, expectedValue);
	   }
	  
	  @Test
	   public void testSmallest() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.add(5);
	       int expectedValue = 0;
	       try {
			expectedValue = set1.smallest();
		} catch (org.howard.edu.lsp.assignment5.integerset.IntegerSetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	       assertEquals(5, expectedValue);
	   }
	  
	  @Test
	   public void testAdd() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       String expectedValue = "10 20 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }
	  
	  @Test
	   public void testRemove() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       set1.remove(20);
	       String expectedValue = "10 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }
	  
	  @Test
	   public void testIsEmpty() {
	       IntegerSet set1 = new IntegerSet();
	       assertTrue(set1.isEmpty());
	   }
	  
	  private void assertTrue(boolean empty) {
		// TODO Auto-generated method stub
		
	}

	@Test
	   public void testToString() {
	       IntegerSet set1 = new IntegerSet();
	       set1.add(10);
	       set1.add(20);
	       set1.add(30);
	       String expectedValue = "10 20 30 ";
	       assertEquals(expectedValue, set1.toString());
	   }
	  
}