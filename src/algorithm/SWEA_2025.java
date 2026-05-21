package algorithm;
import java.util.Scanner;

public class SWEA_2025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= N; i++) {
			sum += i;
		}
		System.out.print(sum);
	}

}
