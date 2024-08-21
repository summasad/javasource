package ch2;

public class OperEx1 {
    public static void main(String[] args) {
        // 연산자(operator)

        // 두 개의 정수형 변수를 선언 후 사칙연산 프로그램 작성
        int num1 = 10, num2 = 20;

        System.out.printf("%d + %d = %d\n", num1, num2, (num1 + num2));
        System.out.printf("%d - %d = %d\n", num1, num2, (num1 - num2));
        System.out.printf("%d * %d = %d\n", num1, num2, (num1 * num2));
        System.out.printf("%d / %d = %d\n", num1, num2, (num1 / num2));
        System.out.printf("%d %% %d = %d\n", num1, num2, (num1 % num2));

        float result = num1 + num2;
        System.out.printf("%d + %d = %f\n", num1, num2, result);
        result = num1 - num2;
        System.out.printf("%d - %d = %f\n", num1, num2, result);
        result = num1 * num2;
        System.out.printf("%d * %d = %f\n", num1, num2, result);
        result = num1 / num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);
        result = num1 / (float) num2;
        System.out.printf("%d / %d = %f\n", num1, num2, result);

        char ch1 = 'A' + 1;
        System.out.println("ch1 = " + ch1);
    }
}
