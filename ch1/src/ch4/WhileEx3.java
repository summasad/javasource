package ch4;

public class WhileEx3 {
    public static void main(String[] args) {
        // 주사위 2개를 굴려 두 개의 합이 5와 같으면 반복문 종료

        while (true) {
            // 주사위 굴렸을때 (1,2) (3,4), (5,1)
            // random1~6 2개
            int num1 = (int) ((Math.random() * 6) + 1);
            int num2 = (int) ((Math.random() * 6) + 1);
            System.out.printf("(%d , %d)\n", num1, num2);

            if (num1 + num2 == 5) {
                break;
            }

        }

    }
}
