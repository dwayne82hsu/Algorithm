package select;

import base.BaseSorting;
import org.junit.Test;

import static org.junit.Assert.*;

public class SelectSortingTest {

    @Test
    public void sort() {

        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        System.out.println("SelectSorting");
        System.out.println("Before Sorting");
        SelectSorting.print(data);
        new SelectSorting().sort(data);
        System.out.println("After Sorting");
        SelectSorting.print(data);

    }
}