package level1;

/*평균 구하기*/

public class Solution_6 {
	public double solution(int[] arr) {
		double answer = 0;
		int count = 0;
		for (int i : arr) {
			answer += i;
			count++;
		}
		return answer / count;
	}
}
