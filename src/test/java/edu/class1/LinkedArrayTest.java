package edu.class1;

import java.util.Random;

import org.junit.After;
import org.junit.Assert;
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
			myList.addHeadNode(ra.nextInt(10));
		}
		
		System.out.print(myList);
		
		int n = ra.nextInt(length1 - 1) + 1;
		int	m = ra.nextInt(n);
		
		
		System.out.println("在" + m + "和" + n + "之间的链表进行逆序排列");
		myList.reverse(m, n);
		System.out.print(myList);
	}
	
	@Test
	public void testDeleteDulp(){
		int[] data = {2,3,3,5,7,8,8,8,9,9,10, 10};
		for(int i=0;i<data.length;i++){
			myList.addTailNode(data[i]);
		}
		System.out.println("删除前\t" + myList);
		myList.deleteDulp();
		System.out.println("删除后\t" + myList);
		
	}
	
	@Test
	public void testPartition(){
		int[] data = {1,4,3,2,5,2};
		for(int i=0;i<data.length;i++){
			myList.addTailNode(data[i]);
		}
		System.out.println("分割前\t" + myList);
		myList.partition(3);
		System.out.println("分割后\t" + myList);
		
	}
	
	@Test
	public void testIsCircle(){
		int[] data = {1,4,3,2,5,2};
		for(int i=0;i<data.length;i++){
			myList.addTailNode(data[i]);
		}
		Assert.assertEquals(false, myList.isCircle());
		Node<Integer> node = myList.get(5);
		
		Node<Integer> node3 = myList.get(3);
		node.setpNext(node3);
		Assert.assertEquals(true, myList.isCircle());
	}
	
	@Test
	public void testHashCommonNode(){
		int[] data = {1,2,3,4,5};
		for(int i=0;i<data.length;i++){
			myList.addHeadNode(data[i]);
		}
		
		int[] data1 = {5,6,7,8,9};
		LinkedArray<Integer> another = new LinkedArray<Integer>();
		for(int i=0;i<data1.length;i++){
			another.addHeadNode(data1[i]);
		}
		
		Assert.assertEquals(null, myList.hasCommonNodes(another));
		
		//使用头插法，第一个值应该是9
		Assert.assertEquals(9, (int)another.hasCommonNodes(another).getValue());
		
		Node<Integer> node = another.getTailNode();
		node.setpNext(myList.getHead().getpNext());
		
		Assert.assertEquals(5, (int)myList.hasCommonNodes(another).getValue());
		
	}
}
