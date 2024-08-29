package shop;

public class SmartTv extends Product {

    // 해상도(resolution)
    private String resolution;

    public SmartTv(String pName, int price, String resolution) {
        super(pName, price);
        this.resolution = resolution;
    }

    @Override
    void printExtra() {
        System.out.println("해상도 : " + resolution);
        // 해상도 출력
    }

}
