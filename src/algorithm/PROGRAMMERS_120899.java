package algorithm;

import java.util.Arrays;
public class PROGRAMMERS_120899 {
    public int[] solution(int[] array) {
    	int max = array[0];
    	int maxIndex = 0;
    	
    	for(int i = 1; i < array.length; i++) {
    		if(array[i] > max) {
    			max = array[i];
    			maxIndex= i;
    		}
    	}
    	return new int[]{max, maxIndex};
    }
}
