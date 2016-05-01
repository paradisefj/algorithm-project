package edu.class1;

import java.util.Random;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LinkedArrayTest {
	private LinkedArray<Integer> myList;
	
	@Before
	public void setList() {
		myList = new LinkedArray<Integer>();
	}
	
	@After
	public void destroyList() {
		
	}
	
	@Test
	public void testReverse(){
		Random ra =new Random();
		int length1 = ra.nextInt(10) + 2;
		for(int i=0;i<length1;i++){
			myList.addNodeFirst(ra.nextInt(10));
		}
		
		System.out.print(myList);
		
		int n = ra.nextInt(length1 - 1) + 1;
		int	m = ra.nextInt(n);
		
		
		System.out.println("在" + m + "和" + n + "之间的链表进行逆序排列");
		myList.reverse(m, n);
		System.out.print(myList);
		
		
	}
}
