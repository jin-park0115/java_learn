package algorithm;
import java.util.Scanner;

public class SWEA_21425 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 이 문제의 핵심은 작은수에 더하기.
		// 둘중의 하나가 초과되면 반복문이 종료되도록.
		int T = sc.nextInt();
		for(int i = 0; i < T; i++) {
			int count = 0;
			int A = sc.nextInt(); // 10
			int B = sc.nextInt(); // 7
			int N = sc.nextInt(); // 1293
			
			while(A <= N && B <= N) {
				if(A < B) {
					A += B;
				} else {
					B += A;
				}
				count++;
			}
			System.out.println(count);
		}
	}

}
