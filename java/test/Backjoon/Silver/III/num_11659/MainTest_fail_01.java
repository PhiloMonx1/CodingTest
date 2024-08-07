package Backjoon.Silver.III.num_11659;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest_fail_01 {

	@Test
	@DisplayName("int[]을 파라미터로 받아 해당 배열의 합 배열을 리턴")
	void createPrefixSumArray() {
		int[] arr = {1, 2, 3, 4, 5};
		int[] result = {1, 3, 6, 10, 15};

		assertArrayEquals(result, Main_fail_01.createPrefixSumArray(arr));
	}


	@Test
	@DisplayName("배열의 left번 값 부터 right번 값까지 까지 더한 값을 리턴")
	void calculateRangeSum() {
		int[] arr = {5, 4, 3, 2, 1};
		assertAll(
				() -> assertEquals(12, Main_fail_01.calculateRangeSum(arr, 1, 3)),
				() -> assertEquals(9, Main_fail_01.calculateRangeSum(arr, 2, 4)),
				() -> assertEquals(1, Main_fail_01.calculateRangeSum(arr, 5, 5))
		);
	}
}