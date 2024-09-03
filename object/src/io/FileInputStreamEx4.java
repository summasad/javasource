package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//자바 클래스명 피할것
public class FileInputStreamEx4 {
    public static void main(String[] args) {

        // try-with-resource - 좀 더 간결한 코드작성
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\image2.jpg");
                BufferedInputStream bis = new BufferedInputStream(fis);
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image2.jpg");
                BufferedOutputStream bos = new BufferedOutputStream(fos)) {

            int data = 0;

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[4096];
            while ((data = bis.read(b)) != -1) {
                bos.write(b);
            }
            // exception 에서 remove 떴을때 - 부모 exception있어서
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
