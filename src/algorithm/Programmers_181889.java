package algorithm;

public class Programmers_181889 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {n};
        for(int i = 0; i < n; i++) {
        	answer[i] = num_list[i]; 
        }
        return answer;
    }
}
// int[] answer = {n}; 이건 배열의 값을 직접 넣어서 만드는 방법
// 즉 n = 5이면  배열의 길이는 1이고 0번째 인덱스에 5값이 들어가는 거다.