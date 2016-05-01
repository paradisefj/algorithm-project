package edu.class1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedArrayAddTest {
	LinkedArrayAdd myList;
	
	@Before
	public void setList() {
		myList = new LinkedArrayAdd();
	}
	
	@After
	public void destroyList() {
		
	}
	
	@Test
	public void testAdd(){
		myList.add();
		myList.print();
	}
}
