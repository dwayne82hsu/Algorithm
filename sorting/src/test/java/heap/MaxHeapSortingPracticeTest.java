package heap;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxHeapSortingPracticeTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23, 32 };
		System.out.println("MaxHeapSorting");
		System.out.println("Before Sorting");
		MaxHeapSortingPractice.print(data);
		new MaxHeapSortingPractice().sort(data);
		System.out.println("After Sorting");
		MaxHeapSortingPractice.print(data);
	}

}