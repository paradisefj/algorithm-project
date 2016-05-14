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
		int count = 0;//匹配的长度
		int start = 0;//匹配开始的位置
		for(int i=0;i<toMatching.length();i++){
			if(toMatching.charAt(i) == '('){
				stack.push(i);//将左括号的位置压栈
			}else{//右括号
				if(stack.isEmpty()){//为空，证明该右括号没有匹配
					start = i;
				}else{//栈不空，说明能够匹配
					stack.pop();
					if(stack.isEmpty()){//出栈后，栈为空
						count = max(i - start + 1, count);
					}else{
						count = max(count, i - stack.top());
					}
				}
			}
		}
		return this.toMatching.substring(start, start + count );
	}
}
