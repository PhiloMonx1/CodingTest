package Backjoon.Silver.II.num_12891;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	@DisplayName("테스트 케이스 검증")
	void solution() {
		String dna = "CCTGGATTG";
		int M = 8;
		int[] verification = {2, 0, 1, 1};
		assertEquals(0, Main.solution(dna, M, verification));

		dna = "GATA";
		M = 2;
		verification = new int[] {1, 0, 0, 1};
		assertEquals(2, Main.solution(dna, M, verification));

		dna = "AACCGGTTAAC";
		M = 5;
		verification = new int[] {1, 1, 1, 0};
		assertEquals(2, Main.solution(dna, M, verification));
	}
	@Test
	@DisplayName("1 0 0 1 형태의 문자열이 들어올 때 int 배열로 만드는 메서드")
	void solution1() {
		int[] arr = Main.solution1("1 0 0 1");
		assertArrayEquals(new int[]{1, 0, 0, 1}, arr);
	}

	@Test
	@DisplayName("특정 문자이 들어올 때 ‘A’, ‘C’, ‘G’, ‘T’의 갯수 파악 후 int 배열로 만드는 메서드")
	void solution2() {
		int[] arr1 = Main.solution2("CCTGGATT");
		int[] arr2 = Main.solution2("CTGGATTG");

		assertArrayEquals(new int[]{1, 2, 2, 3}, arr1);
		assertArrayEquals(new int[]{1, 1, 3, 3}, arr2);
	}

	@Test
	@DisplayName("첫 번째 int 배열과 두 번째 int 배열을 비교. "
			+ "두 번째 배열의 모든 인덱스 값이 첫 번째 배열의 모든 인덱스 값보다 크면 true, 아니면 false")
	void solution3() {
		int[] arr = Main.solution1("2 0 1 1");
		int[] arr2 = Main.solution2("CTGGATTG");
		assertFalse(Main.solution3(arr, arr2));

		arr = Main.solution1("1 0 0 1");
		arr2 = Main.solution2("AT");
		assertTrue(Main.solution3(arr, arr2));
	}

	@Test
	@DisplayName("int 배열과 문자열 두 개가 주어질 때 첫 번째 문자열은 일치하는 인덱스 값 감소, 두 번째 문자열은 값 증가")
	void solution4() {
		int[] arr1 = Main.solution2("CCTGGATT");
		int[] arr2 = Main.solution4(arr1, 'C', 'G');

		assertArrayEquals(new int[]{1, 1, 3, 3}, arr2);
	}
}