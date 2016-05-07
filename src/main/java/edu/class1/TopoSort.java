package edu.class1;

/**
 * 对一个有向无环图(Directed Acyclic Graph, DAG) G
 * 进行拓扑排序,是将G中所有顶点排成线性序列,
 * 使得图中任意一对顶点u和v, 若边(u,v)∈E(G),
 * 则u在线性序列中出现在v之前。
 * @author fangjuan
 *
 */
public class TopoSort {
	private Queue<Integer> queue;
	private int[][] graph;//邻接矩阵存储变
	private int size;//图的顶点的个数
	private int[] inDegree;//图的每个节点的入度
	
	public TopoSort(int[][] graph, int size){
		this.graph = graph;
		this.size = size;
		this.inDegree = new int[this.size];
		this.queue = new Queue<Integer>();
		//计算入度
		for(int i=0;i<this.size;i++){
			int sum = 0;
			for(int j=0;j<this.size;j++){
					sum += this.graph[j][i];
			}
			this.inDegree[i] = sum;
		}
	}
	
	public int[] topoSort(){
		int[] result = new int[this.size];
		int cur;//当前节点
		for(int i=0;i<this.size;i++){
			if(this.inDegree[i] == 0)
				queue.add(i);
		}
		int index = 0;//结果集
		while(!this.queue.isEmpty()){
			cur = queue.front();
			result[index] = cur;
			index ++;
			//cur指向的所有节点的入度-1
			for(int i=0;i<this.size;i++){
				if(this.graph[cur][i] > 0){
					this.inDegree[i]--;
					if(this.inDegree[i] == 0){
						queue.add(i);
					}
				}
			}
			
		}
		return result;
	}
}
