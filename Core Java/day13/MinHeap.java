package com.day13;

import java.util.ArrayList;

public class MinHeap {
private ArrayList<Integer> heap;
public MinHeap() {
	heap = new ArrayList<>();
}
private int parent(int i) {
	return (i-1)/2;
}
private int leftChild(int i) {
	return 2*i+1;
}
private int rightChild(int i) {
	return 2*i+2;
}
private void swap(int i, int j) {
	int temp = heap.get(i);
	heap.set(i, heap.get(j));
	heap.set(j, temp);
}
public void insert(int element) {
	heap.add(element);
	int index = heap.size()-1;
	while (index != 0 && heap.get(parent(index)) > heap.get(index)) {
		swap(index,parent(index));
		index = parent(index);
	}
}
public int deleteMin() {
	if(heap.isEmpty()) {
		throw new IllegalStateException("Heap is empty");
	}
	int min=heap.get(0);
	heap.set(0,heap.get(heap.size() -1));
	heap.remove(heap.size() -1);
	minHeapify(0);
	return min;
}
private void minHeapify(int i) {
	int left = leftChild(i);
	int right= rightChild(i);
	int smallest=i;
	if(left<heap.size() && heap.get(left) < heap.get(smallest)) {
		smallest = left;
	}
	if(right<heap.size() && heap.get(right) < heap.get(smallest)) {
		smallest = right;
	}
	if(smallest != i) {
		swap(i,smallest);
		minHeapify(smallest);
	}
}
public int getMin() {
	if(heap.isEmpty()) {
		throw new IllegalStateException("Heap is empty");
	}
	return heap.get(0);
			
}
public int size() {
	return heap.size();
}
public boolean isEmpty() {
	return heap.isEmpty();
}
}
