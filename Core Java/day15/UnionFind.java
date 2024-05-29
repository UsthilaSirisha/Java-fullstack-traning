package com.day15;

public class UnionFind {
	int[] parent,rank;
	public UnionFind(int n) {
		parent= new int[n];
		rank = new int[n];
		for(int i=0;i<n;i++) {
			parent[i]=i;
			rank[i]=0;
		}
	}
	public int find(int x) {
		if(parent[x] !=x) {
			parent[x]= find(parent[x]);
		}
		return parent[x];
	}
	public void union(int X,int y) {
		int rootX = find(X);
		int rootY = find(y);
		if(rootX != rootY) {
			if (rank[rootX]> rank[rootY]) {
				parent[rootY]= rootX;
			}else if(rank[rootX] < rank[rootY]) {
				parent[rootX]= rootY;
				
			}else {
				parent[rootY]=rootX;
				rank[rootX]++;
			}
		}
	}
	public boolean hasCycle(int[][] edges) {
		for(int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			int rootu= find(u);
			int rootv = find(v);
			if(rootu == rootv) {
				return true;
			}
			union(u,v);
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] edges = { {0,1},{1,2},{2,3},{3,0}};
		UnionFind uf = new UnionFind(4);
		if(uf.hasCycle(edges)) {
			System.out.println("Graph contains a cycle");
			}else {
				System.out.println("Graph does not contain a cycle");
		}

	}
}


