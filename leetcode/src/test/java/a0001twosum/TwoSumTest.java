package a0001twosum;

import org.junit.Test;

public class TwoSumTest {

	@Test
	public void towSum() {

		int[] numbers = { 3, 2, 4 };
		int target = 6;

		int[] res = TwoSum.towSum(numbers, target);

		for(int i = 0; i < res.length; i++) {
			System.out.print(i == res.length - 1 ? res[i] : res[i] + ", ");
		}
	}
}