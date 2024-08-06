package Backjoon.Bronze.I.num_1546;

import java.util.Scanner;

/**
 * 제출번호 : 82142061, 메모리 : 18000 KB, 시간 : 196 ms, 언어 : Java 11, 코드 길이 : 620 B,
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

		int M = 0;
		float sum = 0;

		for (int i = 0; i < subjectsNumber; i++) {
			M = Math.max(M, Integer.parseInt(scoreArr[i]));
			sum += Integer.parseInt(scoreArr[i]);
		}

		return (sum / M * 100) / subjectsNumber;
	}
}
