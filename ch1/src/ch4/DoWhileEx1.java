package ch4;

import java.util.Scanner;

public class DoWhileEx1 {
    public static void main(String[] args) {
        // for, while과 다른 점은 {}를 수행한 후 조건식을 검사
        // 최소 한번은 실행된다.
        // 1~100사이의 임의의 숫자를 추출한후 그 숫자 알아맞추기
        Scanner sc = new Scanner(System.in);
        int input = 0;
        int answer = (int) (Math.random() * 100) + 1;
        do {
            System.out.println("1~100사이의 숫자 입력>> ");
            input = sc.nextInt();

            if (answer < input) {
                System.out.println("더 작은 수를 입력하세요");
            } else {
                System.out.println("더 큰수를 입력해주세요");
            }
        } while (answer != input);

        System.out.println("정답입니다! 종료");

        sc.close();
    }
}
