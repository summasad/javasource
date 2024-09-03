package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerialEx2 {
    public static void main(String[] args) {
        Person p1 = new Person("홍길동", "엔지니어", "hong@javamail.net");
        Person p2 = new Person("성춘향", "교사", "sung@javamail.net");

        try (FileInputStream fis = new FileInputStream("c:\\temp\\person.dat");
                BufferedInputStream bis = new BufferedInputStream(fis);
                ObjectInputStream ois = new ObjectInputStream(bis)) {

            for (int i = 0; i < 2; i++) {
                // Person pi = (Person) ois.readObject();
                // System.out.println(pi);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
