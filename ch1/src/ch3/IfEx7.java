package ch3;

import java.util.Scanner;

public class IfEx7 {
    public static void main(String[] args) {
        // 세 개의 숫자를 입력 받은 후 입력 받은 세 개의 숫자 중 가장 작은 수 출력

        Scanner sc = new Scanner(System.in);
        System.out.print(" 숫자1 입력>>");
        int num1 = sc.nextInt();

        System.out.print(" 숫자2 입력>>");
        int num2 = sc.nextInt();

        System.out.print(" 숫자3 입력>>");
        int num3 = sc.nextInt();

        // if (num1 < num2 && num1 < num3) {
        // System.out.println(num1);
        // } else if (num2 < num1 && num2 < num3) {
        // System.out.println(num2);
        // } else if (num3 < num1 && num3 < num2) {
        // System.out.println(num3);
        // }

        int min = num1;
        if (min > num2) {
            min = num2;
        }
        if (min > num3) {
            min = num3;
        }

        System.out.println("제일 작은 수는 : " + min);

        int max = num1;
        if (max < num2) {
            max = num2;
        }
        if (max < num3) {
            max = num3;
        }

        System.out.println("제일 큰 수는 : " + max);

        sc.close();
    }
}
