package ch4;

import java.util.Scanner;

public class ForEx7 {
    public static void main(String[] args) {
        // 5!출력
        int fact = 1;
        // for (int i = 5; i > 0; i--) {
        // fact *= i;
        // }
        // System.out.printf("5! = %d", fact);
        // }

        // 특정 숫자의 factorial 부르기
        Scanner sc = new Scanner(System.in);

        System.out.print("factorial 구할 숫자 입력 >> ");

        int num = sc.nextInt();

        for (int i = num; i > 0; i--) {
            fact *= i;
        }
        System.out.printf("%d! = %d", num, fact);

        sc.close();

    }
}
