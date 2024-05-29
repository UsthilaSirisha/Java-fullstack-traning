package com.day13;


public class Main {
	public static void main(String[] args) {
		MinHeap  minHeap = new MinHeap();
		minHeap.insert(10);
		minHeap.insert(2);
		minHeap.insert(20);
		minHeap.insert(5);
		System.out.println("Minimum element : "+minHeap.getMin());
		System.out.println("Deleting min element : "+minHeap.deleteMin());
		System.out.println("Minimum element  after deletion: "+minHeap.getMin());
		minHeap.insert(1);
		System.out.println("Minimum element after insertion : "+minHeap.getMin());
	}

}
