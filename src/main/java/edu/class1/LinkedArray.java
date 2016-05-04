package edu.class1;

public class LinkedArray<T> {
	private Node<T> head = null;
	private int size = 0;
	
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
		
		size++;
	}
	
	/**
	 * 在某个节点后面添加一个新节点
	 */
	public void addNode(Node<T> node, T value){
		Node<T> addNode = new Node<T>();
		addNode.setValue(value);
		addNode.setpNext(node.getpNext());
		node.setpNext(addNode);
		
		size++;
	}
	
	/**
	 * 在链表尾部加入一个新的节点
	 * @param value
	 */
	public void addTailNode(T value){
		Node<T> tmp = this.head;
		while(tmp.getpNext() != null){
			tmp = tmp.getpNext();
		}
		Node<T> addNode = new Node<T>();
		addNode.setValue(value);
		addNode.setpNext(null);
		tmp.setpNext(addNode);
	}
	
	/**
	 * 在链表的m到n的位置翻转链表，元素的位置从0开始
	 * 0<=m<=n<=链表长度 - 1
	 * @param m
	 * @param n
	 */
	public void reverse(int m, int n){
		if(m == n)
			return;
		//首先找到第m个节点的位置
		Node<T> pCur = this.head.getpNext();
		Node<T> pHead = this.head;
		int i =0;
		while(i<m){
			pHead = pCur;
			pCur = pCur.getpNext();
			i++;
		}
		Node<T> pPre = pCur;
		pCur = pCur.getpNext();
		Node<T> pNext = pCur.getpNext();
		//将newHead指向的链表看做一个新的链表，使用头插法将后面的节点插入
		while(i<n){
			pNext = pCur.getpNext();
			pCur.setpNext(pHead.getpNext());
			pPre.setpNext(pNext);
			pHead.setpNext(pCur);
			
			pCur = pNext;
			
			i++;
		}
		
	}
	
	/**
	 * 给定排序链表，删除链表中的重复节点
	 */
	public void deleteDulp(){
		Node<T> node = this.head.getpNext();
		while(node != null && node.getpNext() != null){
			if(node.getValue().equals(node.getpNext().getValue())){
				Node<T> delNode = node.getpNext();
				node.setpNext(node.getpNext().getpNext());
				delNode = null;//释放内存
			}else{
				node = node.getpNext();
			}
		}
	}
	
	
	@Override
	public String toString(){
		StringBuffer sb = new StringBuffer();
		Node<T> node = this.head.getpNext();
		while(node != null){
			if(node.getpNext() != null)
				sb.append(node.getValue() + "->");
			else
				sb.append(node.getValue() + "\n");
			node = node.getpNext();
		}
		return sb.toString();
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
