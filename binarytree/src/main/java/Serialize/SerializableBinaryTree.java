package Serialize;

import base.TreeNode;

public class SerializableBinaryTree {

	public String tree2Str(TreeNode root) {
		//注意：Java中String是不可改变的，不能进行引用传递，改为使用StringBuffer
		StringBuilder res = new StringBuilder("");
		//调用递归方法完成二叉树遍历序列化
		this.preOrder(root, res);
		//返回结果
		return res.toString();
	}

	//递归方法，用来先序遍历二叉树同时将其序列化为字符串
	private void preOrder(TreeNode root, StringBuilder str) {
		//递归结束的边界条件
		if (root == null) {
			str.append("#!");
			return;
		}

		//先遍历根结点
		str.append(root.value + "!");
		//遍历左子树
		this.preOrder(root.left, str);
		//遍历右子树
		this.preOrder(root.right, str);
	}

	public TreeNode str2Tree(String str) {
		//特殊输入
		if (str == null || str.length() <= 0) return null;
		//将字符串按照","拆分为数组
		String[] strs = str.split("!");
		//调用递归方法deSerializeCore()方法来实现重建二叉树的功能,返回根结点
		TreeNode root = this.deSerializeCore(strs);
		//注意返回结果
		return root;
	}

	private int index = 0;

	// 设计一个递归方法deSerializeCore用于使用strs[]数组的后面部分元素来建立一棵二叉树，并返回根结点
	// 递归方法可以有返回值或者没有返回值，不影响使用，如果有返回值要注意接收
	private TreeNode deSerializeCore(String[] strs) {
		if ("#".equals(strs[index])) {
			//如果遇到的是#表示空节点，不再建立子树，这个结点null就是子树的根结点返回
			//千万注意，返回前要将index向下移动，之后使用的是strs[]中后面部分的元素
			index++;
			return null;
		} else {
			//如果不为空结点，则先恢复这个结点
			TreeNode newNode = new TreeNode(0);
			newNode.value = Integer.parseInt(strs[index]);
			//千万注意在递归调用之前(使用了一个元素建立结点之后)，要将index向后移动1位
			index++;
			//恢复左子树
			newNode.left = this.deSerializeCore(strs);
			//恢复右子树
			newNode.right = this.deSerializeCore(strs);
			//建立二叉树完成，返回根结点
			return newNode;
		}
	}

}
