package com.day12;

import java.util.Stack;

public class SequenceInStack {
	public static boolean isSequencePresent(Stack<Integer> stack, int[] sequence) {
		Stack<Integer> tempstack = new Stack<>();
		int index = 0;
		while(!stack.isEmpty()) {
			int currentElement = stack.pop();
			tempstack.push(currentElement);
			if(currentElement == sequence[index]) {
				while(index < sequence.length && !tempstack.isEmpty()&&tempstack.peek() ==sequence[index]) {
					tempstack.pop();
					index++;
				}
			}
		}
		return index == sequence.length;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		int[] sequence = {2,1};
		System.out.println("Is the sequeue present?"+isSequencePresent(stack,sequence));
		int[] sequence1 = {1, 2, 3, 4};
		System.out.println("Is the sequeue present?"+isSequencePresent(stack,sequence1));
		

	}

}
