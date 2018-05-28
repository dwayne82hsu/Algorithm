package traverse;

import base.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class TraverseableBinaryTreePractice {

	public static void preOrderRecur(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		System.out.print(root.value + "\t");
		preOrder(root.left);
		preOrder(root.right);
	}

	public static void inOrderRecur(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		preOrder(root.left);
		System.out.print(root.value + "\t");
		preOrder(root.right);
	}

	public static void postOrderRecur(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		preOrder(root.left);
		preOrder(root.right);
		System.out.print(root.value + "\t");
	}

	/*
	 * 先序遍历二叉树（非递归）
	 * 思路：1. 头结点入栈，
	 * 		2. 从stack 弹出栈顶节点记为cur并打印
	 * 		3. 如果cur.right不为空，cur.right入栈
	 * 		4. 如果cur.left不为空，cur.left入栈
	 */
	public static void preOrder(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		Deque<TreeNode<String>> stack = new ArrayDeque<>();

		stack.push(root);

		while (!stack.isEmpty()) {
			TreeNode cur = stack.pop();

			System.out.print(cur.value + "\t");

			if (cur.right != null) {
				stack.push(cur.right);
			}

			if (cur.left != null) {
				stack.push(cur.left);
			}
		}
	}

	/*
	 * 中序遍历二叉树（非递归）
	 *
	 * * 思路：1. cur=root
	 * 		  2. cur入栈
	 * 		  3. cur=cur.left直到cur为空时，弹出栈顶记为node并打印
	 * 		  4. cur=node.right.重复2
	 * 		  5.stack与cur同时为空，结束
	 */
	public static void inOrder(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		Deque<TreeNode<String>> stack = new ArrayDeque<>();
		TreeNode<String> cur = root;

		while (!stack.isEmpty() || cur != null) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}

			cur = stack.pop();
			System.out.print(cur.value + "\t");
			cur = cur.right;
		}
	}

	/*
	 * 后序遍历二叉树（非递归）
	 *
	 */
	public static void postOrder2Stacks(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		Deque<TreeNode<String>> s1 = new ArrayDeque<>();
		Deque<TreeNode<String>> s2 = new ArrayDeque<>();

		s1.push(root);

		while (!s1.isEmpty()) {
			TreeNode<String> cur = s1.pop();
			s2.push(cur);

			if (cur.left != null) {
				s1.push(cur.left);
			}
			if (cur.right != null) {
				s1.push(cur.right);
			}
		}

		while (!s2.isEmpty()) {
			System.out.print(s2.pop().value + "\t");
		}
	}

	/*
	 * 后序遍历二叉树（非递归）
	 *
	 */
	public static void postOrder1Stack(TreeNode<String> root) {
		if (root == null) {
			return;
		}

		Deque<TreeNode<String>> stack = new ArrayDeque<>();
		TreeNode<String> h = root, c = null;

		stack.push(root);

		while (!stack.isEmpty()) {
			c = stack.peek();
			if (c.left != null && h.left != h.right) {
				stack.push(c.left);
			} else if (c.right != null && h != c.right) {
				stack.push(c.right);
			} else {
				System.out.print(stack.pop().value + "\t");
				h = c;
			}
		}
	}

	/**
	 * @param root 树根节点
	 *             层序遍历二叉树，用队列实现，先将根节点入队列，只要队列不为空，然后出队列，并访问，接着讲访问节点的左右子树依次入队列
	 */
	public static void levelTravel(TreeNode<String> root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode<String>> queue = new ArrayDeque<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			System.out.print(cur.value + "\t");

			if (cur.left != null) {
				queue.add(cur.left);
			}
			if (cur.right != null) {
				queue.add(cur.right);
			}
		}
	}

	public static void levelTravelWithLineFeed(TreeNode<String> root) {
		if (root == null) {
			return;
		}
		Queue<TreeNode<String>> queue = new ArrayDeque<>();
		TreeNode<String> last = root, nlast = root;

		queue.add(root);
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			System.out.print(cur.value + "\t");

			if (cur.left != null) {
				queue.add(cur.left);
				nlast = cur.left;
			}
			if (cur.right != null) {
				queue.add(cur.right);
				nlast = cur.right;
			}
			if (last == cur) {
				System.out.println();
				last = nlast;
			}
		}
	}

}
