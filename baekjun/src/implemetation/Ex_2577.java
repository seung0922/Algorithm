package implemetation;

import java.util.Scanner;

public class Ex_2577 {
    public static void main(String[] args) {

        int[] arrNum = new int[10];
        String result = "";

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        result = "" + (a * b * c);

        for (int j = 0; j < result.length(); j++) {
            arrNum[result.charAt(j) - 48]++;
        }

        for (int n : arrNum) {
            System.out.println(n);
        }
    }
}