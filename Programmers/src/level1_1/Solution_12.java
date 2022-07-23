package level1_1;

import java.util.Arrays;

/*
정수 내림차순으로 배치하기*/
public class Solution_12 {
	public static void main(String[] args) {
		solution(1234345345);
	}

	public static long solution(long n) {
		long answer = 0;
		String a = String.valueOf(n);
		String b[] = a.split("");
		Arrays.sort(b);
		String c = "";
		for(int i=b.length-2;i>=0;i--) {
			c += b[i];
		}
		
		answer = Integer.parseInt(c);
		System.out.println(answer);
		return answer;
	}
}
