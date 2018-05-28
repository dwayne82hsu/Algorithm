package a0002.addtwonumbers;

import java.util.LinkedList;

public class AddTwoNumbers {

	public static class ListNode {
		int val;
		ListNode next;

		ListNode(int val) {
			this.val = val;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		ListNode head = new ListNode(0);
		ListNode point = head;
		int carry = 0, sum = 0;

		while (l1 != null && l2 != null) {
			sum = carry + l1.val + l2.val;
			point.next = new ListNode(sum % 10);
			carry = sum / 10;
			l1 = l1.next;
			l2 = l2.next;
			point = point.next;
		}

		while (l1 != null) {
			sum = carry + l1.val;
			point.next = new ListNode(sum % 10);
			carry = sum / 10;
			l1 = l1.next;
			point = point.next;
		}

		while (l2 != null) {
			sum = carry + l2.val;
			point.next = new ListNode(sum % 10);
			carry = sum / 10;
			l2 = l2.next;
			point = point.next;
		}

		if(carry != 0){
			point.next = new ListNode(carry);
		}

		return head.next;
	}

}
