package algorithm;

import java.util.Scanner;
import java.util.Arrays;

public class SWEA_1954 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int test_case = 1; test_case <= T; test_case++) {
			int N = sc.nextInt();
			int[][] arr = new int[N][N];
			
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1,0,-1,0};
			
			int r = 0;
			int c = 0;
			int dir = 0;
			
			for(int num = 1; num <= N * N; num++) {
				arr[r][c] = num;
				
				int nr = r + dr[dir];
				int nc = c + dc[dir];
				
				if(nr < 0 || nr >= N || nc < 0 || nc >= N || arr[nr][nc] != 0) {
					dir = (dir + 1) %4;
					nr = r + dr[dir];
					nc = c + dc[dir];
					
				}
				r = nr;
				c = nc;
			}
		
			System.out.println("#" + test_case);
			for(int i = 0; i < N; i ++) {
				for(int j = 0; j < N; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
	
			
		}
		
	}
}
