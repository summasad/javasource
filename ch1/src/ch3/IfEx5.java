package ch3;

import java.util.Scanner;

public class IfEx5 {
    public static void main(String[] args) {
        // 근무시간에 따른 임금 계산
        // 근무시간 입력
        // 8시간까지 시간당 기본 임금(10000) 제공
        // 초과근무시간은 시간당 기본임금*1.5배

        int rate = 10000, pay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("근무시간 >>");

        int time = sc.nextInt();

        if (time == 8) {
            pay = 8 * rate;
        } else if (time >= 8) {
            pay = (int) ((time - 8) * rate * 1.5) + 8 * rate;
        }

        System.out.printf("임금은 %d", pay);

        sc.close();

    }
}
