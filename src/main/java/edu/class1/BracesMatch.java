package edu.class1;

public class BracesMatch {
	private String toMatching;
	private Stack<Integer> stack;
	public BracesMatch(String toMatching) {
		this.toMatching = toMatching;
		this.stack = new Stack<Integer>();
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
					int top = stack.pop();
					if(stack.isEmpty()){//出栈后，栈为空，是能够继续匹配
						if(i-start + 1 > count){
							count = i-start + 1;
						}
					}else{
						if(i-stack.top() + 1>= count){
							count = i- top + 1 ;
							start = top;
						}
					}
				}
			}
		}
		return this.toMatching.substring(start, start + count );
	}
}
