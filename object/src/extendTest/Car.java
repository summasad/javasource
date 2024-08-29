package extendTest;

public abstract class Car {
    // 버 변수 선언 가능
    private String name;

    public Car(String name) {
        this.name = name;
    }

    // 추상메소드
    abstract void drive();
    // '차에서는 드라이브라는 메소드를 사용해야 한다' 는 것만 정의

    // 일반 메소드 선언 가능
    void stop() {
        System.out.println(name + " 자동차를 멈춥니다");
    }

}
