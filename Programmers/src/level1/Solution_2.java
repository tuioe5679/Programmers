package level1;

/*
�Լ� solution�� ���� x�� �ڿ��� n�� �Է� �޾�, 
x���� ������ x�� �����ϴ� ���ڸ� n�� ���ϴ� ����Ʈ�� �����ؾ� �մϴ�. 
���� ���� ������ ����, ������ �����ϴ� �Լ�, solution�� �ϼ����ּ���.*/

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
