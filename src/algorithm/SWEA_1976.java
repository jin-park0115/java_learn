package algorithm;

import java.util.Scanner;

public class SWEA_1976 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			
			int fh = sc.nextInt();
			int fm = sc.nextInt();
			int sh = sc.nextInt();
			int sm = sc.nextInt();
			
			
			int H = 0;
			int M = 0;
			
			H = fh + sh;
			M = fm + sm;
			
			if(60 <= M) {
				
				H++;
				M = M - 60;
			}
			
			if(12 < H) {
				H = H - 12;
			}
			
			
			System.out.println("#" + tc + " " + H + " " + M);
		}

	}

}
