package generics;

// 지네릭 클래스로 변경

public class Box2<T> {
    T items;

    public T getItems() {
        return items;
    }

    public void setItems(T items) {
        this.items = items;
    }

}
