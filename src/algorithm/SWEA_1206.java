package algorithm;

import java.util.Scanner;
public class SWEA_1206 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		for(int tc = 1; tc <= 10; tc++) {
			int N = sc.nextInt();
			int[] arr = new int[N];
			
			for(int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			
			int answer = 0;
			
			for (int i = 2; i < N - 2; i++) {
				int max = 0;
				
				max = Math.max(max, arr[i - 2]);
				max = Math.max(max, arr[i - 1]);
				max = Math.max(max, arr[i + 1]);
				max = Math.max(max, arr[i + 2]);
				
				if(arr[i] > max) {
					answer+= arr[i] - max;
					
				}
			}
			System.out.println("#" + tc + " " + answer);
		}
	}

}
