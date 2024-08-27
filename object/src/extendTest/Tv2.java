package extendTest;

public class Tv2 {

    private String color;
    private int channel;
    private boolean power;

    public Tv2(String color, int channel, boolean power) {
        this.color = color;
        this.channel = channel;
        this.power = power;
    }

    void power() {
        this.power = !this.power;
    }

    void channelUp() {
        this.channel++;
    }

    void channelDown() {
        this.channel--;
    }

}
