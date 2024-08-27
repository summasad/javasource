package extendTest;

public class ChildEx {
    public static void main(String[] args) {

        // 부모 클래스는 자신에게 선언된 멤버와 메소드만 접근 가능
        Parent parent = new Parent();
        parent.print();

        // child.age
        // 호출한 자식 클래스가 가진것 + 부모 클래스로부터 상속받은 멤버와 메소드 접근 가능
        Child child = new Child();
        child.print(); // 부모 메소드 호출 가능
        child.play(); // 자식 메소드 호출 가능

    }
}
