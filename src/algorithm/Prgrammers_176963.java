package algorithm;

import java.util.Map;
import java.util.HashMap;

public class Prgrammers_176963 {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
    	
    	Map<String, Integer> nameYear = new HashMap<>();
    	for(int i = 0; i < yearning.length; i++) {
    		nameYear.put(name[i], yearning[i]);
    	}
    	
    	int[] answer = new int[photo.length];
    	
    	for(int i = 0; i < photo.length; i++) {
    		int sum = 0;
    		
    		for(int j = 0; j < photo[i].length; j++) {
    			String person = photo[i][j];
    			sum += nameYear.getOrDefault(person, 0);
    		}
    		answer[i] = sum;
    	}
    	return answer;
    }
}
