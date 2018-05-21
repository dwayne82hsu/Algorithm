package shell;

import base.BaseSorting;
import base.ISorting;

public class ShellSorting extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			int currentPostion = 0;
			int target = 0;
			for (int step = data.length / 2; step > 0; step /= 2) {
				for (int i = step; i < data.length; i++) {
					currentPostion = i;
					target = data[i];
					while (currentPostion >= step && data[currentPostion - step] > data[currentPostion]) {
						data[currentPostion] = data[currentPostion - step];
						currentPostion -= step;
					}
					data[currentPostion] = target;
				}
			}
		}
	}

	public void sortPractice(int[] data) {
		if (data != null && data.length > 1) {
			int currentPostion = 0;
			int target = 0;
			for (int step = data.length / 2; step > 0; step /= 2) {
				for (int i = step; i < data.length; i++) {
					currentPostion = i;
					target = data[i];
					while (currentPostion >= step && data[currentPostion - step] > data[currentPostion]) {
						data[currentPostion] = data[currentPostion - step];
						currentPostion -= step;
					}
					data[currentPostion] = target;
				}
			}
		}
	}

}
