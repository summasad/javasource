package shop;

public abstract class Product {
    private String pName;
    private int price;

    public Product(String pName, int price) {
        this.pName = pName;
        this.price = price;
    }

    void printDetail() {
        System.out.println("제품명 : " + pName);
        System.out.println("제품가격 : " + price);
        printExtra();
    }

    // 제품에 따라서 추가정보 출력을 하고 싶을 때
    // 하위 클래스에서 상속받아 활용
    abstract void printExtra();

    public int getPrice() {
        return price;
    }

    public String getpName() {
        return pName;
    }
}
