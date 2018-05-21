package merge;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortingPracticeTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23, 32 };
		System.out.println("MergeSorting");
		System.out.println("Before Sorting");
		MergeSortingPractice.print(data);
		new MergeSortingPractice().sort(data);
		System.out.println("After Sorting");
		MergeSortingPractice.print(data);
	}

}