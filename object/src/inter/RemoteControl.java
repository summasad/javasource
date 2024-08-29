package inter;

public interface RemoteControl {
    // public static final 생략되어 있는 상태
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();

    void turnOff();

    void setVolume(int volume);

    // 이 아래는 필수 아님
    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("무음처리");
        } else {
            System.out.println("무음해제");
        }
    }

    static void changeBattery() {
        System.out.println("건전지 교체");
    }

}
