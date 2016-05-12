package edu.class1;

/**
 * 以链表的存储形式来实现队列
 * @author fangjuan
 *
 * @param <T>
 */
public class Queue<T> {
	private QueueNode<T> head;
	private QueueNode<T> tail;
	public QueueNode<T> getHead() {
		return head;
	}
	public QueueNode<T> getTail() {
		return tail;
	}
	
	/**
	 * 添加一个节点到队列中
	 * @param value
	 */
	public void add(T value){
		QueueNode<T> node = new QueueNode<T>(value);
		this.tail.setpNext(node);
		this.tail = tail.getpNext();
	}
	
	/**
	 * 移除队首元素
	 * @return
	 */
	public T front(){
		if(this.head == this.tail){
			return null;
		}
		QueueNode<T> node = this.head.getpNext();
		this.head = this.head.getpNext();
		return node.getValue();
	}
	
	/**
	 * 当前队列是否为空
	 * @return true 空
	 * false 非空
	 */
	public boolean isEmpty(){
		return this.head == this.tail;
	}
	
	public Queue(){
		this.head = new QueueNode<T>();
		this.tail = this.head;
	}
}
class QueueNode<T> {
	private T value;
	private QueueNode<T> pNext;
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public QueueNode<T> getpNext() {
		return pNext;
	}
	public void setpNext(QueueNode<T> pNext) {
		this.pNext = pNext;
	}
	public QueueNode(){
		
	}
	public QueueNode(T value){
		this.value = value;
		this.pNext = null;
	}
}
