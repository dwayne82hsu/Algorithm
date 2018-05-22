package bubble;

import org.junit.Test;

import static org.junit.Assert.*;

public class BubbleSortingTest {

    @Test
    public void sort() {
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23, 32 };
        System.out.println("BubbleSorting");
        System.out.println("Before Sorting");
        BubbleSorting.print(data);
        new BubbleSorting().sort(data);
        System.out.println("After Sorting");
        BubbleSorting.print(data);
    }

    @Test
    public void sortPractice() {
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23, 32 };
        System.out.println("BubbleSorting");
        System.out.println("Before Sorting");
        BubbleSorting.print(data);
        new BubbleSorting().sortPractice(data);
        System.out.println("After Sorting");
        BubbleSorting.print(data);
    }
}