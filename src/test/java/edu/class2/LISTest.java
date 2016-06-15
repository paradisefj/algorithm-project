package edu.class2;

import org.junit.Assert;
import org.junit.Test;

public class LISTest {

	@Test
	public void test() {
		int[] n = {1,4,6,2,8,9,7};
		LIS lis = new LIS(n);
		int[] exspect = {1,4,6,8,9};
		Assert.assertArrayEquals(exspect, lis.calc());;
		
	}

}
