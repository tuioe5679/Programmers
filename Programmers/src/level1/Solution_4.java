package level1;

/*
���α׷��ӽ� ������� �������� ��ȣ�� ���� �������� ���� �� ������ ��ȭ��ȣ�� �Ϻθ� �����ϴ�.
��ȭ��ȣ�� ���ڿ� phone_number�� �־����� ��, 
��ȭ��ȣ�� �� 4�ڸ��� ������ ������ ���ڸ� ���� *���� ���� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.*/

public class Solution_4 {
	class Solution {
		public String solution(String phone_number) {
			String answer = "";
			for (int i = 0; i < phone_number.length() - 4; i++) {
				answer += "*";
			}
			answer += phone_number.substring(phone_number.length() - 4, phone_number.length());
			return answer;
		}
	}
}
