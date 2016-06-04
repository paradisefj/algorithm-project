package edu.sort;

import junit.framework.Assert;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void testMergeSort1() {
		int[] toSort = {21, 25, 49, 25, 16, 8};
		int[] sorted = {8, 16, 21, 25, 25, 49};
		MergeSort ms = new MergeSort(toSort);
		int[] mergeSort = ms.mergeSort();
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], mergeSort[i]); 
		}
	}
	
	@Test
	public void testMergeSort2() {
		int[] toSort = {10,9,8,7,6,5,4,3,2,1};
		int[] sorted = {1,2,3,4,5,6,7,8,9,10};
		MergeSort ms = new MergeSort(toSort);
		int[] mergeSort = ms.mergeSort();
		for(int i=0;i<toSort.length;i++){
			Assert.assertEquals(sorted[i], mergeSort[i]); 
		}
	}

}
