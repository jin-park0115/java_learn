package algorithm;

import java.util.Scanner;
public class SWEA_2007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i  = 1; i <= T; i++) {
			String str = sc.next();
			int answer = 0;
			
			for(int j = 1; j <= 10; j++) {
				String first = str.substring(0,j);
				String second = str.substring(j, j *2);
				
				if(first.equals(second)) {
					answer = j;
					break;
				}
			}
			System.out.println("#" + i + " " + answer);
		}
	}

}
