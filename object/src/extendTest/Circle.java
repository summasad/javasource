package extendTest;

public class Circle extends Shape {
    Point center; // 포함 관계, 상속은 하나만 되니까 더 필요하면 포함 관계로
    int r;

    public Circle(Point center, int r) {
        this.center = center;
        this.r = r;
    }

    @Override
    void draw() {
        System.out.printf("[center = (%d, %d), r = %d, color = %s]\n", center.x, center.y, r, getColor());
    }

}
