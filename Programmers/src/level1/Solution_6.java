package level1;

/*������ ��� �ִ� �迭 arr�� ��հ��� return�ϴ� �Լ�, solution�� �ϼ��غ�����.*/

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
