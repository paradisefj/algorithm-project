package edu.class1;

import org.junit.Assert;
import org.junit.Test;

public class BracesMatchTest {

	@Test
	public void testMatching() {
		BracesMatch bm = new BracesMatch("(()");
		String ms = bm.matching();
		Assert.assertEquals("()", ms );
		
		bm = new BracesMatch("()(())");
		Assert.assertEquals("()(())", bm.matching());
	}

}
