package edu.csbsju.ntc;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NewTelephoneCompanyTest_WBT {
	private NewTelephoneCompany ntc;

	@Before
	public void setUp() throws Exception {
		ntc = new NewTelephoneCompany();
	}

	@Test
	public void testGetStartTime() {
		int expResult = 0;
	    int result = ntc.getStartTime();
	    assertEquals("Hours is " + expResult,expResult, result);
	}

	@Test
	public void testSetStartTime() {
		int expResult = 40;
	    ntc.setStartTime(expResult);
	    int result = ntc.getStartTime();
	    assertEquals("Hours is now " + expResult,expResult, result);
	}

	@Test
	public void testGetDuration() {
		int expResult = 0;
	    int result = ntc.getDuration();
	    assertEquals("Length is" + expResult,expResult, result);	}

	@Test
	public void testSetDuration() {
		int expResult = 40;
	    ntc.setDuration(expResult);
	    int result = ntc.getDuration();
	    assertEquals("Length is now " + expResult,expResult, result);	}

	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidStartTime() {
		ntc.setStartTime(7999);
	    ntc.setDuration(-5);
	    ntc.computeCharge();	}

	@Test (expected=UnsupportedOperationException.class)
	public void testInvalidDuration() {
		ntc.setStartTime(1800);
	    ntc.setDuration(-1);
	    ntc.computeCharge();	}
	
	@Test
	public void testDiscountedDurationAndStartTime() {
		ntc.setStartTime(500);
	    ntc.setDuration(100);
	    ntc.computeCharge();
	}
	@Test
	public void testDiscountedStartTime() {
		ntc.setStartTime(400);
	    ntc.setDuration(59);
	    ntc.computeCharge();
	}
	@Test
	public void testDiscountedDuration() {
		ntc.setStartTime(800);
	    ntc.setDuration(65);
	    ntc.computeCharge();
	}
	@Test
	public void testNoDiscount() {
		ntc.setStartTime(1000);
	    ntc.setDuration(40);
	    ntc.computeCharge();
	}



}
