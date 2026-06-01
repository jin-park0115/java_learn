package algorithm;

public class PROGRAMMERS_120826 {
	  public String solution(String my_string, String letter) {
	        String answer = "";
	        for(int i = 0; i < my_string.length(); i++) {
	        	char ch = my_string.charAt(i);
	        	if(ch != letter.charAt(0)) {
	        		answer += ch;
	        	}
	        }
	        return answer;
	    }
}
