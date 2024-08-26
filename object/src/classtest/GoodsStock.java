package classtest;

//상품재고 관리 클래스
public class GoodsStock {
    // 속성
    private String goodsCode; // 상품코드(goodsCode) : P1015
    private int stockNum; // 재고수량(stockNum) : 100

    // 생성자
    public GoodsStock(String goodsCode, int stockNum) {
        this.goodsCode = goodsCode;
        this.stockNum = stockNum;
    }

    // 기능
    // 재고추가(addStock) / 재고감소(subStock)
    void addStock(int num) { // 재고추가 후 리턴 안 할시
        stockNum += num;
    }

    int subStock(int num) { // 재고감소 후 재고현황 리턴하고 싶을 시
                            // 리턴할 자리 만들어줘야함

        stockNum -= num;
        return stockNum;
    }

    // 상품코드 반환 메소드
    public String getGoodsCode() {
        return goodsCode;
    }

    // 재고 수량 반환 메소드
    public int getStockNum() {
        return stockNum;
    }

}
