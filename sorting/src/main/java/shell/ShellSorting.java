package shell;

import base.BaseSorting;
import base.ISorting;

public class ShellSorting extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			int target = 0;
			for (int step = data.length / 2; step > 0; step /= 2) {
				for (int i = step; i < data.length; i++) {
					target = data[i];

					while (i - step >= 0 && data[i - step] > target) {
						data[i] = data[i - step];
						i -= step;
					}

					data[i] = target;
				}
			}
		}
	}

	public void sortPractice(int[] data) {
		if (data != null && data.length > 1) {
			int target = 0;

			for (int step = data.length / 2; step > 0; step /= 2) {
				for (int i = step; i < data.length; i++) {
					target = data[i];
					while (i - step >= 0 && data[i - step] > target) {
						data[i] = data[i - step];
						i -= step;
					}

					data[i] = target;
				}
			}
		}
	}

}
