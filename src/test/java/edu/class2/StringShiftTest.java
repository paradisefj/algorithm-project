package edu.class2;

import junit.framework.Assert;

import org.junit.Test;

public class StringShiftTest {
	

	@Test
	public void testShift() {
		String s = "abcdef";
		StringShift ss = new StringShift(s);
		Assert.assertEquals("cdefab", ss.shift(2));
		
		Assert.assertEquals("cdefab", ss.shift(0));
		Assert.assertEquals("cdefab", ss.shift(6));
		
		Assert.assertEquals("fabcde", ss.shift(3));
	}

}
