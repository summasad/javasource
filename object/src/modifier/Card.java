package modifier;

public class Card {
    // final field KIND may not have been initialized
    final int NUMBER;
    final String KIND;

    static int width = 100;
    static int height = 150;

    Card(String kind, int num) {
        // final은 상수인데 값을 넣지 않았으면 오류
        // 선언할 때 초기화 하거나 생성자에서 초기화
        KIND = kind;
        NUMBER = num;
    }

    Card() {
        this("HEART", 2);
    }

    @Override
    public String toString() {

        return KIND + " " + NUMBER;
    }

}
