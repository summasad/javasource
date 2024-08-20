package ch1;

public class CastingEx1 {
    public static void main(String[] args) {

        double d = 85.4;
        int score = (int) d;
        System.out.printf("score = %d", score);

        byte byteValue = 10;
        int intValue = byteValue;
        System.out.printf("int 형 변환 후 %d\n", intValue);

        long longValue = intValue;
        System.out.printf("long 형 변환 후 %d\n", longValue);

        double doubleValue = longValue;
        System.out.printf("double 형 변환 후 %f\n", doubleValue);

        System.out.println("--------------------------------------");

        char ch = 'a';
        intValue = ch;
        System.out.printf("int 형변환 후 %d\n", intValue);

    }

}
