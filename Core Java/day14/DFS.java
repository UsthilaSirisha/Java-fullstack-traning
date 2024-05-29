package com.day14;
import java.util.*;

public class DFS {
	private int v;
	private LinkedList<Integer> adj[];
	void Graph(int v) {
		int V = v;
		adj= new LinkedList[v];
		for(int i = 0;i<v;++i) {
			adj[i]=new LinkedList();
		}
	}
	void addEdge(int v,int w) {
		adj[v].add(w);
		adj[w].add(v);
	}
	void DFSUtil(int v,boolean visited[]){
		visited[v]=true;
		System.out.print(v + " ");
		
	
	for(int n : adj[v]) {
		if(!visited[n]) {
			DFSUtil(n,visited);
		}
	}
	boolean visited1[]= new boolean[v];
	DFSUtil(v,visited1);
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS g= new DFS();
		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);
		System.out.println("Following is Depth First Traversal stating from vertex 2");
		g.Graph(2);

	}

}
