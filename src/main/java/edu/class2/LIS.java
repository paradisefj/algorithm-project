package edu.class2;

/**
 * 找出给定数组最长且单调递增的子序列
 * @author fangjuan
 *
 */
public class LIS {
	private int[] array;
	
	public LIS(int[] a){
		this.array = a;
	}
	
	/**
	 * 记A的前i个字符构成的前缀串为Ai= a0a1a2...ai-1,以ai结尾的最长递增子序列记做 Li,其长度记为b[i]
	 * b[i]={max(b[j])+1, 0≤j<i且aj≤ai}
	 * @return
	 */
	public int[]/*Todo*/ calc(){
		int n = this.array.length;
		int[] b = new int[n];
		int max = 1;
		for(int i=0;i<n;i++){
			b[i] = 1;
			int maxBi = 1;
			for(int j=i-1;j>=0;j--){
				if(array[i] > array[j]){
					maxBi = (b[j] + 1) > maxBi ? b[j] + 1 : maxBi;
				}
			}
			b[i] = maxBi;
			max = b[i] > max ? b[i] : max;//结果长度
		}
		
		int[] lis = new int[max];//最终结果
		int next = 1;
		for(int i=0;i<n;i++){
			if(b[i] == next){
				lis[next - 1] = array[i];
				next++;
			}
		}
		return lis;
	}
}
