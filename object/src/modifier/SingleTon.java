package modifier;

public class SingleTon {

    // 디폴트 이용해서 자기 자신 인스턴스 생성
    // private이라 외부 이용안됨
    private static SingleTon singleTon = new SingleTon();

    private SingleTon() {
    }

    public static SingleTon getInstance() {
        return singleTon;
    }
}
