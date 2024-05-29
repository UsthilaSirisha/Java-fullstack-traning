package com.day17;

public class BoyerMoore {
	private static final int ALPHABET_SIZE = 256;
	private static void badCharacterHeuristic(char[] pattern, int M, int[] badchar) {
		for(int i=0;i < ALPHABET_SIZE;i++)
			badchar[i]= -1;
		for(int i = 0;i < M; i++)
			badchar[(int)pattern[i]] = i;
	}
	public static int lastOccurrence(String text , String pattern) {
	char[]txt = text.toCharArray();
	char[]pat = pattern.toCharArray();
	int N = txt.length;
	int M = pat.length;
	int[] badchar = new int[ALPHABET_SIZE];
	badCharacterHeuristic(pat,M, badchar);
	int s=0;
	int lastIndex= -1;
	while(s<=(N - M)) {
		int j = M -1;
		while(j>=0&& pat[j]==txt[s +j])
			j--;
		if(j<0) {
			lastIndex = s;
			s +=(s +M<N)?M - badchar[txt[s + M]]:1;
		}else {
			s += Math.max(1, j - badchar[txt[s +j]]);
		}
	}
	return lastIndex;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "ABAAABCD";
		//String pattern = "ABC";
		String text = "THIS IS SIMPLE EXAMPLE EXAMPLE";
		String pattern = "EXAMPLE";
		int result = lastOccurrence( text, pattern);
		if(result != -1) {
			System.out.println("Last occurence of pattern is at index " + result);
		}

	else {
		System.out.println("pattern not found in the text");

}
	}
}
