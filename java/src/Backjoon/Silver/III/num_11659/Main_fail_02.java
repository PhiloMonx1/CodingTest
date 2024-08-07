package Backjoon.Silver.III.num_11659;

import java.util.Arrays;
import java.util.Scanner;

/**
 * !! 시간 초과 !!
 * 제출번호 : 82157514, 메모리 :  KB, 시간 :  ms, 언어 : Java 11, 코드 길이 : 1283 B
 *
 * 원인 : Scanner가 느리다. 많은 데이터를 받을 경우 BufferedReader를 사용할 것.
 */
public class Main_fail_02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputArr = input.split(" ");
		int M = Integer.parseInt(inputArr[1]);

		String[] arr = scanner.nextLine().split(" ");
		int[] arrInt = Arrays.stream(arr)
				.mapToInt(Integer::parseInt)
				.toArray();

		int[] prefixSumArray = createPrefixSumArray(arrInt);

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			input = scanner.nextLine();
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
