package array;

public class ArrayEx6 {
    public static void main(String[] args) {
        int[] scores = { 79, 88, 99, 34, 50, 100, 80 };

        // 배열 요소 중에서 가장 큰 값과 가장 작은 값 구하기
        int max = scores[0];
        int min = scores[0];

        // for (int i = 1; i < scores.length; i++) {
        // if (max < scores[i]) {
        // max = scores[i];
        // }
        // if (min > scores[i]) {
        // min = scores[i];
        // }
        for (int i : scores) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }

        System.out.println("최대값 " + max);

        System.out.println("최소값 " + min);
    }
}
