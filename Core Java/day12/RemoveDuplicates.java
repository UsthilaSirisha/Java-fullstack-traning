package com.day12;


public class RemoveDuplicates {

	 public static class ListNode {
			int val;
			ListNode next;
			
			ListNode(int val) {
				this.val = val;
			
			}
		}


	public static ListNode removeDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode current = head;
		ListNode prev = null;
		
		while (current != null) {
			if(prev != null && current.val == prev.val) {
				prev.next = current.next;
			}
			else {
				prev = current;
			}
		current = current.next;
		}
	
	
		return head;
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(3);
		
		head = removeDuplicates(head);
		ListNode temp = head;
		while(temp != null) {
			System.out.println(temp.val + "");
			temp = temp.next;
			}
		System.out.println();
	}

}

