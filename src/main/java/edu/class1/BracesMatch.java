package edu.class1;

public class BracesMatch {
	private String toMatching;
	private Stack<Integer> stack;
	public BracesMatch(String toMatching) {
		this.toMatching = toMatching;
		this.stack = new Stack<Integer>();
	}
	private int max(int a, int b){
		if(a<b){
			return b;
		}
		return a;
	}
	public String matching(){
		int count = 0;
		int start = 0;
		for(int i=0;i<toMatching.length();i++){
			if(toMatching.charAt(i) == '('){
				stack.push(i);
			}else{
				if(stack.isEmpty()){
					start = i;
				}
				stack.pop();
				if(stack.isEmpty()){
					count = max(count, i - start);
				}else{
					count = max(count, i - stack.top());
				}
				
			}
		}
		return this.toMatching.substring(start, start + count );
	}
}
