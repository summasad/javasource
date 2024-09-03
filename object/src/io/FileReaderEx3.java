package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx3 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(".\\src\\io\\FileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr);
                FileWriter fw = new FileWriter("c:\\temp\\source.txt");
                BufferedWriter bw = new BufferedWriter(fw)) {

            String str = null;
            int num = 0;
            // br.readLine() : buffer에 담아놓고 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) {
                num++;
                bw.write(num + " " + str);
                bw.newLine(); // 줄바꿈, 엔터
            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
