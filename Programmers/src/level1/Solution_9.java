package level1;

//짝수와 홀수
public class Solution_9 {
	public String solution(int num) {
        String answer = "";
        if(num%2==0){
            answer="Even";
        }
        else{
            answer="Odd";
        }
        return answer;
    }
}
