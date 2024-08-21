package ch3;

import java.util.Scanner;

public class SwitchEx3 {
    public static void main(String[] args) {
        // 가위(1)바위(2)보(3)
        // 컴퓨터가 내는 부분 random 1~3
        int computer = (int) (Math.random() * 3) + 1;

        // 사용자가 내는 부분 입력받기

        Scanner sc = new Scanner(System.in);
        System.out.print(" 가위(1)바위(2)보(3) 입력>>");
        int user = sc.nextInt();

        switch (user - computer) {
            case 1:
            case -2:
                System.out.println("user win");
                break;
            case 0:
                System.out.println("try again");
                break;

            default:
                System.out.println("computer win");
                break;
        }
        sc.close();

    }
}
