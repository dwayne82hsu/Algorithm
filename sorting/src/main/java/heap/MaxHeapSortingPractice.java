package heap;

import base.BaseSorting;
import base.ISorting;

public class MaxHeapSortingPractice extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		if (data != null && data.length > 1) {
			buildMaxHeap(data);
			for (int i = data.length - 1; i > 1; i--) {
				swap3(data, 0, i);
				adjustHeap(data, 0, i);
			}
		}
	}

	private void buildMaxHeap(int[] data) {
		for (int i = (data.length -2) / 2; i >= 0; i--) {
			adjustHeap(data, i, data.length);
		}
	}

	private void adjustHeap(int[] data, int root, int length) {
		int target = data[root];
		for (int i = 2 * root + 1; i < length - 1; i = 2 * i + 1) {
			if (data[i] < data[i + 1]) {
				i++;
			}
			if (target >= data[i]) {
				break;
			} else {
				data[root] = data[i];
				root = i;
			}
		}
		data[root] = target;
	}

}
