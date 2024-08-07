package Backjoon.Silver.III.num_11659;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest_fail_02 {

	@Test
	void calculateRangeSum() {
		int[] originalArr = {5, 4, 3, 2, 1};
		int[] arr = Main_fail_02.createPrefixSumArray(originalArr);

		assertAll(
				() -> assertEquals(12, Main_fail_02.calculateRangeSum(arr, 1, 3)),
				() -> assertEquals(9, Main_fail_02.calculateRangeSum(arr, 2, 4)),
				() -> assertEquals(1, Main_fail_02.calculateRangeSum(arr, 5, 5))
		);
	}
}