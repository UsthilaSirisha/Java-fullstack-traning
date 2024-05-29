package com.day12;



  public class MiddleElement {
	  public static class ListNode {
			int val;
			ListNode next;
			
			ListNode(int x) {
				val = x;
				next = null;
			}
		}

 
	
	public static ListNode findMiddle(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		ListNode slow = head;
		ListNode fast = head;
		
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
	
		return slow;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		ListNode middle = findMiddle(head);
		if (middle != null) {
			System.out.println("Middle element:" + middle.val);
			}
	}

}
		
		

	


