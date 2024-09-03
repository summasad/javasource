package generics;

public class BoxEx {
    public static void main(String[] args) {
        Box box = new Box();

        box.setItems("홍길동"); // box.setItems(new String("홍길동")) 생략
        String str = (String) box.getItems();

        box.setItems(33); // 자동 형변환으로 new Integer 생략
        Integer i = (Integer) box.getItems();

        Box2<String> box2 = new Box2<>();
        box2.setItems(str);
        str = box2.getItems();

        Box2<Integer> box3 = new Box2<>();
    }
}
