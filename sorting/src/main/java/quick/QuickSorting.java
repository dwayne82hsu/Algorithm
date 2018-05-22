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

	private int getMiddle(int[] data, int l, int h) {
		int pivot = data[l];    //数组的第一个作为中轴  
		while (l < h) {
			while (l < h && data[h] >= pivot) {
				h--;
			}
			data[l] = data[h];   //比中轴小的记录移到低端

			while (l < h && data[l] <= pivot) {
				l++;
			}
			data[h] = data[l];   //比中轴大的记录移到高端
		}

		data[l] = pivot;              //中轴记录到尾  
		return l;                  //返回中轴的位置  
	}


	private void quickSort(int[] data, int l, int h) {
		if (l < h) {
			int m = getMiddle(data, l, h);  //将data数组进行一分为二
			quickSort(data, l, m - 1);      //对低字表进行递归排序
			quickSort(data, m + 1, h);      //对高字表进行递归排序

		}
	}

}
