package edu.class1;

import org.junit.Assert;
import org.junit.Test;

public class RPNCalcTest {

	@Test
	public void test() {
		RPNCalc rpn = new RPNCalc();
		String[] expression1 = {"2", "1", "+", "3", "*"};
		rpn.setExpression(expression1);
		Assert.assertEquals(9, rpn.calc());
		
		String[] expression2 = {"4", "13", "5", "/", "+"};
		rpn.setExpression(expression2);
		Assert.assertEquals(6, rpn.calc());
	}

}
