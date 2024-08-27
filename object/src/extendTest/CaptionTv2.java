package extendTest;

public class CaptionTv2 extends Tv2 {

    private boolean caption;
    // Implicit super constructor Tv2() is undefined for default constructor. Must
    // define an explicit constructor
    // 묵시적(Implicit) / 명시적(explicit constructor)
    // 생성자 문제
    // 부모와 자식 둘다 명시적이거나 둘다 묵시적일 것

    // public CaptionTv2(){
    // super(null, 0, caption); //부모의 default 생성자 호출
    // } 생성자를 명시하지 않아 묵시적으로 생성되어 있는 디폴트 생성자

    // public CaptionTv2(String color, int channel, boolean power) {
    // super(color, channel, power);
    // }

    public CaptionTv2(String color, int channel, boolean power, boolean caption) {
        super(color, channel, power);
        this.caption = caption;
    }// 부모의 생성자와 내 생성자 초기화

    void displayCaption(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public boolean isCaption() {
        return caption;
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }

}
