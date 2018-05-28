package traverse;

import Serialize.SerializableBinaryTree;
import base.TreeNode;
import org.junit.Test;

public class TraverseableBinaryTreeTest {

	String treeStr = "1!2!4!8!#!#!9!#!#!5!10!#!#!#!3!6!#!#!7!#!#!";
	SerializableBinaryTree sbt = new SerializableBinaryTree();
	TreeNode<String> tree = sbt.str2Tree(treeStr);

	@Test
	public void preOrderRecur() {
		TraverseableBinaryTree.preOrderRecur(tree);
	}

	@Test
	public void inOrderRecur() {
		TraverseableBinaryTree.inOrderRecur(tree);
	}

	@Test
	public void followOrderRecur() {
		TraverseableBinaryTree.postOrderRecur(tree);
	}

	@Test
	public void preOrder() {
		TraverseableBinaryTree.preOrderRecur(tree);
		System.out.println();
		TraverseableBinaryTree.preOrder(tree);
	}

	@Test
	public void inOrder() {
		TraverseableBinaryTree.inOrderRecur(tree);
		System.out.println();
		TraverseableBinaryTree.inOrder(tree);
	}

	@Test
	public void postOrder() {
		TraverseableBinaryTree.postOrderRecur(tree);
		System.out.println();
		TraverseableBinaryTree.postOrder2Stacks(tree);
		System.out.println();
		TraverseableBinaryTree.postOrder1Stack(tree);
	}

	@Test
	public void levelTraverse() {
		TraverseableBinaryTree.levelTravel(tree);
		System.out.println();

		TraverseableBinaryTree.levelTravelWithLineFeed(tree);
	}

}