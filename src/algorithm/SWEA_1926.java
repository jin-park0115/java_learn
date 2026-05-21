package algorithm;

import java.util.Scanner;

public class SWEA_1926 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            String str = Integer.toString(i);
            int count = 0;
            for (int j = 0; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (ch == '3' || ch == '6' || ch == '9') {
                    count++;
                }
            }

            if (count > 0) {
                for (int k = 0; k < count; k++) {
                    System.out.print("-");
                }
                System.out.print(" ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}