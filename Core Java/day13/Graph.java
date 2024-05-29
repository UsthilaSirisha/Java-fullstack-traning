package com.day13;
import java.util.*;

public class Graph {
	private final int V;
	private final List<List<Integer>>adjList;
	public Graph(int vertices) {
		V= vertices;
		adjList = new ArrayList<>(vertices);
		for(int i = 0;i<vertices;i++) {
			adjList.add(new LinkedList<>());
		}
	}
	public boolean addEdge(int u,int v) {
		adjList.get(u).add(v);
		if (isCyclic() ) {
			adjList.get(u).remove((Integer)v);
			return false;
		}
		return true;
	}
	
	private boolean isCyclicUtil(int v,boolean[] visited, boolean[]recStack)
	{
		if(recStack[v]) {
			return true;
		}
		if(visited[v]) {
			return false;
		}
		visited[v]=true;
		recStack[v]=true;
		List<Integer>children = adjList.get(v);
		for(Integer c:children) {
			if(isCyclicUtil(c,visited,recStack)) {
				return true;
			}
		}
		recStack[v] = false;
		return false;
	}
	private boolean isCyclic() {
		boolean[] visited = new boolean[V];
		boolean[] recStack = new boolean[V];
		for(int i = 0; i < V; i++) {
			if(isCyclicUtil(i, visited, recStack)) {
				return true;
			}
		}
		return false;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(4);
		System.out.println(graph.addEdge(0, 1));
		System.out.println(graph.addEdge(1, 2));
		System.out.println(graph.addEdge(2, 0));
		System.out.println(graph.addEdge(2, 3));
		System.out.println(graph.addEdge(3, 1));

	}

}
