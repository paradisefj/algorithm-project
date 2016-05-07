package edu.class1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class QueueTest {

	private Queue<Integer> queue;
	
	@Before
	public void setBefore() {
		queue = new Queue<Integer>();
	}

	@Test
	public void testAdd() {
		this.queue.add(1);
		Assert.assertEquals(1, (int)this.queue.front());
		
		this.queue.add(2);
		this.queue.add(3);
		Assert.assertEquals(2, (int)this.queue.front());
		Assert.assertEquals(3, (int)this.queue.front());
		
		Assert.assertEquals(null, this.queue.front());
	}

}
