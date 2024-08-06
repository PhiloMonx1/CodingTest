package Programmers.Lv01.lessons_12937;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SolutionTest {

	@Test
	void solution() {
		Solution example = new Solution();

		String case1 = example.solution(3);
		String case2 = example.solution(4);

		assertEquals("Odd", case1);
		assertEquals("Even", case2);
	}
}