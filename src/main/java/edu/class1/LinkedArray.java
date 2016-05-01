package edu.class1;

public class LinkedArray<T> {
	private Node<T> head = null;
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public LinkedArray(){
		this.head = new Node<T>();
	}
	
	/**
	 * 在链表头部插入一个元素
	 * @param value
	 */
	public void addNodeFirst(T value){
		Node<T> node = new Node<T>();
		node.setpNext(this.head.getpNext());
		node.setValue(value);
		this.head.setpNext(node);
	}
	
	/**
	 * 在某个节点后面添加一个新节点
	 */
	public void addNode(Node<T> node, T value){
		Node<T> addNode = new Node<T>();
		addNode.setValue(value);
		addNode.setpNext(node.getpNext());
		node.setpNext(addNode);
	}
	
	public void pint(){
		Node<T> tmp = head.getpNext();
		while(tmp != null){
			System.out.print(tmp.getValue());
			tmp = tmp.getpNext();
		}
		System.out.println();
	}
	
}

class Node<T>{
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public Node<T> getpNext() {
		return pNext;
	}
	public void setpNext(Node<T> pNext) {
		this.pNext = pNext;
	}
	T value;
	Node<T> pNext = null;
	
}
