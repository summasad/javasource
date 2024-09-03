package generics;

public class Fruit { // 여러 클래스 중 퍼블릭은 하나만
    @Override
    public String toString() {
        return "Fruit";
    }
}

class Apple extends Fruit {
    @Override
    public String toString() {
        return "Apple";
    }
}

class Grape extends Fruit {
    @Override
    public String toString() {
        return "Grape";
    }
}

class FruitBox<T extends Fruit> extends Box3<T> {
}

class Juice {
    String name;

    Juice(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

class Juicer {
    static Juice makeJuice(FruitBox<? extends Fruit> box) {
        // Juice makeJuice(FruitBox<Fruit> box)는 하위 클래스 타입 사용불가
        // 와일드 카드로 타입범위 넓힘
        String tmp = "";
        for (Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
    // 타입 변경만으로는 오버로딩 할 수 없음
}

class Toy {
    @Override
    public String toString() {
        return "Toy";
    }
}
