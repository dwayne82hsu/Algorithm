package shell;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShellSortingTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
		System.out.println("ShellSorting");
		System.out.println("Before Sorting");
		ShellSorting.print(data);
		new ShellSorting().sort(data);
		System.out.println("After Sorting");
		ShellSorting.print(data);
	}

}