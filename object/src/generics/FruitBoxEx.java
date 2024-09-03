package generics;

public class FruitBoxEx {
    public static void main(String[] args) {
        Box3<Fruit> fruitBox = new Box3<>();
        // new Box3<fruitBox>(); 왼쪽에서 타입 정해서 오른쪽 생략가능
        Box3<Apple> appleBox = new Box3<>();
        Box3<Toy> toyBox = new Box3<>();

        // Fruit : Fruit + Apple + Grape 타입 모두 가능
        // Apple : Apple
        // Toy : Toy

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
        toyBox.add(new Toy());

        System.out.println(fruitBox);
        System.out.println(appleBox);
        System.out.println(toyBox);

        FruitBox<Fruit> fruitBox2 = new FruitBox<>();
        FruitBox<Apple> appleBox2 = new FruitBox<>();
        FruitBox<Grape> grapeBox2 = new FruitBox<>();
        // T extends Fruit : Fruit 혹은 Fruit 를 상속받은 클래스
        // FruitBox<Toy> toyBox2 = new FruitBox<>(); 하위 클래스 타입만 가능

        fruitBox2.add(new Fruit());
        fruitBox2.add(new Apple());
        fruitBox2.add(new Grape());

        System.out.println(Juicer.makeJuice(fruitBox2));

        appleBox2.add(new Apple());
        System.out.println(Juicer.makeJuice(appleBox2));

        grapeBox2.add(new Grape());

    }
}
