package ch4;

public class ForEx6 {
    public static void main(String[] args) {
        // 1~100 까지 3의 배수만을 더하기(단 9의 배수는 제외)
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 9 != 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 까지 3의 배수만을 더한 값(단 9의 배수는 제외) : " + sum);

        // 1~100 까지 3의 배수이거나 5의 배수 합계 구하기
        sum = 0;
        for (int i = 1; i <= 100; i++) {

            if (i % 3 == 0 || i % 5 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~100 까지 3의 배수이거나 5의 배수 합계 구하기 : " + sum);

    }

}
