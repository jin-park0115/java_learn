package algorithm;

public class PROGRAMMERS_120851 {
	// 문자열의 글자를 하나씩 확인 하면서 그 글자가 숫자일때만 더하는 방
  public int solution(String my_string) {
        int answer = 0;
        
        for(char c : my_string.toCharArray()) {
        	if(Character.isDigit(c)) {
        		answer += Character.getNumericValue(c);
        	}
        }
        
        return answer;
    }
}
