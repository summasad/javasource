package io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReaderEx4 {
    public static void main(String[] args) {
        // 키보드와 입력 스트림 연결
        // ;
        // sc.close();
        // List<String> list = new ArrayList<>();

        try (Scanner sc = new Scanner(System.in);
                FileWriter fw = new FileWriter("c:\\temp\\qtest.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            System.out.println("파일에 작성할 데이터를 입력해주세요");
            System.out.println("종료를 원하면 q 를 입력하세요");
            String str = "";
            // q 라는 문자가 입력되기 전까지 키보드로 입력 받아들인 후
            do {
                System.out.println(">>");
                str = sc.nextLine();

                if (!str.equals("q")) {
                    bw.write(str);
                    bw.newLine();
                }
            } while (str.equals("q"));
            {

                // q 가 입력이 되면 입력 받아들인 문자들을 파일로 작성하기
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
