package Backjoon.Silver.IV.num_1940;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 제출번호 : 82166881, 메모리 : 16832 KB, 시간 : 164 ms, 언어 : Java 11, 코드 길이 : 1204 B
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new java.io.InputStreamReader(System.in));

		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int n = Integer.parseInt(stringTokenizer.nextToken());
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		int m = Integer.parseInt(stringTokenizer.nextToken());

		int[] arr = new int[n];
		stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(stringTokenizer.nextToken());
		}

		System.out.println(solution(n, m, arr));
	}

	public static int solution(int n, int m, int[] arr) {
		int count = 0;
		int startIndex = 0;
		int endIndex = n - 1;

		Arrays.sort(arr);

		while (startIndex < endIndex) {
			if((arr[startIndex] + arr[endIndex]) == m) {
				count++;
				startIndex++;
				endIndex--;
			} else if(arr[startIndex] + arr[endIndex] < m) {
				startIndex++;
			} else {
				endIndex--;
			}
		}

		return count;
	}
}