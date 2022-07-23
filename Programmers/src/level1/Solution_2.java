package level1;

/*
x만큼 간격이 있는 n개의 숫자*/

public class Solution_2 {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long savevalue = x;
		for (int i = 0; i < n; i++) {
			answer[i] = (long) (i + 1) * x;
		}
		return answer;
	}
}
