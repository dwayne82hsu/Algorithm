package base;

import org.junit.Test;

import static org.junit.Assert.*;

public class BaseSortingTest {

    @Test
    public void swap1() {
        System.out.println("swap1");
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        BaseSorting.print(data);
        BaseSorting.swap1(data, 3, 4);
        BaseSorting.print(data);
        System.out.println();
    }

    @Test
    public void swap2() {
        System.out.println("swap2");
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        BaseSorting.print(data);
        BaseSorting.swap2(data, 3, 4);
        BaseSorting.print(data);
        System.out.println();
    }

    @Test
    public void swap3() {
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        System.out.println("swap3");
        BaseSorting.print(data);
        BaseSorting.swap3(data, 3, 4);
        BaseSorting.print(data);
        System.out.println();
    }

    @Test
    public void print() {
        System.out.print("print");
        int[] data = new int[] { 34, 44, 12, 67, 77, 91, 32, 23 };
        BaseSorting.print(data);
    }
}