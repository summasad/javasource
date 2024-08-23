package array;

public class ArrayEx3 {
    public static void main(String[] args) {
        // char 배열 선언, 생성
        // type 배열명 지정
        // 타입[] 배열명 or 타입 배열명[] 괄호위치 둘다 허용
        // 타입[] 배열명 = {'a','b','c','d'}
        // 0부터 인덱스 시작인거 기억할것

        char[] chArr = { 'a', 'b', 'c', 'd' };

        // System.out.println(Arrays.toString(chArr));

        for (int i = 0; i < chArr.length; i++) {
            System.out.println(chArr[i] + "\t");
        }

        // 향상된 for문
        for (char c : chArr) {
            System.out.println(c + "\t");
        }
        // float 배열 선언, 생성
        float[] flArr = { 12.5f, 13.6f, 14.5f, 13.7f };

        for (float f : flArr) {
            System.out.println(f + "\t");
        }
        // string 배열 선언, 생성
        String[] strArr = { "A", "B", "C", "D" };

        for (String string : strArr) {
            System.out.println(string + "\t");
        }

        // System.out.println(strArr[4]);

    }
}
