package edu.class1;

import org.junit.Assert;
import org.junit.Test;

public class StackTest {

	private Stack<Integer> stack;
	
	@Test
	public void testStack() {
		int n[] = {1,2,3};
		stack = new Stack<Integer>();
		for(int i=0;i<n.length;i++){
			stack.push(n[i]);
		}
		int popArray[] = new int[3];
		for(int i=0;i<n.length;i++){
			popArray[i] = stack.pop();
		}
		
		int rightArray[] = {3,2,1};
		Assert.assertArrayEquals(popArray, rightArray);
		
		Assert.assertEquals(null, stack.pop());
		
		stack.push(4);
		Assert.assertEquals(4, (int)stack.top());
		Assert.assertEquals(4, (int)stack.pop());
		Assert.assertEquals(null, stack.pop());
		
	}

}
