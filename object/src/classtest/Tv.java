package classtest;

public class Tv {
    // 채널 : 번호
    // 전원상태 : true(on) , false(off)
    // 제조사 : 삼성, lg
    // 속성=>변수

    private int channel;
    private boolean power;
    private String company;

    // 생성자
    // 클래스 이름과 동일하게
    // 클래스 이름(){}
    // 생성자 오버로딩(하나의 클래스에 생성자 여러개 만든 것)(같은 모양 생성자 중복 안됨)

    Tv() {
        // 디폴트 생성자. 괄호 안에 아무것도 없는것
    }

    Tv(int channel, boolean power, String company) {
        this.channel = channel;
        this.power = power;
        this.company = company;
    }// 괄호안은 변수와 이름 같지만 기능 다름
     // this.xx -> 변수 의미

    // 동작
    // 전원을 켠다/ 끈다
    // 채널 올린다/ 내린다

    void power() {
        this.power = !this.power;
        // power = !power;
    }

    void channelUp() {
        this.channel++;
        // channel++;

    }

    void channelDown() {
        this.channel--;
        // channel--;
    }

    // get 로 시작하는 메소드는 getter 메소드
    // set 로 시작하는 메소드는 setter 메소드

    public int getChannel() {
        // return => channel 값을 보내겠다는 의미
        return channel;
    }

    public String getCompany() {
        return company;
    }

    public boolean isPower() {
        return power;
    }

}
