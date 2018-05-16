package quick;

import org.junit.Test;

import static org.junit.Assert.*;

public class QuickSortingPracticeTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
		System.out.println("MergeSorting");
		System.out.println("Before Sorting");
		QuickSortingPractice.print(data);
		new QuickSortingPractice().sort(data);
		System.out.println("After Sorting");
		QuickSortingPractice.print(data);
	}

}