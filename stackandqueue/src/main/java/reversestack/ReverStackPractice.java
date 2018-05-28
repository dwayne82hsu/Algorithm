package reversestack;

import java.util.Stack;

public class ReverStackPractice {

	private static int getAndRemoveLastElement(Stack<Integer> stack) {
		int result = stack.pop();
		if (stack.empty()) {
			return result;
		} else {
			int last = getAndRemoveLastElement(stack);
			stack.push(result);

			return last;
		}
	}

	public static void reverse(Stack<Integer> stack) throws Exception {
		if (stack == null) {
			throw new Exception("Your Stack is Empty!");
		} else if (stack.empty()) {
			return;
		}

		int last = getAndRemoveLastElement(stack);
		reverse(stack);
		stack.push(last);
	}

}
