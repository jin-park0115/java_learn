package algorithm;
import java.util.ArrayList;
public class Programmers_181885 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arr = new ArrayList<>();
        
        for(int i = 0; i < todo_list.length; i++) {
        	if(!finished[i]) {
        		arr.add(todo_list[i]);
        	}
        	
        }
        return arr.toArray(new String[0]);
    }
}
