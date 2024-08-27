package classtest;

public class CarEx {
    public static void main(String[] args) {
        // 객체 생성
        Car car = new Car();
        // new 값은 heap 에 저장
        // 주소 => heap 주소
        // 메소드 공간은 따로
        // 호출할때 타입 맞춰야하는 이유

        // car 멤버변수, 메소드에 접근 가능해짐
        // System.out.println("제조사 : " + car.company); // null
        // System.out.println("모델 : " + car.model); // null
        // System.out.println("색상 : " + car.color); // null
        // System.out.println("최대속력 : " + car.maxSpeed); // 0
        // 반복 코드 메소드화

        printCar(car);

        // String 처럼 대문자로된 객체 타입 나오면 기본값 null
        // 소문자 타입 기본값은 0, 0.0, false
        // 값은 메인창에서 넣기

        // 속성 변경 가능
        car.company = "현대";
        car.color = "white";
        car.maxSpeed = 200;
        car.model = "소나타";

        printCar(car);

        car.forward(); // 전진한다
        car.backward(); // 후진한다

        Car cars[] = new Car[2];
        System.out.println(cars[0]);
        // System.out.println(cars[0].color);
        // NullPointerException 제일 많이 만나는 오류
        // 객체에 값이 아직 할당되지 않았을 때 => new 안한 상황, 오픈전
        // (기본 타입은 안뜸. 객체 일때만)

        String str = "";
        System.out.println(str.length());
        // String str = null;
        // System.out.println(str.length());
        // NullPointerException
        // String 초기화 - String str = "" / String str = null
    }

    static void printCar(Car car) {
        System.out.println("제조사 : " + car.company); // 현대
        System.out.println("모델 : " + car.model); // 소나타
        System.out.println("색상 : " + car.color); // white
        System.out.println("최대속력 : " + car.maxSpeed); // 200

    }
}
