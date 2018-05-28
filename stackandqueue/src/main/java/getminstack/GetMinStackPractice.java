package getminstack;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class GetMinStackPractice {

	private Deque<Integer> mDataStack;
	private Deque<Integer> mMinStack;

	public int getMin() throws Exception {
		if (mMinStack.isEmpty()) {
			throw new Exception("Your Stack is Empty!");
		}

		return mMinStack.peek();
	}

	public GetMinStackPractice() {
		mDataStack = new ArrayDeque<>();
		mMinStack = new ArrayDeque<>();
	}

	public void push(int val) {
		if (mMinStack.isEmpty()) {
			mMinStack.push(val);
		} else if (val <= mMinStack.peek()) {
			mMinStack.push(val);
		}

		mDataStack.push(val);
	}

	public int pop(int val) throws Exception {
		if (mDataStack.isEmpty()) {
			throw new Exception("Your Stack is Empty!");
		}

		int result = mDataStack.pop();
		if (result == mMinStack.peek()) {
			mMinStack.pop();
		}

		return result;
	}

}
