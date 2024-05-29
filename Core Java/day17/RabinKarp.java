package com.day17;

public class RabinKarp {
	public static final int d =256;
	public static void search(String text, String pattern, int q) {
		int n = text.length();
		int m = pattern.length();
		
		int p = hash(pattern,m, q);
		int t = hash(text, m,q);
		
		int h = 1;
		for(int i = 1;i<m;i++) {
			h = (h * d)%q;
		}
		for(int i = 0;i<=n-m;i++) {
			if(p==t) {
				boolean found = true;
				for(int j = 0;j<m;j++) {
					if(text.charAt(i+j)!=pattern.charAt(j)) {
						found = false;
						break;
					}
				}
				if(found) {
					System.out.println("Pattern found at index: "+ i);
				}
			}
			if(i<n-m) {
				t=(d*(t - text.charAt(i)*h)+text.charAt(i+m))%q;
				if(t<0) {
					t=(t+q);
				}
			}
		}
		
	}
	private static int hash(String str,int m, int q) {
		int hash=0;
		for(int i =0;i<m;i++) {
			hash = (d*hash + str.charAt(i))%q;
		}
		return hash;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String text = "ABABDABACDABABCABAB";
		//String pattern = "ABABCABAB";
		String text = "GREEK FOR GREEK";
		String pattern = "GREEK";
		int q = 101;
		search(text,pattern,q);

	}

}
