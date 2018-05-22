package radix;

import base.BaseSorting;
import base.ISorting;

import java.util.ArrayList;

public class RadixSorting extends BaseSorting implements ISorting {

	@Override
	public void sort(int[] data) {
		// 首先确定排序的趟数;
		int max = data[0];
		for (int aData : data) {
			if (aData > max) {
				max = aData;
			}
		}
		int time = 0;
		// 判断位数;
		while (max > 0) {
			max /= 10;
			time++;
		}


		// 建立10个队列;
		ArrayList<ArrayList<Integer>> queues = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> queue = new ArrayList<>();
			queues.add(queue);
		}


		// 进行time次分配和收集;
		for (int i = 0; i < time; i++) {
			//分配数组元素;
			for (int aData : data) {
				//得到数字的第time+1位数;
				int x = aData % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
				ArrayList<Integer> queue = queues.get(x);
				queue.add(aData);
				queues.set(x, queue);
			}

			int count = 0; // 元素计数器;
			// 收集队列元素;
			for (int k = 0; k < 10; k++) {
				while (queues.get(k).size() > 0) {
					ArrayList<Integer> queue = queues.get(k);
					data[count++] = queue.get(0);
					queue.remove(0);
				}
			}
		}
	}

	public void sortPractice(int[] data) {
		int max = Integer.MIN_VALUE;

		for (int aData : data) {
			if (aData > max) {
				max = aData;
			}
		}

		int time = 0;
		while (max > 0) {
			max /= 10;
			time++;
		}

		ArrayList<ArrayList<Integer>> queues = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			ArrayList<Integer> queue = new ArrayList<>();
			queues.add(queue);
		}

		for (int i = 0; i < time; i++) {
			for (int aData : data) {
				int x = aData % (int) Math.pow(10, i + 1) / (int) Math.pow(10, i);
				ArrayList<Integer> queue = queues.get(x);
				queue.add(aData);
				queues.set(x, queue);
			}

			int count = 0; // 元素计数器;
			// 收集队列元素;
			for (int k = 0; k < 10; k++) {
				while (queues.get(k).size() > 0) {
					ArrayList<Integer> queue = queues.get(k);
					data[count++] = queue.get(0);
					queue.remove(0);
				}
			}
		}

	}

}