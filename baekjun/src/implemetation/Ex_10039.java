package implemetation;

import java.util.Scanner;

public class Ex_10039 {
    public static void main(String[] args) {
        
        int total = 0;

        Scanner sc = new Scanner(System.in);

        for(int i=0; i<5; i++) {
            int score = sc.nextInt();
            
            if(score < 40) {
                score = 40;
            }

            total += score;
        }

        sc.close();

        System.out.println(total/5);
        
    }
}