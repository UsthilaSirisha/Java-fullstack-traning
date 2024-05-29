package com.day19;

public class TowerOfHanoi {
	public static void solveTowerOfHanoi(int n,char source, char auxiliary,char destination) {
		if(n ==1) {
			System.out.println("Move disk 1 from rod "+ source +" to " + destination);
			return;
		}
		solveTowerOfHanoi(n-1, source, destination,auxiliary);
		System.out.println("Move disk "+n+ "from "+source+"to "+destination);
		solveTowerOfHanoi(n-1, auxiliary,source,destination);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		solveTowerOfHanoi(n,'A','B','C');


	}

}
