package algorithm;

import java.util.Scanner;
public class SWEA_1986 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int count = 0;
			for(int i = 1; i <= N; i++) {
				if(i % 2 == 0) {
					count -= i;
				} else {
					count += i;
				}
			}
			System.out.println("#" + tc + " " + count);
		}
	}

}
