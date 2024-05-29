package com.day18;

public class BitManipulation {
	public static int countsetBits(int num) {
		int count = 0;
		while (num > 0) {
			count += (num & 1);
			num >>=1;
		}
		return count;
	}
	public static int countTotalSetBits(int n) {
		int totalSetBits = 0;
		for(int i = 1; i<=n;i++) {
			totalSetBits += countsetBits(i);
		}
		return totalSetBits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		System.out.println("Number of set bits in " + n + ": " + countsetBits(n));
		System.out.println("Total number os set bits from 1 to " + n + ": "+ countTotalSetBits(n));

	}

}
