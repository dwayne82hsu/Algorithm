package quick;

import base.BaseSorting;
import base.ISorting;

public class QuickSorting extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			quickSort(data, 0, data.length - 1);
		}
	}

	private void quickSort(int[] data, int l, int r) {
		if (l > r) {
			return;
		}

		int pivot = data[l];
		int i = l;
		int j = r;

		while (i < j) {
			while (pivot <= data[j] && i < j) {
				j--;
			}
			if (i < j) {
				data[i++] = data[j];
			}

			while (pivot >= data[i] && i < j) {
				i++;
			}
			if (i < j) {
				data[j--] = data[i];
			}

			data[i] = pivot;

			quickSort(data, l, i - 1);
			quickSort(data, i + 1, r);
		}
	}

}
