package level1;

/*
���� ���� x�� �ϻ��� ���̷��� x�� �ڸ����� ������ x�� ���������� �մϴ�. 
���� ��� 18�� �ڸ��� ���� 1+8=9�̰�, 18�� 9�� ������ �������Ƿ� 18�� �ϻ��� ���Դϴ�. 
�ڿ��� x�� �Է¹޾� x�� �ϻ��� ������ �ƴ��� �˻��ϴ� �Լ�, solution�� �ϼ����ּ���.*/

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
