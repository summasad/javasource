package extendTest;

public class CarEx {
    public static void main(String[] args) {
        // Car 인스턴스 생성
        // Car car = new Car() {
        // }; 직접적 인스턴스 생성 불가

        Car car = new SportsCar("포르쉐");
        // 자식 클래스 인스턴스 생성 가능.
        // 다형성을 이용한 인스턴스 생성
        car.drive();
        car.stop();
    }
}
