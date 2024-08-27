package extendTest;

public class Point {
    int x, y;

    public Point() {
        this(0, 0);
    } // 아래 Point 메소드가 호출될 때 기본값 0으로 세팅해라

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    String getXY() {
        return "(" + x + ", " + y + ")";
    }
}
