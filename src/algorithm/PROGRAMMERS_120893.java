package algorithm;

public class PROGRAMMERS_120893 {
	// 한글자씩 돌면서 대문자면 소문자로 소문자면 대문자
	
	public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        return answer;
    }
}
