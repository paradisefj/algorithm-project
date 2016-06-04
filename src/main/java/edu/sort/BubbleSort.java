package edu.sort;

/**
 * 冒泡排序
 * @author fangjuan
 *
 */
public class BubbleSort {
	public static int[] sort(int[] array){
		boolean exchange = false;
		for(int i=0;i<array.length;i++){
			exchange = false;//本趟是否排好序的标志
			for(int j=0;j<array.length - i - 1;j++){
				if(array[j] > array[j+1]){//大的向上冒泡
					exchange = true;//发生了交换
					int tmp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = tmp;
				}
			}
			if(!exchange){//如果未发生交换，证明已排好序
				return array;
			}
		}
		return array;
	}
}
