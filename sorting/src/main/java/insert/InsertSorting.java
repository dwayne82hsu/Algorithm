package insert;

import base.BaseSorting;
import base.ISorting;

public class InsertSorting extends BaseSorting implements ISorting {

    public void sort(int[] data) {
        if (data != null && data.length > 1) {
            for (int i = 1; i < data.length; i++) {
                int target = data[i];
                while(i > 0 && data[i - 1] > target) {
                    data[i] = data[i - 1];
                    i--;
                }
                data[i] = target;
            }
        }
    }

    public void sortPractice(int[] data) {
        if (data != null && data.length > 1) {
            for (int i = 1; i < data.length; i++) {
                int target = data[i];

                while (i > 0 && data[i] < data[i - 1]) {
                    data[i] = data[i - 1];
                    i--;
                }

                data[i] = target;
            }
        }
    }

}
