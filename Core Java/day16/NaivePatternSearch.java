package com.day16;

public class NaivePatternSearch {
	public static int search(String text,String pattern) {
		int comparisons = 0;
		if(pattern.isEmpty()) {
			return 0;
		}
		int n =text.length();
		int m = pattern.length();
		for(int i = 0;i<=n -m;i++) {
			int j;
			comparisons++;
			for(j =0;j<m&& text.charAt(i +j)==pattern.charAt(j);j++) {
				comparisons++;
			}
			if(j == m) {
				System.out.println("Pattern found at index: "+i);
			}
		}
		return comparisons;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text="AABAACAABAA";
		String pattern = "AABA";
		int comparisons = search(text,pattern);
		System.out.println("Total comparisons: "+ comparisons);
		

	}

}
