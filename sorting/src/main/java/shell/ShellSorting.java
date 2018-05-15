package shell;

import base.BaseSorting;
import base.ISorting;

public class ShellSorting extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			int currentPosition = 0;
			int target = 0;
			for (int step = data.length / 2; step > 0; step /= 2) {
				for (int i = step; i < data.length; i++) {
					target = data[i];
					for (currentPosition = i - step; currentPosition >= 0; currentPosition -= step) {
						if (data[currentPosition] > target) {
							data[currentPosition + step] = data[currentPosition];
						} else {
							break;
						}
					}
					data[currentPosition + step] = target;
				}
			}
		}
	}

}
