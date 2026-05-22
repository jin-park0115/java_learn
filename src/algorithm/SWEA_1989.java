package algorithm;

import java.util.Scanner;
public class SWEA_1989 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int i = 1; i <= T; i++) {
			String str = sc.next();
			int answer = 1;
			
			for(int j = 0; j < str.length() / 2; j++) {
				if(str.charAt(j) != str.charAt(str.length() - 1 - j)) {
					answer = 0;
					break;
				}
				
			}
			System.out.println("#" + i + " " + answer);
		}
	}

}
