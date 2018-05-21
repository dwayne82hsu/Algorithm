package radix;

import org.junit.Test;

import static org.junit.Assert.*;

public class RadixSortingTest {

	@Test
	public void sort() {
		int[] data = new int[] { 34, 44, 12, 32, 67, 77, 91, 32, 23 };
		System.out.println("RadixSorting");
		System.out.println("Before Sorting");
		RadixSorting.print(data);
		new RadixSorting().sort(data);
		System.out.println("After Sorting");
		RadixSorting.print(data);
	}


	@Test
	public void sortPractice() {
		int[] data = new int[] { 34, 44, 12, 32, 67, 77, 91, 32, 23 };
		System.out.println("RadixSorting");
		System.out.println("Before Sorting");
		RadixSorting.print(data);
		new RadixSorting().sortPractice(data);
		System.out.println("After Sorting");
		RadixSorting.print(data);
	}

}