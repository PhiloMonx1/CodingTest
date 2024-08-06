package Backjoon.Bronze.I.num_1546;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {
	Main example = new Main();

	private static final double DELTA = 0.01;
	@Test
	void average_case1() {
		assertEquals(75.0, example.average(3,"40 80 60"), DELTA);
	}
	@Test
	void average_case2() {
		assertEquals(66.666667, example.average(3,"10 20 30"), DELTA);
	}
	@Test
	void average_case3() {
		assertEquals(75.25, example.average(4,"1 100 100 100"), DELTA);
	}
	@Test
	void average_case4() {
		assertEquals(38.75, example.average(5,"1 2 4 8 16"), DELTA);
	}
	@Test
	void average_case5() {
		assertEquals(65.0, example.average(2,"3 10"), DELTA);
	}
	@Test
	void average_case6() {
		assertEquals(32.5, example.average(4,"10 20 0 100"), DELTA);
	}
	@Test
	void average_case7() {
		assertEquals(100.0, example.average(1,"50"), DELTA);
	}
	@Test
	void average_case8() {
		assertEquals(55.55555555555556, example.average(9,"10 20 30 40 50 60 70 80 90"), DELTA);
	}
}