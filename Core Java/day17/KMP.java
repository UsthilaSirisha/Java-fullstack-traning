package com.day17;

public class KMP {
	public static int search(String text, String pattern) {
		int[] lps= computeLPSArray(pattern);
		int i = 0;
		int j = 0;
		while(i<text.length()) {
			if(text.charAt(i)==pattern.charAt(j)) {
				i++;
				j++;
				if(j==pattern.length()) {
					return i - j;
				}
			}else {
				if(j>0) {
					j =lps[j - 1];
				}else {
					i++;
				}
			}
		}
		return -1;
	}
	private static int[] computeLPSArray(String pattern) {
		int[] lps = new int[pattern.length()];
		int len = 0;
		int i=1;
		while(i<pattern.length()) {
			if(pattern.charAt(i)==pattern.charAt(len)) {
				lps[i]=len +1;
				len++;
				i++;
			}else {
				if(len>0) {
					len = lps[len - 1];
				}else {
					lps[i]=0;
					i++;
				}
			}
		}
		return lps;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABABDABACDABABCABAB";
		String pattern = "ABABCABAB";
		int index = search(text,pattern);
		if(index== -1) {
			System.out.println("pattern not found");
			
		}else {
			System.out.println("pattern found at index: " +index);
			
		}

	}

}
