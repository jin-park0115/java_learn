package algorithm;

public class Programmers_181911 {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        for(int i = 0; i < parts.length; i++) {
        	int s = parts[i][0];
        	int e = parts[i][1];
        	
        	answer += my_strings[i].substring(s, e + 1);
        }
        
        return answer;
    }
}
