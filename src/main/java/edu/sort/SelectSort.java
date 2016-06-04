package edu.sort;

/**
 * 选择排序
 * @author fangjuan
 *
 */
public class SelectSort {
	public static int[] sort(int[] toSort){
		for(int i=0;i<toSort.length;i++){
			int min = i;//记录位置
			for(int j=i + 1;j<toSort.length;j++){
				if(toSort[j] < toSort[min]){
					min = j;//每次找最小的
				}
			}
			//min和i作交换
			int tmp = toSort[i];
			toSort[i] = toSort[min];
			toSort[min] = tmp;
		}
		return toSort;
	}
}
