package edu.sort;

import junit.framework.Assert;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void testQuickSort1() {
		int[] toSort = {21, 25, 49, 25, 16, 8};
		int[] sorted = {8, 16, 21, 25, 25, 49};
		QuickSort qs = new QuickSort(toSort);
		int[] quickSort = qs.quickSort();
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], quickSort[i]); 
		}
	}
	
	@Test
	public void testQuickSort2() {
		int[] toSort = {10,9,8,7,6,5,4,3,2,1};
		int[] sorted = {1,2,3,4,5,6,7,8,9,10};
		QuickSort qs = new QuickSort(toSort);
		int[] quickSort = qs.quickSort();
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], quickSort[i]); 
		}
	}

}
