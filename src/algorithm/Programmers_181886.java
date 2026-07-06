package algorithm;

import java.util.ArrayList;

public class Programmers_181886 {
    public String[] solution(String[] names) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < names.length; i +=5) {
        	arr.add(names[i]);
        }
        
        return arr.toArray(new String[0]);
    }
}
