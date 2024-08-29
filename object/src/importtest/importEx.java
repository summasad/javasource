package importtest;

import java.time.LocalDate;
import java.util.Scanner;
//다른 패키지 호출
//import java.패키지.클래스

public class importEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LocalDate date = LocalDate.now();
        sc.close();
    }
}
