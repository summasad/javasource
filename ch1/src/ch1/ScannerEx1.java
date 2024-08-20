package ch1;

import java.util.*;

public class ScannerEx1 {
    public static void main(String[] args) {
        // 대문자로 시작을 한다면 class or interface 로 생각하면 됨
        // System.in(키보드) 로부터 입력받기 위해 필요한 객체
        // System.out(화면)
        Scanner sc = new Scanner(System.in);

        System.out.print("두자리 정수를 입력해 주세요 >>");
        // 사용자가 입력한 값을 라인단위로 가져오기(문자로)
        String input = sc.nextLine();
        // str 을 int로
        int num = Integer.parseInt(input);

        System.out.println("입력내용 : " + input);
        System.out.printf("num = %d\n", num);

        sc.close();

    }
}
