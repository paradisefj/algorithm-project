#algorithm-project

小象算法学习的每节课的案例的JAVA实现

##第一节 

###链表

1. 给定两个链表，分别表示两个非负整数。他们的数字逆序存放在数组中，计算两个数字的和。
如：输入2->4->3，5->6->4 输出 7->0->8

2. 链表的部分翻转，给定一个链表，翻转该链表从m到n的位置，直接翻转，不申请新的空间
如：输入1->2->3->4->5，m=1, n = 3, 输出 1->4->3->2->5

3. 链表去重，给定**排序的链表**，删除重复元素
如：输入2->3->3->5->7->8->8->8->9->9->10，输出2->3->5->7->8->9->10

4. 给定一个链表和一个值x,将链表划分成两 部分,使得划分后小于x的结点在前,大于 等于x的结点在后。在这两部分中要保持原 链表中的出现顺序。
如：给定链表1->4->3->2->5->2和x = 3,返回 1->2->2->4->3->5

5. 判断一个单向链表是否有环

6. 给定两个单向链表，计算两个链表的第一个公共结点，若没有公共节点，返回空。

###队列

1. 队列的实现

2. 利用队列，对一个有向无环图进行拓扑排序
对一个有向无环图(Directed Acyclic Graph, DAG) G 进行拓扑排序,是将G中所有顶点排成线性序列, 使得图中任意一对顶点u和v, 若边(u,v)∈E(G), 则u在线性序列中出现在v之前。

3. 给定如下图所示的无向连通图,假定图中所有边的权值都为1,显然,从源点A到终点T的最短路径有多条,求不同的最短路径的数目。

![最短路径条数](https://github.com/paradisefj/algorithm-project/blob/master/screenshots/pic01.png)

###栈

1. 用链表实现的栈

2. 用栈实现的最长括号匹配

