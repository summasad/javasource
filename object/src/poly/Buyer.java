package poly;

public class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    // Air 구입과 computer 구입 에서 코드 반복 = > 부모 메소드 이용해서 줄임. 다형성.
    // 구입한 제품을 저장하기 위한 배열
    // Computer computers[] = new Computer[3];
    // Air airs[] = new Air[3];
    // 장바구니는 여러 물건 담음. 부모 배열 이용
    Product products[] = new Product[10];
    int i = 0;

    // Product p = new Computer();
    // Product p = new Air();
    void buy(Product p) {
        // money 보다 물건 가격이 적은지 확인
        if (money < p.price) {
            System.out.println("잔액 부족으로 물건 구입 불가");
            return;
        }
        // money = money - 물건가격
        money -= p.price;
        // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
        bonusPoint += p.bonusPoint;
        products[i++] = p; // 장바구니에 담기
        System.out.println(p + "을/를 구입하셨습니다.");
    }

    void summary() {
        // 구매한 물품에 대한 정보 출력
        int sum = 0;
        String itemList = "";

        for (Product product : products) {
            if (product != null) {
                sum += product.price;
                itemList += product + ", ";
                // toString 하지않아면 주소값이 나와야하지만 여기서 product는 computer, air
                // 자식 클래스에 toString 해놨음, 값 출력
            }
        }

        // 구입한 물품의 총 금액은 ~~ 만원입니다.
        System.out.printf("구입한 물품의 총 금액은 %d 만원입니다.\n", sum);
        // 구입한 제품은 Computer, Air 입니다.
        System.out.printf("구입한 제품은 %s 입니다.\n", itemList);
    }

    // void buy(Air air) {
    // // money 보다 물건 가격이 적은지 확인
    // if (money < air.price) {
    // System.out.println("잔액 부족으로 물건 구입 불가");
    // return;
    // }
    // // money = money - 물건가격
    // money -= air.price;
    // // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
    // bonusPoint += air.bonusPoint;
    // System.out.println(air + "을/를 구입하셨습니다.");

    // }

    // void buy(Computer computer) {
    // // money 보다 물건 가격이 적은지 확인
    // if (money < computer.price) {
    // System.out.println("잔액 부족으로 물건 구입 불가");
    // return;
    // }
    // // money = money - 물건가격
    // money -= computer.price;
    // // 보너스포인트 = 보너스포인트 + 구입가격에 따른 포인트
    // bonusPoint += computer.bonusPoint;
    // System.out.println(computer + "을/를 구입하셨습니다.");
    // }
}
