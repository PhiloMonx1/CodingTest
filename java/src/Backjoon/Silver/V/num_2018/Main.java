package Backjoon.Silver.V.num_2018;

import java.util.Scanner;

/**
 * 제출번호 : 82163498, 메모리 : 17756 KB, 시간 : 184 ms, 언어 : Java 11, 코드 길이 : 589 B
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		System.out.println(solution(number));
	}

	public static int solution(int number) {
		int count = 1;
		int sum = 1;
		int startIndex = 1;
		int endIndex = 1;

		for (int i = 1; i < number; i++) {
			if (sum == number){
				count++;
				endIndex++;
				sum += endIndex;
			} else if (sum < number){
				endIndex++;
				sum += endIndex;
			} else {
				sum -= startIndex;
				startIndex++;
			}
		}

		return count;
	}
}