package algorithm;

public class PROGRAMMERS_120849 {
   public String solution(String my_string) {
        String moum = "aeiou";
        String str = "";
        
        for(int i = 0; i < my_string.length(); i++) {
        	char ch = my_string.charAt(i);
        	
        	if(!moum.contains(String.valueOf(ch))) {
        		str += ch;
        	}
        }
        return str;
    }
}
