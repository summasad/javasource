package ch4;

public class ForEx9 {
    public static void main(String[] args) {
        // 1~100 사이의 숫자 중에서 소수 출력

        for (int i = 2; i < 101; i++) {
            int cnt = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 2) {
                System.out.printf("%d\t", i);
            }
        }
    }
}
