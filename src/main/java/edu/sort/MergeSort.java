package edu.sort;

/**
 * 归并排序
 * @author fangjuan
 *
 */
public class MergeSort {
	private int[] array;//要排序的数组
	
	public MergeSort(int[] array){
		this.array = array;
	}
	
	private void mergeSort(int from, int to){
		if(from < to){
			int mid = (from + to)/2;
			mergeSort(from, mid);
			mergeSort(mid + 1, to);
			merge(from, mid, to);
		}
	}
	
	private void merge(int from, int mid, int to){
		int length = to - from + 1;
		int[] sort = new int[length];
		
		int firstBegin = from;
		int secondBegin = mid + 1;
		
		for(int i=0;i<length;i++){
			if(firstBegin <= mid && secondBegin <= to){
				if(array[firstBegin] < array[secondBegin] ){
					sort[i] = array[firstBegin];
					firstBegin++;
				}else {
					sort[i] = array[secondBegin];
					secondBegin++;
				}
			}else if(firstBegin > mid && secondBegin <= to){
				sort[i] = array[secondBegin++];
			}else if(firstBegin <= mid && secondBegin > to){
				sort[i] = array[firstBegin++];
			}
			
		}
		for(int i=0;i<length;i++,from++){
			array[from] = sort[i];
		}
	}
	
	public int[] mergeSort(){
		this.mergeSort(0, this.array.length - 1);
		return array;
	}
}
