package bubble;

import base.BaseSorting;
import base.ISorting;

public class BubbleSorting extends BaseSorting implements ISorting {

    public void sort(int[] data) {
        if (data != null && data.length > 1) {
            int i, lastPosition;
            int flag = data.length;

            while (flag > 0) {
                lastPosition = flag;
                flag = 0;

                for (i = 1; i < lastPosition; i++) {
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
            int i = 0, lastPostion = 0, flag = data.length;

            while (flag > 0) {
                lastPostion = flag;
                flag = 0;
                for (i = 1; i < lastPostion; i++) {
                    if (data[i - 1] > data[i]) {
                        swap3(data, i - 1, i);
                        flag = i;
                    }
                }
            }
        }
    }

}
