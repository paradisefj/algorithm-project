package edu.sort;

/**
 * 插入排序
 * @author fangjuan
 *
 */
public class InsertSort {
	public static int[] sort(int[] array){
		for(int i=1;i<array.length;i++){
			if(array[i] < array[i-1]){//i+1应该在前面
				int tmp = array[i];//tmp待插入元素，且应该插入到0到i之间
				int j=i - 1;
				//比tmp大的依次向后挪一位
				do{
					array[j+1] = array[j];
					j--;
				}while(j>=0 && tmp < array[j]);
				array[j+1] = tmp;
			}
		}
		return array;
	}
}
