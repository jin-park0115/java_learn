package algorithm;
import java.util.Scanner;

public class SWEA_2056 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int test_case=1; test_case <= T; test_case++){
			String str = sc.next();
			
			String year = str.substring(0, 4);
			String month = str.substring(4,6);
			String day = str.substring(6,8);
			
			int m = Integer.parseInt(month);
			int d = Integer.parseInt(day);
			
			boolean check = true;
			
			if (m < 1 || m > 12) {
				check = false;
			} else if (m == 2) {
				if (d < 1 || d > 28) {
					check = false;
				}
			} else if (m == 4 || m == 6 || m == 9 || m == 11) {
				if(d < 1 || d > 30) {
					check = false;
				}
			} else {
				if (d < 1 || d > 31) {
					check = false;
				}
			}
			
			System.out.print("#" + test_case + " ");
			if (check) {
				System.out.println(year + "/" + month + "/" + day);
			} else {
				System.out.println("-1");
			}
			
			
		}
		
	}

}
