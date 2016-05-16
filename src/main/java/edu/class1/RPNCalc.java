package edu.class1;

/**
 * 逆波兰表达式（RPN）的计算
 * 有效操作符只有 + - * /
 * @author fangjuan
 *
 */
public class RPNCalc {
	private String[] expression;
	private Stack<Integer> stack;
	public RPNCalc(String[] expression){
		this.expression = expression;
		stack = new Stack<Integer>();
	}
	public RPNCalc(){
		stack = new Stack<Integer>();
	}
	public String[] getExpression() {
		return expression;
	}
	public void setExpression(String[] expression) {
		this.expression = expression;
	}
	private boolean isOperator(String operator){
		return operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/");
	}
	
	public int calc(){
		for(int i=0;i<expression.length;i++){
			if(!isOperator(expression[i])){
				stack.push(new Integer(expression[i]));//操作数，入栈
			}else{//操作符
				int b = stack.pop();
				int a = stack.pop();
				int result = 0;
				if(expression[i].equals("+")) {
					result = a + b;
				}else if(expression[i].equals("-")){
					result = a - b;
				}else if(expression[i].equals("*")){
					result = a * b;
				}else if(expression[i].equals("/")){
					result = a / b;
				}
				stack.push(result);
			}
		}
		return stack.pop();
	}
}
