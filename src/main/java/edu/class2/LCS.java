package edu.class2;

/**
 * 求两个字符串的最长公共子序列，最长公共子序列可能有多个，只找到其中一个
 * @author fangjuan
 *
 */
public class LCS {
	private String a;
	private String b;
	
	public LCS(String a, String b){
		this.a = a;
		this.b = b;
	}
	
	public String calc(){
		int chess[][] = new int[a.length() + 1][b.length() + 1];
		
		for(int i=1;i<a.length() + 1;i++){
			for(int j=1;j<b.length() + 1;j++){
				if(a.charAt(i-1) == b.charAt(j-1)){//相等
					chess[i][j] = chess[i-1][j-1] + 1;
				}else{//不相等
					if(chess[i][j-1] > chess[i-1][j]){
						chess[i][j] = chess[i][j-1];
					}else{
						chess[i][j] = chess[i-1][j];
					}
				}
			}
		}
		
		StringBuffer resultReverse = new StringBuffer(); 
		int i = a.length() ;
		int j = b.length();
		
		while(i != 0 && j != 0){
			if(a.charAt(i-1) == b.charAt(j-1)){
				resultReverse.append(a.charAt(i-1));
				i--;
				j--;
			}else{
				if(chess[i][j-1] > chess[i-1][j]){
					j--;
				}else{
					i--;
				}
			}
		}
		return resultReverse.reverse().toString();
	}

}
