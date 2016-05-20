package edu.class2;

import junit.framework.Assert;

import org.junit.Test;

public class LCSTest {

	@Test
	public void test() {
		String a = "ABCBDAB";
		String b = "BDCABA";
		LCS lcs = new LCS(a, b);
		Assert.assertEquals("BCBA", lcs.calc());
		
		LCS lcs1 = new LCS("13455", "245576");
		Assert.assertEquals("455", lcs1.calc());
		

		LCS lcs2 = new LCS("acdfg", "adfc");
		Assert.assertEquals("adf", lcs2.calc());
	}

}
