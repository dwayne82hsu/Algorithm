package bubble;

import base.BaseSorting;
import base.ISorting;

public class BubbleSorting extends BaseSorting implements ISorting {

    public void sort(int[] data) {
        if (data != null && data.length > 1) {
            int i, j;
            int flag = data.length;

            while (flag > 0) {
                j = flag;
                flag = 0;

                for (i = 1; i < j; i++) {
                    if (data[i] < data[i - 1]) {
                        swap3(data, i, i - 1);

                        flag = i;
                    }
                }
            }
        }
    }

    public void sortPractice(int[] data) {
        if (data != null && data.length > 1) {
            int i, lastPosition;
            int flag = data.length;
            while (flag > 0) {
                lastPosition = flag;
                flag = 0;
                for (i = 1; i < lastPosition; i++) {
                    if (data[i] < data[i - 1]) {
                        swap3(data, i - 1, i);
                        flag = i;
                    }
                }
            }
        }
    }

}
