package a0002.addtwonumbers;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

	@Test
	public void addTwoNumbers() {
		AddTwoNumbers.ListNode list11 = new AddTwoNumbers.ListNode(8);
		AddTwoNumbers.ListNode list12 = new AddTwoNumbers.ListNode(9);
		AddTwoNumbers.ListNode list13 = new AddTwoNumbers.ListNode(9);

		AddTwoNumbers.ListNode list21 = new AddTwoNumbers.ListNode(2);

		list11.next = list12;
		list12.next = list13;
		list13.next = null;
		list21.next = null;

		AddTwoNumbers.ListNode result = AddTwoNumbers.addTwoNumbers(list11, list21);

		while(result != null){
			System.out.print(result.val);
			if (result.next != null) {
				System.out.print(" -> ");
			}

			result = result.next;
		}
	}
}