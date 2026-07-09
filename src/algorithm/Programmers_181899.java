package algorithm;
import java.util.ArrayList;
public class Programmers_181899 {
    public int[] solution(int start_num, int end_num) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        for (int i = 0; i <= start_num - end_num; i++) {
        	arr.add(start_num - i);
        }
        
        int[] answer = new int[arr.size()];
        
        for(int i = 0; i < arr.size(); i++) {
        	answer[i] = arr.get(i);
        }
        
        return answer;
    }
}
