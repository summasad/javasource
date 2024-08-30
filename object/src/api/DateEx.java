package api;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class DateEx {
    public static void main(String[] args) {
        // 날짜 // 시간
        // Date - java util
        Date d = new Date();
        System.out.println(d); // Fri Aug 30 16:13:14 KST 2024

        // 원하는 포맷으로 날짜 분리 : 포맷은 사이트에서 확인
        // Date ==> SimpleDateFormat
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");// SimpleDateFormat(pattern) 많이 씀
        System.out.println(sdf.format(d));

        // MM월 mm분
        sdf = new SimpleDateFormat("yyyy년 MM월 dd일 a HH:mm:ss");// SimpleDateFormat(pattern) 많이 씀
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 E요일");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 D번째 날");
        System.out.println(sdf.format(d));

        sdf = new SimpleDateFormat("오늘은 d번째 날");
        System.out.println(sdf.format(d));

        // LocalDate / LocalTime
        // LocalDateTime
        // =>생성자없음. new 할수 없음. static

        // LocalDate는 나중에 추가됨. 구버전은 Calender 이용

        LocalDate today = LocalDate.now(); // 2024-08-30
        LocalTime now = LocalTime.now(); // 16:39:24.425374800
        LocalDateTime localDateTime = LocalDateTime.now(); // 2024-08-30T16:41:50.951855400

        System.out.println(today);
        System.out.println(now);
        System.out.println(localDateTime);
        System.out.println("year " + today.getYear());
        System.out.println("month " + today.getMonthValue());
        System.out.println("day " + today.getDayOfMonth());

        System.out.println("시 : " + now.getHour());
        System.out.println("분 : " + now.getMinute());
        System.out.println("초 : " + now.getSecond());

        // 날짜 연산
        System.out.println(today.plusDays(15)); // 15일 후
        System.out.println(today.minusMonths(3)); // 3달 전

    }

}
