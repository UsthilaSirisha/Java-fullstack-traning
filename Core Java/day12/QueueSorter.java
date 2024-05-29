package com.day12;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class QueueSorter {
	public static void sortQueue(Queue<Integer> queue) {
		Stack<Integer> tstack= new Stack<>();
		while(!queue.isEmpty()) {
			tstack.push(queue.poll());
		}
		while(!tstack.isEmpty()) {
			int min = tstack .pop();
			boolean ifSmaller = false;
			while(!tstack.isEmpty()) {
				int current = tstack .pop();
			if (current < min) {
				queue.offer(min);
				min = current;
				ifSmaller = true;
			} else {
				tstack.push(current);
			}
			
			}
			queue.offer(min);
			if(ifSmaller) {
				while (!queue.isEmpty()) {
					tstack.push(queue.poll());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(5);
		queue.offer(3);
		queue.offer(1);
		queue.offer(2);
		System.out.println("Original Queue : " + queue);
		sortQueue(queue);
		System.out.println("Sorted Queue : " + queue);
		

	}

}
