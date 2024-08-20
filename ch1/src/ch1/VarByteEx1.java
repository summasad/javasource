package ch1;

public class VarByteEx1 {
    public static void main(String[] args) {
        int age = 128;
        String name = "홍길동";

        age = 40;

        System.out.print("제 나이는 " + age + " 이고, 이름은 " + name + "입니다.");
        System.out.println("제 나이는 " + age + " 이고, 이름은 " + name + "입니다.");
        System.out.printf("제 나이는 %d 이고, 이름은 %s입니다.\n", age, name);
        System.out.println("안녕\\하세요");
    }

}
