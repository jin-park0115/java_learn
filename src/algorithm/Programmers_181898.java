package algorithm;

public class Programmers_181898 {
//    public int solution(int[] arr, int idx) {
//    	int answer = -1;
//    	
//        for(int i = idx; i < arr.length; i++) {
//        	if(arr[i] == 1) {
//        		answer = i;
//        		break;
//        	}
//        }
//        return answer > -1 ? answer : -1;
//    }
	
    public int solution(int[] arr, int idx) {

        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) {
                return i;
            }
        }

        return -1;
    }
}
