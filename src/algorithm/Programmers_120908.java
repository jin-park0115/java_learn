package algorithm;

public class Programmers_120908 {
    public int solution(String str1, String str2) {
    	String strr1 = str1.toLowerCase();
    	String strr2 = str2.toLowerCase();
    	
    	return strr1.contains(strr2) ? 1 : 2;
    }
}
