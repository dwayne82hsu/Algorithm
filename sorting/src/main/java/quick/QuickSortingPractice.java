package quick;

import base.BaseSorting;
import base.ISorting;

public class QuickSortingPractice extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			quickSort(data, 0, data.length - 1);
		}
	}

	private void quickSort(int[] data, int l, int h) {
		if (l < h) {
			int m = getMiddle(data, l, h);
			quickSort(data, l, m - 1);
			quickSort(data, m + 1, h);
		}
	}

	private int getMiddle(int[] data, int l, int h) {
		int pivot = data[l];
		while (l < h) {
			while (l < h && data[h] >= pivot) {
				h--;
			}
			data[l] = data[h];

			while (l < h && data[l] <= pivot) {
				l++;
			}
			data[h] = data[l];
		}
		data[l] = pivot;
		return l;
	}

}
