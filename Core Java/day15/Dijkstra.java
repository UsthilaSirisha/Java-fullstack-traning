package com.day15;

import java.util.Arrays;

public class Dijkstra {
	public static class Node{
		private int id;
		private int distance;
		public Node(int id,int distance) {
			this.id=id;
			this.distance=distance;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
	}
	public static int[] dijkstra(int[][] graph,int source) {
		int n= graph.length;
		//int[] dist = new int[V];
		boolean[] visited = new boolean[n];
		int[] distances = new int[n];
		//PriorityQueue<Node> pq = new PriorityQueue<>();
		Arrays.fill(distances, Integer.MAX_VALUE);
		distances[source]= 0;
		for(int i=0;i<n-1;i++) {
			int minDistanceNode = -1;
			for(int j=0;j<n;j++) {
				if(!visited[j] &&(minDistanceNode== -1 || distances[j] <distances[minDistanceNode])) {
					minDistanceNode = j;
				}
			}
			visited[minDistanceNode]=true;
			for(int neighbor=0;neighbor<n;neighbor++) {
				if(graph[minDistanceNode][neighbor]>0&& !visited[neighbor]&&distances[minDistanceNode]!= Integer.MAX_VALUE) {
					int newDistance=distances[minDistanceNode]+graph[minDistanceNode][neighbor];
					if(newDistance<distances[neighbor]) {
						distances[neighbor]=newDistance;
					}
				}
			}
		}return distances;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = {
				{0,10,20,0,0},
				{10,0,0,50,10},
				{20,0,0,20,33},
				{0,50,20,0,2},
				{0,10,33,2,0}
		};
		int source=0;
		int[]distances= dijkstra(graph,source);
		System.out.println("vertex \t\t Distance from source");
		for(int i=0;i<graph.length;i++) {
			System.out.println(i + "\t\t "+distances[i]);
		}

	}

}
