package com.day12;

import java.util.Stack;

public class StackSorting {
	public static void sortStack(Stack<Integer> stack) {
		// TODO Auto-generated method stub
		Stack<Integer> tstack= new Stack<>();
		while (!stack.isEmpty()) {
			int temp = stack.pop();
			while (!tstack.isEmpty() && tstack.peek() < temp) {
				stack.push(tstack.pop());
			}
			tstack.push(temp);
		}
		while (!tstack.isEmpty()) {
		stack.push(tstack.pop());
	}

}
public static void main(String[] args) {
Stack<Integer> stack = new Stack<>();
stack.push(3);
stack.push(2);
stack.push(1);
stack.push(5);
stack.push(4);
System.out.println("Original Stack : " + stack);
sortStack(stack);
System.out.println("Sorted Stack : " + stack);
}
}

