package edu.class2;

/**
 * 字符串循环移动
 * 时间复杂度O(N)，空间复杂度O(1)
 * (X’Y’)’=YX
 * 如:abcdef
 * X=ab X’=ba
 * Y=cdef Y’=fedc
 * (X’Y’)’=(bafedc)’=cdefab
 * @author fangjuan
 *
 */
public class StringShift {
	private String s;
	private char[] sSplit;
	
	public StringShift(String tmp){
		this.s = tmp;
		sSplit = s.toCharArray();
	}
	
	private void Reverse(int from, int to){
		int count = (to-from)/2 ;
		for(int i=0;i<count;i++){
			char c = sSplit[i+from];
			sSplit[i+from] = sSplit[to-i-1];
			sSplit[to-i-1] = c;
		}
	}
	
	public String shift(int from){
		Reverse(0, from);
		Reverse(from, s.length());
		Reverse(0, s.length());
		s = new String(sSplit);
		return s;
	}
}
