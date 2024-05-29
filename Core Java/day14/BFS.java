package com.day14;


import java.util.Iterator;
import java.util.LinkedList;

class BFS {
	private int v;
	private LinkedList<Integer>[] adj;
	BFS(int v){
		int V = v;
		adj = new LinkedList[V];
		for(int i=0;i<v; ++i)
			adj[i]= new LinkedList();
	}
	void addEdge(int v,int w) {
		adj[v].add(w);
		adj[w].add(v);
		
	}
	void BFS(int s) {
		boolean[]visited = new boolean[v];
		LinkedList<Integer>queue= new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);
		while(queue.size()!=0) {
			s = queue.poll();
			System.out.print(s + " ");
			Iterator<Integer> i = adj[s].listIterator();
			while(i.hasNext()) {
				int n = i.next();
				if(!visited[n]) {
					visited[n]=true;
					queue.add(n);
				}
				
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BFS g = new BFS(6);
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(1, 4);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(3, 4);
		System.out.println("Breadth First Traversal:");
		g.BFS(0);

	}

}
