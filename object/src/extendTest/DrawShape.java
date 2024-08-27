package extendTest;

public class DrawShape {
    public static void main(String[] args) {

        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)

        };
        Triangle triangle = new Triangle(p);

        // Point p1 = new Point(150, 150);//p1 변수 따로 사용 안할 거면 변수 선언 안해도 됨
        Circle circle = new Circle(new Point(150, 150), 50);

        triangle.draw();
        circle.draw();

    }
}
