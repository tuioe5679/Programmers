package level1_2;

/*
문자열 다루기 기본*/
public class Solution_22 {
	public boolean solution(String s) {
        try {
			if(s.length()==4||s.length()==6) {
				Integer.parseInt(s);
				return true;
			}
			else {
				return false;
			}
		} catch (NumberFormatException e) {
			return false;
		}
    }
}
