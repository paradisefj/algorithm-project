package edu.class1;

/**
 * 用链表实现的栈，要加入的节点放在队列的head，每次pop出的是队列head内的数据
 * @author fangjuan
 *
 * @param <T>
 */
public class Stack<T> {

	private StackNode<T> head;//栈顶指针
	
	public Stack() {
		this.head = new StackNode<T>();
	}
	
	/**
	 * 前插法实现节点 入栈
	 * @param value
	 */
	public void push(T value){
		StackNode<T> node = new StackNode<T>(value);
		node.setpNext(this.head.getpNext());
		this.head.setpNext(node);
		
	}
	
	/**
	 * 出栈
	 * @return null 空栈
	 */
	public T pop(){
		if(!isEmpty()){//空栈
			StackNode<T> node = this.head.getpNext();//要出栈的元素
			this.head.setpNext(this.head.getpNext().getpNext());
			return node.getValue();
		}
		return null;
	}
	
	/**
	 * 判断栈是否为空
	 * @return true 空  false 非空
	 */
	public boolean isEmpty(){
		return this.head.getpNext() == null;
	}
	
	/**
	 * 返回栈顶元素，但不出栈
	 * @return
	 */
	public T top(){
		if(isEmpty()){
			return null;
		}
		return this.head.getpNext().getValue();
	}
}

class StackNode<T> {
	private T value;
	private StackNode<T> pNext;
	public T getValue() {
		return value;
	}
	public StackNode<T> getpNext() {
		return pNext;
	}
	
	public void setValue(T value) {
		this.value = value;
	}
	public void setpNext(StackNode<T> pNext) {
		this.pNext = pNext;
	}
	public StackNode(){
		this.value = null;
		this.pNext = null;
	}
	public StackNode(T value){
		this.value = value;
		this.pNext = null;
	}
	
}
