package Serialize;

import base.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class SerializableBinaryTreeTest {

	@Test
	public void tree2Str() {
	}

	@Test
	public void str2Tree() {

		String treeStr = "1!2!4!8!#!#!9!#!#!5!10!#!#!#!3!6!#!#!7!#!#!";

		SerializableBinaryTree sbt = new SerializableBinaryTree();

		TreeNode<String> tree = sbt.str2Tree(treeStr);

		String resultStr = sbt.tree2Str(tree);

		System.out.print(treeStr.equals(resultStr));
	}
}