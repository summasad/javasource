package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        // 배열 : 한 번 생성하면 길이 변경 불가

        // 10명 학생의 점수 배열 생성

        int jumsu[] = { 88, 50, 48, 74, 90, 65, 84, 99, 85, 57 };

        // 5명 점수가 추가되어야한다면
        // 15명의 점수를 담을 배열 생성

        int jumsu2[] = new int[15];
        // 기존 10명의 점수를 복사
        for (int i = 0; i < jumsu.length; i++) {
            jumsu2[i] = jumsu[i];
        }

        for (int i = 0; i < jumsu2.length; i++) {
            System.out.printf("%d\t", jumsu2[i]);

        }
        System.out.println();

        // 5명의 점수를 입력받아 배열 채우기
        Scanner sc = new Scanner(System.in);
        for (int i = 10; i < jumsu2.length; i++) {
            System.out.printf("%d 학생 점수를 입력해주세요", i);
            jumsu2[i] = sc.nextInt();
        }
        // int i = 0;
        // System.out.printf("%d\t", jumsu2[i]);

        // 확인(화면출력)
        System.out.println(Arrays.toString(jumsu2));

        sc.close();

    }
}
