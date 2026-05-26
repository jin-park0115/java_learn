package algorithm;
import java.util.Scanner;
public class SWEA_1936 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
//		
//		int scissors = 1;
//		int roks = 2;
//		int papers = 3;
//		
//		if (A == scissors && B == roks) {
//			System.out.print("B");
//		} else if(A == roks && B == scissors) {
//			System.out.print("A");
//		} else if(A == papers && B==roks) {
//			System.out.print("A");
//		} else if(A==papers&& B==scissors) {
//			System.out.print("B");
//		} else if(A == scissors && B == papers) {
//			System.out.print("A");
//		} else if(A==roks && B == papers) {
//			System.out.print("B");
//		}
		
		if(A - B == 1 || A - B == -2) {
			System.out.print("A");
		} else {
			System.out.print("B");
		}
	}

}
