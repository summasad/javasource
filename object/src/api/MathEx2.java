package api;

public class MathEx2 {
    public static void main(String[] args) {
        // Math.random() : 1~4 사이의 임의의 숫자 발생
        // 동일한 숫자 3개 랜덤 떴을 때 멈추기

        while (true) {
            int num1 = (int) (Math.random() * 3) + 1;
            int num2 = (int) (Math.random() * 3) + 1;
            int num3 = (int) (Math.random() * 3) + 1;

            System.out.printf("%d\t%d\t%d\t", num1, num2, num3);
            if (num1 == num2 && num2 == num3)
                break;
        }

    }
}
