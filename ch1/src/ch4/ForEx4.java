package ch4;

public class ForEx4 {
    public static void main(String[] args) {
        // 중첩 for
        // for문안에 또다른 for문 포함(중첩횟수제한없음)

        for (int j = 0; j < 3; j++) {
            for (int i = 1; i < 11; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // for문 동작 단계
        // ① int i = 0; 실행
        // ② i < 2; 실행
        // ③ for 내부 진입
        // ④ int j = 0;
        // ⑤ j < 2
        // ⑥ 안쪽 for 구문 실행
        // ⑦ j++; => j<2; true 라면 다시 안쪽 for 실행
        // ⑧ j=2가 되면서 false 상태일 때 안족 for문 종료
        // ⑨ i++; => i<2 true 라면 다시 안쪽 for문 실행
        // ⑩ ④~⑧ 반복
        // ⑪ i=2 가 되면 이중 for 문 종료
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
