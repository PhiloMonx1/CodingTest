package Backjoon.Silver.III.num_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 제출번호 : 82159222, 메모리 : 53960 KB, 시간 : 536 ms, 언어 : Java 11, 코드 길이 : 1589 B
 * <p>
 * 개선 : `split()` 대신  `StringTokenizer` 사용해서 효율성 개선
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new java.io.InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());

		stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int[] arrInt = new int[N];
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = Integer.parseInt(stringTokenizer.nextToken());
		}
		int[] prefixSumArray = createPrefixSumArray(arrInt);

		StringBuilder result = new StringBuilder();

		for (int i = 0; i < M; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int left = Integer.parseInt(stringTokenizer.nextToken());
			int right = Integer.parseInt(stringTokenizer.nextToken());

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