package Backjoon.Silver.II.num_12891;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 제출번호 : 82208649, 메모리 : 21192 KB, 시간 : 276 ms, 언어 : Java 11, 코드 길이 : 2145 B
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(
				new java.io.InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

		int N = Integer.parseInt(stringTokenizer.nextToken());
		int M = Integer.parseInt(stringTokenizer.nextToken());

		String dna = bufferedReader.readLine();
		int[] verification = solution1(bufferedReader.readLine());

		System.out.println(solution(dna, M, verification));
	}

	public static int solution(String dna, int M, int[] verification) {
		int count = 0;
		int i = 0;
		int j = M;
		int[] frist = solution2(dna.substring(i, j));
		if(solution3(verification, frist)) {
			count++;
		}

		while (j < dna.length()) {
			char out = dna.charAt(i);
			char in = dna.charAt(j);
			frist = solution4(frist, out, in);
			if(solution3(verification, frist)) {
				count++;
			}
			i++;
			j++;
		}

		return count;
	}

	public static int[] solution1(String s) {
		return Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).toArray();
	}
	public static int[] solution2(String s) {
		int[] arr = new int[4];

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
				case 'A' : arr[0]++; break;
				case 'C' : arr[1]++; break;
				case 'G' : arr[2]++; break;
				case 'T' : arr[3]++; break;
			}
		}

		return arr;
	}
	public static boolean solution3(int[] arr, int[] arr2) {
		if(arr[0] > arr2[0]){
			return false;
		}
		if(arr[1] > arr2[1]){
			return false;
		}
		if(arr[2] > arr2[2]){
			return false;
		}
		if(arr[3] > arr2[3]){
			return false;
		}

		return true;
	}
	public static int[] solution4(int[] arr, char out, char in) {
		switch (out) {
			case 'A' : arr[0]--; break;
			case 'C' : arr[1]--; break;
			case 'G' : arr[2]--; break;
			case 'T' : arr[3]--; break;
		}
		switch (in) {
			case 'A' : arr[0]++; break;
			case 'C' : arr[1]++; break;
			case 'G' : arr[2]++; break;
			case 'T' : arr[3]++; break;
		}

		return arr;
	}
}