package level1_1;

/*
정수 제곱근 판별*/
public class Solution_11 {
	static long solution(long n) {
		double answer =  Math.sqrt(n);
        return (long) (answer % 1 ==0 ? Math.pow(Math.sqrt(n)+1,2) : -1);
	}
}
