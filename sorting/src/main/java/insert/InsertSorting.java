package insert;

import base.BaseSorting;
import base.ISorting;

public class InsertSorting extends BaseSorting implements ISorting {

    public void sort(int[] data) {
        if (data != null && data.length > 1) {
            int currentPosition = 0;
            int target = 0;
            for (int i = 1; i < data.length; i++) {
                currentPosition = i;
                target = data[i];
                while(currentPosition > 0 && data[currentPosition - 1] > target) {
                    data[currentPosition] = data[currentPosition - 1];
                    currentPosition--;
                }
                data[currentPosition] = target;
            }
        }
    }

    public void sortPractice(int[] data) {
        if (data != null && data.length > 1) {
            int currentPosition = 0, target = 0;
            for (int i = 1; i < data.length; i++) {
                currentPosition = i;
                target = data[i];
                while (currentPosition > 0 && data[currentPosition - 1] > target) {
                    data[currentPosition] = data[currentPosition - 1];
                    currentPosition--;
                }
                data[currentPosition] = target;

            }
        }
    }

}
