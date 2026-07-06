package algorithm;

public class Programmers_181929 {
    public int solution(int[] num_list) {
        int gop = 1;
        int sum = 0;
        
        for(int i = 0; i < num_list.length; i++) {
        	gop *= num_list[i];
        	sum += num_list[i];
        }
        
        return gop < (int) Math.pow(sum, 2) ? 1 : 0;
    }
}
