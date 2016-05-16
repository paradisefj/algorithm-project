package edu.class1;

/**
 * 队列应用-权值相同的最短路径问题
 * 权值相同的最短路径问题,则单源点Dijkstra算法退 化成BFS广度优先搜索
 * @author fangjuan
 *
 */
public class QueueApply {
	private Queue<Integer> queue;
	private int[][] graph;//存储图的邻接矩阵
	private int size;//节点个数
	
	public QueueApply(int[][] graph, int size){
		this.graph = graph;
		this.size = size;
		this.queue = new Queue<Integer>();
	}
	
	/**
	 * 
	 * @param from 开始的节点
	 * @param to	结束的节点
	 * @return
	 */
	public int calc(int from, int to){
		int[] step = new int[this.size];//每个节点第几步可以到达
		int[] stepNumber = new int[this.size];//到每个节点有几种走法
		queue.add(from);
		stepNumber[from] = 1;//开始的节点，有一种方法能到，步数为0
		int s = 0;
		while(!queue.isEmpty()){
			int start = queue.front();
			s = step[start] + 1;
			for(int i=0;i< this.size;i++){
				if(i != from){
					if(graph[start][i] == 1){//连通
						//i尚未到达或发现更快的路
						if(step[i] == 0 || step[i] >s){
							step[i] = s;
							queue.add(i);
							stepNumber[i] = stepNumber[start];
						}else if(step[i] == s){//发现相同的路径
							stepNumber[i] += stepNumber[start];
						}
					}
				}
				
			}
				
		}
		
		return stepNumber[to];
	}
}
