package edu.class1;

public class LinkedArray<T extends Comparable<T>> {
	private Node<T> head = null;
	private int size = 0;
	
	/**
	 * 返回链表长度
	 * @return
	 */
	public int size() {
		Node<T> node = this.head.getpNext();
		int i = 0;
		while(node != null){
			node = node.getpNext();
			i++;
		}
		return i;
	}
	
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
	public void addHeadNode(T value){
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
//				delNode = null;//释放内存？有用吗？？不应该这样回收内存
				//新加的内存回收
				delNode.setpNext(null);
				delNode.setValue(null);
			}else{
				node = node.getpNext();
			}
		}
	}
	
	/**
	 * 根据value，将链表划分为两部分，
	 * 小于value，在链表的坐标，大于value在链表的右边
	 * @param value
	 */
	public void partition(T value){
		Node<T> smallNodes = new Node<T>();
		Node<T> bigNodes = new Node<T>();
		Node<T> node = this.getHead().getpNext();
		Node<T> bigNodesTmp = new Node<T>();
		bigNodesTmp = bigNodes;
		this.head = smallNodes;
		while(node != null){
			if(node.getValue().compareTo(value) <=0){
				smallNodes.setpNext(node);
				smallNodes = smallNodes.getpNext();
			}else{
				bigNodes.setpNext(node);
				bigNodes = bigNodes.getpNext();
			}
			node = node.getpNext();
		}
		bigNodes.setpNext(null);
		smallNodes.setpNext(bigNodesTmp.getpNext());
	}
	
	/**
	 * 判断单向链表是否有环
	 * @return
	 */
	public boolean isCircle(){
		Node<T> first = this.head;
		Node<T> second = this.head.getpNext();
		while(first != null && second != null){
			if(first == second){
				return true;
			}
			first = first.getpNext();
			second = second.getpNext().getpNext();
		}
		return false;
	}
	
	/**
	 * 获取第index个节点的信息
	 * @param index
	 * @return
	 */
	public Node<T> get(int index){
		if(index <0) 
			return null;
		Node<T> node = this.head.getpNext();
		int i = 0;
		while(node != null){
			if(i == index){
				return node;
			}
			i++;
			node = node.getpNext();
		}
		return null;
	}
	
	/**
	 * 判断当前链表和anotherArray是否有公共节点
	 * 由于两个链表从第一个公共结点到链表的尾结点是完全重合的。所以前面的(m-n)个结点一定没有公共结点。
	 * 算法:先分别遍历两个链表得到它们的长度 m,n。长链表空转|m-n|次,同步遍历两链表,直到找到相同结点或到链表结束。
	 * @param anotherArray
	 * @return
	 */
	public Node<T> hasCommonNodes(LinkedArray<T> anotherArray){
		int m = this.size();
		int n = anotherArray.size();
		if(m>n){
			return hasCommonNodes(this, anotherArray);
		}else{
			return hasCommonNodes(anotherArray, this);
		}
		
	}
	
	
	private Node<T> hasCommonNodes(LinkedArray<T> longArray,
			LinkedArray<T> shortArray) {
		
		int m = longArray.size();
		int n = shortArray.size();
		
		Node<T> node = longArray.getHead().getpNext();
		
		int i=0;
		while(i < m - n){
			node = node.getpNext();
			i++;
		}
		
		Node<T> shortNode = shortArray.getHead().getpNext();
		
		while(node != null && shortNode != null){
			if(node == shortNode){
				return node;
			}
			node = node.getpNext();
			shortNode = shortNode.getpNext();
		}
		
		return null;
	}


	public Node<T> getTailNode(){
		Node<T> node = this.head.getpNext();
		while(node.getpNext() != null){
			node = node.getpNext();
		}
		return node;
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

class Node<T extends Comparable<T>> implements Comparable<Node<T>>{
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
	private T value;
	private Node<T> pNext = null;
	
	public int compareTo(Node<T> node){
		return this.value.compareTo(node.getValue());
	}
	
}
