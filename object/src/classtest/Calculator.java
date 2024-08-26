package classtest;

public class Calculator {

    // 메소드만 있는 클래스 가능
    // 같은 클래스 내에서 다른 메소드 호출 가능
    // 이름만 불러서 호출

    void poweron() {
        System.out.println("전원켜기");
    }

    int plus(int x, int y) {
        return x + y;
    }

    double divine(int x, int y) {
        return (double) x / y;
        // 더블 안써도 자동 형변환, 작은 타입에서 큰 타입
    }

    void poweroff() {
        System.out.println("전원끄기");
    }

}
