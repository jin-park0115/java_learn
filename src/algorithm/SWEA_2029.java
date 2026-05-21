package algorithm;
import java.util.Scanner;

public class SWEA_2029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int div = a / b;
			int nama = a % b;
			System.out.println("#" + i + " "+ div + " " + nama );
		}
	}

}
