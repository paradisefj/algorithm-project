package edu.sort;

import junit.framework.Assert;

import org.junit.Test;

public class InsertSortTest {

	@Test
	public void testInsertSort1() {
		int[] toSort = {21, 25, 49, 25, 16, 8};
		int[] sorted = {8, 16, 21, 25, 25, 49};
		int[] insertSort = InsertSort.sort(toSort);
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], insertSort[i]); 
		}
	}
	
	@Test
	public void testInsertSort2() {
		int[] toSort = {10,9,8,7,6,5,4,3,2,1};
		int[] sorted = {1,2,3,4,5,6,7,8,9,10};
		int[] insertSort = InsertSort.sort(toSort);
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], insertSort[i]); 
		}
	}

}
