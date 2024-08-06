package Programmers.Lv01.lessons_12943;

class Solution {
	public int solution(long num) {
		int limit = 500;
		int count = 0;

		while (count < limit) {
			if (num == 1) {
				return count;
			}
			if (num % 2 == 0) {
				num /= 2;
			} else {
				num = (num * 3) + 1;
			}
			count++;
		}
		return -1;
	}
}
