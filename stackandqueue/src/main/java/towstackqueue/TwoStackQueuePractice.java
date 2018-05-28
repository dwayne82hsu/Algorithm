package towstackqueue;

import java.util.Stack;

public class TwoStackQueuePractice {

	private Stack<Integer> mPushStack;
	private Stack<Integer> mPopStack;

	public TwoStackQueuePractice() {
		mPushStack = new Stack<>();
		mPopStack = new Stack<>();
	}

	public void add(int data) {
		mPushStack.push(data);
	}

	public int pop() throws Exception {
		if (mPushStack.empty() && mPopStack.empty()) {
			throw new Exception("Your Queue is Empty!");
		} else if (mPopStack.empty()) {
			while (!mPushStack.empty()) {
				mPopStack.push(mPushStack.pop());
			}
		}

		return mPopStack.pop();
	}

	public int peek() throws Exception {
		if (mPushStack.empty() && mPopStack.empty()) {
			throw new Exception("Your Queue is Empty!");
		} else if (mPopStack.empty()) {
			while (!mPushStack.empty()) {
				mPopStack.push(mPushStack.pop());
			}
		}

		return mPopStack.peek();
	}

}
