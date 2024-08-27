package extendTest;

public class Tv {

    // 캡션 기능이 추가된 Tv 클래스 요구될 때
    // 1) CaptionTv 새롭게 정의: Tv+caption
    // 2) Tv가 이미 있으니 Tv 상속 + 추가된 기능 정의

    private String color;
    private int channel;
    private boolean power;

    void power() {
        this.power = !this.power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getChannel() {
        return channel;
    }

    public void setChannel(int channel) {
        if (channel < 0 || channel > 100) {
            return;
        }
        this.channel = channel;
    }

    public boolean isPower() {
        // boolean 타입인 경우는 get을 붙이지 않고 is 사용
        return power;
    }

}
