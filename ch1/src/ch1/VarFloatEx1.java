package ch1;

public class VarFloatEx1 {
    public static void main(String[] args) {
        // 타입 변수명 = 초기화값;
        float score = 90.14F;

        double score2 = 98.50;
        score2 = 90d;

        System.out.println("score = " + score);
        System.out.println("score2 = " + score2);

        int value1 = 92;
        double score3 = value1;
        System.out.println("score3 = " + score3);

        // int value2 = score2;
    }
}
