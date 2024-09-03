package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//자바 클래스명 피할것
public class FileInputStreamEx3 {
    public static void main(String[] args) {

        // try-with-resource - 좀 더 간결한 코드작성
        // try(닫아야 하는 자원 생성) : finally 안에 닫기 명시하지 않아도 자동으로 닫아줌
        try (FileInputStream fis = new FileInputStream("c:\\temp\\image1.jpg");
                FileOutputStream fos = new FileOutputStream("c:\\temp\\output_image1.jpg")) {

            int data = 0;
            // read() = 1byte 씩 읽어옴. 느림.
            // while ((data = fis.read()) != -1) {
            // // System.out.print((char) data);
            // fos.write(data);
            // }

            // 1024 바이트로 읽고, 1024 바이트로 쓰고
            byte b[] = new byte[1024];
            while ((data = fis.read(b)) != -1) {
                fos.write(b);
            }
            // exception 에서 remove 떴을때 - 부모 exception있어서
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
