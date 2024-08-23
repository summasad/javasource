package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx12 {
    public static void main(String[] args) {
        // 5 명의 학생들의 점수를 입력받아서 최고점수, 평균 출력
        // 학생 명수는 변경될 수 있으므로 동적 생성

        int[] jumsu;

        Scanner sc = new Scanner(System.in);
        System.out.println("학생 명수 입력 >>");
        int num1 = sc.nextInt();

        jumsu = new int[num1];

        for (int j = 0; j < jumsu.length; j++) {
            System.out.printf("%d학생 점수 입력 >>", j + 1);
            jumsu[j] = sc.nextInt();

        }

        System.out.println(Arrays.toString(jumsu));

        int max = 0;
        int sum = 0;
        for (int i = 0; i < jumsu.length; i++) {
            if (max < jumsu[i]) {
                max = jumsu[i];
            }
            sum += jumsu[i];

        }

        System.out.printf("최고점수는 %d, 평균점수는 %d", max, sum / jumsu.length);

        sc.close();

    }
}
