package level1_1;

/*
자연수 뒤집어 배열로 만들기*/
public class Solution_13 {
	public static int[] solution(long n) {
        String a = String.valueOf(n);
        String b[] = a.split("");
        
        int[] answer = new int[b.length];
        int value = b.length-1;
        
        for(int i=0;i<b.length;i++) {
        	answer[value] = Integer.parseInt(b[i]);
        	value--;
        }
        return answer;
    }
}
