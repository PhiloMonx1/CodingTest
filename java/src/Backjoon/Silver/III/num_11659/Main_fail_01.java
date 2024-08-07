package Backjoon.Silver.III.num_11659;

import java.util.Arrays;
import java.util.Scanner;

/**
 * !! 시간 초과 !!
 * 제출번호 : 82154929, 메모리 :  KB, 시간 :  ms, 언어 : Java 11, 코드 길이 : 1284 B,
 *
 * 원인 :
 * 1. createPrefixSumArray()는 내부적으로 for문을 사용하기 때문에 'O(n)' 시간 복잡도를 가진다.
 * 2. main()에서는 calculateRangeSum()를 for문으로 돌리기 때문에 표면상으로 'O(M)' 시간 복잡도를 가진다. (main의 'n'이 M이기 때문)
 * 3. 그러나 calculateRangeSum()는 내부적으로 createPrefixSumArray()를 사용하기 때문에 결과적으로 'O(M) * O(n)', 즉 O(Mn) 시간 복잡도를 가진다.
 *
 * 해결 :
 * 4. createPrefixSumArray()를 for문 바깥에서 먼저 사용해서 합배열을 구한 후 사용하면 'O(n + M)' 시간 복잡도로 줄일 수 있다.
 */
public class Main_fail_01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		String[] inputArr = input.split(" ");
		int M = Integer.parseInt(inputArr[1]);

		String[] arr = scanner.nextLine().split(" ");
		int[] arrInt = Arrays.stream(arr)
				.mapToInt(Integer::parseInt)
				.toArray();

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			input = scanner.nextLine();
			inputArr = input.split(" ");
			int left = Integer.parseInt(inputArr[0]);
			int right = Integer.parseInt(inputArr[1]);

			result.append(calculateRangeSum(arrInt, left, right)).append("\n");
		}

		if (result.length() > 0) {
			result.setLength(result.length() - 1);
		}

		System.out.println(result);
	}

	public static int calculateRangeSum(int[] arr, int left, int right) {
		int[] prefixSum = createPrefixSumArray(arr);
		right--;
		left--;

		if (left == 0) {
			return prefixSum[right];
		}

		return prefixSum[right] - prefixSum[left - 1];
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
