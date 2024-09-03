package generics;

public class Box {
    Object items; // 예전 개발 - 다양한 타입 받을때 부모 Object 타입 선언
                  // 가져가서 계속 형변환

    public Object getItems() {
        return items;
    }

    public void setItems(Object items) {
        this.items = items;
    }

}
