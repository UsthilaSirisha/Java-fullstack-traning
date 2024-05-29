package com.day18;

public class UniqueElementsFinder {
	public static int[] findUniqueElements(int[] nums) {
		int Xor = 0;
		for(int num : nums) {
			Xor ^= num;
		}
		int setBit = Xor & ~(Xor - 1);
		int X = 0,y = 0;
		for(int num : nums) {
			if((num & setBit)  == 0) {
				X ^= num;
			} else {
				y ^= num;
			}
		}
		return new int[] {X,y};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3,2,1,4};
		int[] uniqueElements = findUniqueElements(nums);
		System.out.println("The two non-repeting elements are: " + uniqueElements[0] + "and" + uniqueElements[1]);

	}

}
