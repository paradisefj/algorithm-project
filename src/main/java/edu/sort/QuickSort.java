package edu.sort;

/**
 * 快速排序
 * @author fangjuan
 *
 */
public class QuickSort {
	private int[] array;
	
	public QuickSort(int[] array){
		this.array = array;
	}
	
	/**
	 * 递归快速排序
	 * @param toSort 要排序的数组
	 * @param from	排序开始的位置
	 * @param to	排序结束的位置
	 * @return
	 */
	private void sort(int from, int to){
		if(from < to){
			int pivotpos = partition(from, to);//划分的位置
			sort( from, pivotpos - 1);
			sort(pivotpos + 1, to);
		}
	}
	private int partition(int from, int to){
		int pivotpos = from;
		int pivot = array[from];//基准元素
		
		for(int i=from + 1;i<=to;i++){
			if(array[i] < pivot){//小于基准元素，放在左边
				pivotpos++;
				int tmp = array[pivotpos];
				array[pivotpos] = array[i];
				array[i] = tmp;
			}
		}
		array[from] = array[pivotpos];
		array[pivotpos] = pivot;
		return pivotpos;
	}
	
	public int[] quickSort(){
		this.sort(0, this.array.length - 1);
		return this.array;
	}
}
