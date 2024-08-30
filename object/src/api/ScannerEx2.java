package api;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        // System.in : 키보드
        Scanner sc = new Scanner(System.in);

        String[] argArr = null;
        while (true) {
            String prompt = ">>";
            System.out.print(prompt);

            // hello
            // hello 123
            String input = sc.nextLine();

            // 앞, 뒤 공백 제거
            input = input.trim(); // 공백 제거해서 다시 인풋에 담음

            // 문자열 분리 : 공백 기준
            // argArr = input.split(" "); 결과 [hello, , , , , 123]

            // "공백+" : 공백이 최소 1 ~ 무한대
            argArr = input.split(" +"); // 공백을 기준으로 분리해달라
            // System.out.println(Arrays.toString(argArr));

            // 소문자로 변경
            String cmd = argArr[0].toLowerCase();

            // q or Q 이면 while 종료
            if (cmd.equals("q")) {
                System.exit(0);
            } else {
                // q 가 아니면 배열 출력
                for (String s : argArr) {
                    System.out.println(s);
                }
            }
        }
    }
}
