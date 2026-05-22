package algorithm;
import java.util.Scanner;
import java.util.Arrays;

public class SWEA_1984 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int[] arr = new int[10];
			int sum = 0;
			
			for(int i = 0; i < 10; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			for(int i = 1; i < 9; i++) {
				sum += arr[i];
			}
			
			long answer = Math.round((double)sum / 8);
			
			System.out.println("#" + test_case + " " + answer);
		}
	}

}
