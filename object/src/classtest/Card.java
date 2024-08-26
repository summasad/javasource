package classtest;

public class Card {
    // 멤버 변수
    private String kind; // 카드 모양
    private int number; // 카드 숫자

    // 클래스 변수(변하지 않는 고정된 값)
    static int width = 100;
    static int height = 250;

    public Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public int getNumber() {
        return number;
    }

}
