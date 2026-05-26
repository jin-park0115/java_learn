package algorithm;
import java.util.*;
public class SWEA_1966_arrayList {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			
			ArrayList<Integer> list = new ArrayList<>();
			
			for(int i =0 ; i < N; i++) {
				list.add(sc.nextInt());
			}
			
			Collections.sort(list);
			
			System.out.print("#" + tc + " ");
			
			for(int i = 0; i < list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
			
			System.out.println();
		}
		
	}

}
