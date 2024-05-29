package com.day19;

import java.util.Arrays;

public class TravelingSalesmanproblem {
	public static int findmincost(int[][] graph) {
		int n = graph.length;
		int VISITED_ALL = (1<<n)-1;
		int[][] dp = new int[n][1 << n];
		for(int[]row :dp) {
			Arrays.fill(row, Integer.MAX_VALUE);
		}
		return tsp(0,1,dp,graph,n, VISITED_ALL) ;
			
		}
		private static int tsp(int currentcity,int visitedMask,int[][] dp,int[][] graph,int n,int VISITED_ALL) {
			if(visitedMask == VISITED_ALL) {
				return graph[currentcity][0];
			}
			if(dp[currentcity][visitedMask] != Integer.MAX_VALUE) {
				return dp[currentcity][visitedMask];
			}
			for(int nextcity = 0;nextcity<n;nextcity++) {
				if((visitedMask &(1 << nextcity))==0) {
					int newvisitedMask=visitedMask|(1 << nextcity);
					int cost= graph[currentcity][nextcity]+ tsp(nextcity,newvisitedMask,dp,graph,n, VISITED_ALL);
					dp[currentcity][visitedMask]= Math.min(dp[currentcity][visitedMask], cost);
				}
			}
			return dp[currentcity][visitedMask];
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] graph = {
				{0,10,15,20},
				{10,0,35,25},
				{15,35,0,30},
				{20,25,30,0}
		};
		System.out.println("The minimum cost to visit all cities and return to the starting city is: "+ findmincost(graph));

	}

}
