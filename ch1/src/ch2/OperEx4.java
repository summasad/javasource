package ch2;

import java.util.Scanner;

public class OperEx4 {
    public static void main(String[] args) {
        // 사용자로부터 한달 월급을 입력받은 후 10년간 저축한 금액은 얼마인지 출력
        Scanner sc = new Scanner(System.in);

        System.out.print("월급을 입력해주세요 >>");

        int num = sc.nextInt();
        System.out.printf("저축액 = %d\n", num * 120);

        sc.close();
    }
}
