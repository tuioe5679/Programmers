package level1;

/*
콜라츠 추측*/
public class Solution_7 {
	public int solution(long num) {
		long value = 0;
		int answer = 0;
		if (num % 2 == 0) {
			value = num / 2;
			answer++;
		} else {
			value = (num * 3) + 1;
			answer++;
		}
		while (value != 1) {
			if (value % 2 == 0) {
				value = value / 2;
				answer++;
			} else {
				value = (value * 3) + 1;
				answer++;
			}
		}
		if (num == 1) {
			return 0;
		} else if (answer >= 500) {
			return -1;
		}
		return answer;
	}
}
