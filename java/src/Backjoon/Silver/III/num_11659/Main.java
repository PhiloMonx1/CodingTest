package Backjoon.Silver.III.num_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

/**
 * 제출번호 : 82158402, 메모리 : 60436 KB, 시간 : 584 ms, 언어 : Java 11, 코드 길이 : 1408 B
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new java.io.InputStreamReader(System.in));
		String input = bufferedReader.readLine();
		String[] inputArr = input.split(" ");
		int M = Integer.parseInt(inputArr[1]);

		String[] arr = bufferedReader.readLine().split(" ");
		int[] arrInt = Arrays.stream(arr)
				.mapToInt(Integer::parseInt)
				.toArray();

		int[] prefixSumArray = createPrefixSumArray(arrInt);

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			input = bufferedReader.readLine();
			inputArr = input.split(" ");
			int left = Integer.parseInt(inputArr[0]);
			int right = Integer.parseInt(inputArr[1]);

			result.append(calculateRangeSum(prefixSumArray, left, right)).append("\n");
		}

		if (result.length() > 0) {
			result.setLength(result.length() - 1);
		}

		System.out.println(result);
	}

	public static int calculateRangeSum(int[] arr, int left, int right) {
		right--;
		left--;

		if (left == 0) {
			return arr[right];
		}

		return arr[right] - arr[left - 1];
	}

	public static int[] createPrefixSumArray(int[] arr) {
		int[] sum = new int[arr.length];

		sum[0] = arr[0];
		for (int i = 1; i < arr.length; i++) {
			sum[i] = sum[i - 1] + arr[i];
		}

		return sum;
	}
}