package com.day12;

class ListNode {
	int val;
	ListNode next;
	ListNode(int val) {
		this.val = val;
		this.next = null;
	}
}

public class MergeSortedLinkedLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(0);
		ListNode tail = dummy;
		
		while (l1 != null && l2 != null) {
			if (l1.val <= l2.val) {
				tail.next = l1;
				l1 = l1.next;
			} else {
				tail.next = l2;
				l2 = l2.next;
			}
			tail = tail.next;
		}
			if(l1 != null) {
				tail.next = l1;
			} else {
				tail.next = l2;
			}
			return dummy.next ;
		}
		public static void printList(ListNode head) {
			ListNode current = head;
			while (current != null) {
				System.out.println(current.val + " ");
				current = current.next;
			}
			System.out.println();
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListNode l1 = new ListNode(1);
	l1.next = new ListNode(3);
l1.next.next = new ListNode(5);
ListNode l2 = new ListNode(2);
l2.next = new ListNode(4);
l2.next.next = new ListNode(6);
ListNode mergeList = mergeTwoLists(l1, l2);
printList(mergeList);
	}	
}
