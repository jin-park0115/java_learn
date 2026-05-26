package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class SWEA_1970 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] money = {50000, 10000, 5000, 1000, 500, 100, 50 ,10};
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			System.out.println("#" + tc);
			
			for(int i = 0; i < money.length; i++) {
				int count = N / money[i];
				System.out.print(count + " ");
				N %= money[i];
			}
			System.out.println();
			
		}
		
		
	}

}
