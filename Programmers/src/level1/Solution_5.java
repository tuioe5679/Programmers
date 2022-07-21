package level1;

/*
하샤드 수*/

public class Solution_5 {
	public boolean solution(int x) {
		int sum = 0;
		boolean answer = true;
		String value[] = String.valueOf(x).split("");

		for (int i = 0; i < value.length; i++) {
			sum += Integer.parseInt(value[i]);
		}
		answer = (x % sum != 0) ? false : true;
		return answer;
	}
}
