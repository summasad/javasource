package classtest;

public class Method {
    // 메소드 작성
    // 리턴타입 메소드명(){}
    // 정수형(byte, short, int, long), 실수형(float, double), 논리형(boolean),
    // 문자형(char,String), 배열(타입[]), void

    // void 가 아닌 이상 return 키워드 필수
    int method1() {
        return 0;

    }

    double method2() {
        return 11.2;
    }

    char method3() {
        return 'a';
    }

    String method4() {
        return "abc";
    }

    int[] method5() {
        return new int[] { 1, 2, 3, 4, 5 };
    }

    void method6() {
        return; // 리턴 안써도 됨
    }
}
