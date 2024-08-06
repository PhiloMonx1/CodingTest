package Backjoon.Bronze.I.num_1546;

import java.util.Scanner;

/**
 * 제출번호 : 82141354, 메모리 : 19044 KB, 시간 : 208 ms, 언어 : Java 11, 코드 길이 : 709 B,
 */
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int subjectsNumber = scanner.nextInt();
		scanner.nextLine();
		String score = scanner.nextLine();

		System.out.println(average(subjectsNumber, score));
	}

	public static float average(int subjectsNumber, String score) {
		String[] scoreArr = score.split(" ");

		int M = Integer.parseInt(scoreArr[0]);

		for (int i = 1; i < subjectsNumber; i++) {
			M = Math.max(M, Integer.parseInt(scoreArr[i]));
		}

		float answer = 0;

		for (int i = 0; i < subjectsNumber; i++) {
			answer += (Float.parseFloat(scoreArr[i]) / M) * 100;
		}

		return answer / subjectsNumber;
	}
}
