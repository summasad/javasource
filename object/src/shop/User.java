package shop;

public class User {
    // 이름, 지불방법(CASH, CARD)
    private String name;

    private PayType payType; // 입력값 제한하기 위해 enum PayType 타입

    public User(String name, PayType payType) {
        this.name = name;
        this.payType = payType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PayType getPayType() {
        return payType;
    }

    public void setPayType(PayType payType) {
        this.payType = payType;
    }

}
