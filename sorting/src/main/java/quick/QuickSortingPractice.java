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
		if(l > h) {
			return;
		}
		int i = l;
		int j = h;
		int pivot = data[i];
		while (l < h) {
			while (l < h && data[j] >= pivot) {
				j--;
			}
			if (i < j) {
				data[i++] = data[j];
			}

			while (l < h && data[i] <= pivot) {
				i++;
			}
			if (i < j) {
				data[j--] = data[i];
			}
		}
		data[i] = pivot;
		quickSort(data, l, i - 1);
		quickSort(data, i + 1, h);
	}

}
