package getminstack;

import java.util.Stack;

public class GetMinStack {

	private Stack<Integer> mDataStack;
	private Stack<Integer> mMinStack;

	public GetMinStack() {
		mDataStack = new Stack<>();
		mMinStack = new Stack<>();
	}

	public Integer getMin() throws Exception {
		if (mMinStack.empty()) {
			throw new Exception("Your Stack is Empty!");
		}

		return mMinStack.peek();
	}

	public void push(int data) {
		if (mMinStack.empty()) {
			mMinStack.push(data);
		} else if (data <= mMinStack.peek()) {
			mMinStack.push(data);
		}
		mDataStack.push(data);
	}

	public int pop() throws Exception {
		if (mDataStack.empty()) {
			throw new Exception("Your Stack is Empty!");
		}

		int value = mDataStack.pop();

		if (value == getMin()) {
			mMinStack.pop();
		}

		return value;
	}

}
