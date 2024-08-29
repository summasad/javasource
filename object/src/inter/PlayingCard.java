package inter;

public interface PlayingCard {

    // 멤버 변수 선언 불가
    // private String name;

    // 상수만 가능
    public static final int SPADE = 4;
    // public static final 생략 가능, 어차피 상수만 가능해서
    int DIAMOND = 3;
    static int HEART = 2;
    final int CLOVER = 1;

    // abstract 키워드는 필수가 아님 => 모든 메소드가 추상이기 때문
    String getCardNumber();

    // 일반 메소드 선언 불가
    // void method(){}

    // 일반 메소드 대신 default 나 static 붙이는건 가능
    default void method1() {
    }

    static void method2() {
    }
}
