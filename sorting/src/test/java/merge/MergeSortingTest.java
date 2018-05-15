package merge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortingTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
		System.out.println("MergeSorting");
		System.out.println("Before Sorting");
		MergeSorting.print(data);
		new MergeSorting().sort(data);
		System.out.println("After Sorting");
		MergeSorting.print(data);
	}

}