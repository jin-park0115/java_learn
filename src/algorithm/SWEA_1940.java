package algorithm;
import java.util.Scanner;

public class SWEA_1940 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			int totalDistance = 0;
			int currentSpeed = 0;
			
			for(int i = 0; i < N; i++) {
				int command = sc.nextInt();
				if(command == 1) {
					int accel = sc.nextInt();
					currentSpeed += accel;
				} else if(command == 2) {
					int decel = sc.nextInt();
					currentSpeed -= decel;
					if(currentSpeed < 0) {
						currentSpeed = 0;
					}
				} else if(command == 0) {
					
				}
				totalDistance += currentSpeed;
			
			}
			System.out.println("#" + tc + " " + totalDistance);
		}
		sc.close();
	}

}
