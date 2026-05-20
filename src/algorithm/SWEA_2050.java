package algorithm;
import java.util.Scanner;

public class SWEA_2050 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String T = sc.next();
		
		for(int i = 0; i < T.length(); i++) {
			System.out.print(T.charAt(i) - 'A' + 1 + " ");
		}
	}

}
