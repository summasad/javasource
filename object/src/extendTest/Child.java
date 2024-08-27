package extendTest;

public class Child extends Parent {

    String name;

    void play() {
        System.out.println("놀자!!!");
    }

    @Override
    void print() {
        // 오버라이딩 하면 부모 메소드는 가려짐
        super.print(); // 가려지는 부모의 메소드 호출
        System.out.println("자식 메소드");
    }
}
