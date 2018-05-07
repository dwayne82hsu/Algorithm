package insert;

import org.junit.Test;

import static org.junit.Assert.*;

public class InsertSortingTest {

    @Test
    public void sort() {
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        System.out.println("InsertSorting");
        System.out.println("Before Sorting");
        InsertSorting.print(data);
        new InsertSorting().sort(data);
        System.out.println("After Sorting");
        InsertSorting.print(data);
    }

    @Test
    public void sortPractice() {
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        System.out.println("InsertSorting");
        System.out.println("Before Sorting");
        InsertSorting.print(data);
        new InsertSorting().sortPractice(data);
        System.out.println("After Sorting");
        InsertSorting.print(data);
    }

}