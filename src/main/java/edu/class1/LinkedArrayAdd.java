package edu.class1;

import java.util.Random;

/**
 * 给定两个链表，链表的每位做相加，结果为一个新的链表
 * @author fangjuan
 *
 */
public class LinkedArrayAdd {
	private LinkedArray<Integer> array1 = new LinkedArray<Integer>();
	private LinkedArray<Integer> array2 = new LinkedArray<Integer>();
	private LinkedArray<Integer> result = new LinkedArray<Integer>();
	public void add(){
		Node<Integer> p1 = array1.getHead().getpNext();
		Node<Integer> p2 = array2.getHead().getpNext();
		Node<Integer> resultHead = result.getHead();
		
		Node<Integer> tail = resultHead;
		
		int carray = 0;//进位
		while(p1 != null && p2 != null){
			int sum = p1.getValue() + p2.getValue() + carray;
			carray = sum/10;
			
			result.addNode(tail, sum%10);
			p1 = p1.getpNext();
			p2 = p2.getpNext();
			
			tail = tail.getpNext();
		}
		p1 = p1 == null?p2:p1;
		while(p1 != null){
			int sum = p1.getValue() + carray;
			carray = sum/10;
			result.addNode(tail, sum%10);
			
			p1 = p1.getpNext();
			tail = tail.getpNext();
		}
	}
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer("链表1\t" + array1.toString() 
				+ "链表2\t" + array2.toString() + "结果\t" + result.toString());
		return sb.toString();
	}
	
	public LinkedArrayAdd(){
		array1 = new LinkedArray<Integer>();
		array2 = new LinkedArray<Integer>();
		result = new LinkedArray<Integer>();
		
		
		Random ra =new Random();
		int length1 = ra.nextInt(10) + 1;
		for(int i=0;i<length1;i++){
			array1.addNodeFirst(ra.nextInt(10));
		}
		int length2 = ra.nextInt(10) + 1;
		for(int i=0;i<length2;i++){
			array2.addNodeFirst(ra.nextInt(10));
		}
//		array1.pint();
//		array2.pint();
		
	}
}