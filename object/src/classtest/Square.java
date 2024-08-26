package classtest;

public class Square {
    // 직사각형의 넓이(가로, 세로)
    // 정사각형의 넓이(가로)
    // 메소드 오버로딩 : 목적이 같아서 같게 만듬
    // 결과 값만 다르게 ex(println(Stirng, int, ...))
    double areaRectangle(double w, double h) {
        return w * h;

    }

    double areaRectangle(double w) {
        return w * w;

    }

}
