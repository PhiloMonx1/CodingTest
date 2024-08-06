package Backjoon.Bronze.IV.num_11720;

import java.util.Scanner;

/**
 * 제출번호 : 82138513,
 * 메모리 : 17712KB,
 * 시간 : 208ms,
 * 언어 : Java 11,
 * 코드 길이 : 604B,
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int inputLength = scanner.nextInt();
		String input = scanner.next();

		System.out.println(calculateSum(inputLength, input));
	}

	public static int calculateSum(int inputLength, String input) {
		if (input.length() != inputLength) {
			throw new IllegalArgumentException("첫 번째 입력 값은 두 번째 입력 값의 길이와 같아야 합니다.");
		}

		int answer = 0;
		for (char s : input.toCharArray()) {
			answer += s - '0';
		}
		return answer;
	}
}
