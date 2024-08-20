package ch1;

import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // 키보드에서 입력받을 준비
        Scanner sc = new Scanner(System.in);

        // 어떤 값을 입력할지 알려주기
        System.out.println("숫자 하나를 입력해주세요");

        // 입력하는 값을 변수에 담기
        int num = sc.nextInt();
        System.out.printf("num = %ch\n", num);

        sc.close();
    }
}
