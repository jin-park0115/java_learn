package algorithm;
import java.util.*;
public class Programmers_181909 {
    public String[] solution(String my_string) {
        
        String[] arr = new String[my_string.length()];
        for(int i = 0; i < my_string.length(); i++) {
        	arr[i] = my_string.substring(i);
        }
        Arrays.sort(arr);
        return arr;
    }
}
