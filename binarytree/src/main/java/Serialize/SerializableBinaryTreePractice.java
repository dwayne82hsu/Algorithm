package Serialize;

import base.TreeNode;

public class SerializableBinaryTreePractice {

	public String tree2Str(TreeNode root) {
		StringBuilder res = new StringBuilder("");
		preOrder(root, res);
		return res.toString();
	}

	// 递归方法，用来先序遍历二叉树同时将其序列化为字符串
	private void preOrder(TreeNode root, StringBuilder str) {
		if (root == null) {
			str.append("#!");
			return;
		}

		str.append(root.value).append("!");
		preOrder(root.left, str);
		preOrder(root.right, str);
	}

	public TreeNode str2Tree(String str) {
		if (str == null || str.length() < 1) {
			return null;
		}

		// 将字符串按照"!"拆分为数组
		String[] strs = str.split("!");
		//调用递归方法deSerializeCore()方法来实现重建二叉树的功能,返回根结点
		TreeNode root = this.deSerializeCore(strs);
		// 注意返回结果
		return root;
	}

	private int index = 0;
	// 设计一个递归方法deSerializeCore用于使用strs[]数组的后面部分元素来建立一棵二叉树，并返回根结点
	// 递归方法可以有返回值或者没有返回值，不影响使用，如果有返回值要注意接收
	private TreeNode deSerializeCore(String[] strs) {
		if ("#".equals(strs[index])) {
			// 如果遇到的是#表示空节点，不再建立子树，这个结点null就是子树的根结点返回
			// 千万注意，返回前要将index向下移动，之后使用的是strs[]中后面部分的元素
			index++;
			return null;
		} else {
			TreeNode node = new TreeNode(strs[index]);
			index++;
			// 恢复左子树
			node.left = this.deSerializeCore(strs);
			// 恢复右子树
			node.right = this.deSerializeCore(strs);
			// 建立二叉树完成，返回根结点
			return node;
		}
	}

}
