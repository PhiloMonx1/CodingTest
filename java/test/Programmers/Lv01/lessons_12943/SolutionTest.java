package Programmers.Lv01.lessons_12943;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void solution() {
		Solution example = new Solution();

		int case1 = example.solution(6);
		int case2 = example.solution(16);
		int case3 = example.solution(626331);

		assertEquals(8, case1);
		assertEquals(4, case2);
		assertEquals(-1, case3);
	}
}