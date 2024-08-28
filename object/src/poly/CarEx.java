package poly;

public class CarEx {
    public static void main(String[] args) {
        Car car = null;

        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();

        // 자동 형변환
        car = fe; // Car car = new FireEngine();
        // car.water(); //범위 좁아져서 부를 수 없음

        // 조상 타입은 자손 타입으로 강제 형변환
        fe2 = (FireEngine) car;
        fe2.water();

        Car car2 = new Car();
        // ClassCastException (실행시(런타임) 오류 발생) : instanceof 연산자로 해결
        // 왼쪽 부모 = 오른쪽 자식 형식이어야 함
        // 처음에 new 할때 부모 타입이었음
        // 자식 = 부모 하면 오류
        if (car2 instanceof FireEngine) {
            fe = (FireEngine) car2;
            fe.drive();

        }
        if (car2 instanceof Car) {

        }
    }

}
