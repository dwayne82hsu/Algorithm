package a0001twosum;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static int[] towSum(int[] numbers, int target) {
		if (numbers != null && numbers.length > 1) {
			Map<Integer, Integer> map = new HashMap<>();
			for (int i = 0; i < numbers.length; i++) {
				map.put(numbers[i], i);
			}

			for (int i = 0; i < numbers.length; i++) {
				int newTarget = target - numbers[i];

				if (map.containsKey(newTarget) && map.get(newTarget) != i) {
					return new int[]{ i+ 1, map.get(newTarget) + 1 };
				}
			}
		}

		return null;
	}

}
