package select;

import base.BaseSorting;
import base.ISorting;

public class SelectSorting extends BaseSorting implements ISorting {

    public void sort(int[] data) {
        if (data != null && data.length > 1) {
            for (int i = 0; i < data.length - 1; i++) {
                int minIndex = getMinIndex(i, data);
                if (minIndex != i) {
                    swap3(data, i, minIndex);
                }
            }
        }
    }

    private int getMinIndex(int start, int[] data) {
        int minIndex = start;
        for (int i = start; i < data.length; i++) {
            if (data[i] < data[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }

}
