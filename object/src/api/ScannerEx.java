package api;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // System.out.println("문자열을 입력하세요");
        // // String str = sc.next(); // 안녕하세요 반갑습니다 => 첫단어만 출력, 여러 단어는 sc.nextLine()
        // String str = sc.nextLine(); // 안녕하세요 반갑습니다
        // System.out.println(str);

        System.out.print("input num1");
        int num1 = sc.nextInt(); // 5 엔터 int num1 = integer.parseInt(sc.nextLine())
        System.out.print("+-/* 중 하나를 입력하세요");
        // String op = sc.next();
        String op = sc.nextLine(); // 5 이후의 남은 엔트를 읽어들임
        System.out.print("input num2");
        int num2 = sc.nextInt();
        // sc.nextInt(); 이후에 남는 엔터 간단하게 처리하려면 모두 nextLine()하고 형변환
        sc.close();
    }

}
