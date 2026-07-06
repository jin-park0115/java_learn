package algorithm;
import java.util.ArrayList;

public class Programmers_181835 {
    public int[] solution(int[] arr, int k) {
    	
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++) {
        	if(k % 2 != 0) {
        		answer.add(arr[i] * k);
        	} else {
        		answer.add(arr[i] + k);
        	}
        }
        int[] res = new int[answer.size()];
        
        for(int i = 0; i < answer.size(); i++) {
        	res[i] = answer.get(i);
        }
        return res;
    }
}
