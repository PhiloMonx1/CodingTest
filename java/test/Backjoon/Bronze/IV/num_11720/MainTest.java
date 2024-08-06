package Backjoon.Bronze.IV.num_11720;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {
	Main example = new Main();

	@Test
	@DisplayName("문제 예시 테스트")
	void calculateSum() {
		int case1 = example.calculateSum(1,"1");
		int case2 = example.calculateSum(5,"12345");
		int case3 = example.calculateSum(25,"7000000000000000000000000");
		int case4 = example.calculateSum(11,"10987654321");

		assertEquals(1, case1);
		assertEquals(15, case2);
		assertEquals(7, case3);
		assertEquals(46, case4);
	}


	@Test
	@DisplayName("커스텀 테스트 : 예외 발생")
	void calculateSum_exception() {
		Exception exception = assertThrows(IllegalArgumentException.class, () -> {
			example.calculateSum(1, "12345");
		});
		assertEquals("첫 번째 입력 값은 두 번째 입력 값의 길이와 같아야 합니다.", exception.getMessage());
	}
}