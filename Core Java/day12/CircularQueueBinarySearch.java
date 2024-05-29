package com.day12;

public class CircularQueueBinarySearch {
	public static int searchinRotatedArray(int[] arr,int target) {
		int left = 0;
		int right = arr.length-1;
		while (left<=right) {
			int mid = left+(right - left)/2;
			if(arr[mid]==target) {
				return mid;
			}
			if(arr[left]<=arr[mid]) {
				if(target>=arr[left]&&target<=arr[mid]) {
					right = mid - 1;
				}else {
					left= mid+1;
				}}else {
					if(target>=arr[mid]&&target<=arr[right]) {
						left=mid+1;
						
					}else {
						right=mid - 1;
					}
				}
			}return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr= {4,5,6,7,0,1,2};
		int target=0;
		int result=searchinRotatedArray(arr,target);
		if(result !=-1) {
			System.out.println("Element found at index"+result);
		}else {
			System.out.println("Element not found in the array");
		}

	}

}
