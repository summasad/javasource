package io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.charset.Charset;

public class FileReaderEx2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader(".\\src\\io\\FileEx.java", Charset.forName("utf-8"));
                BufferedReader br = new BufferedReader(fr)) {
            // reader + bufferedReader

            String str = null;
            int num = 0;
            // br.readLine() : buffer에 담아놓고 줄 단위로 읽어오기
            while ((str = br.readLine()) != null) {
                num++;
                System.out.println(num + " " + str);

            }
        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
