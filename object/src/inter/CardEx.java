package inter;

public class CardEx {
    public static void main(String[] args) {
        // 인터페이스 인스턴스 생성 불가
        // PlayingCard playingCard = new PlayingCard();
        PlayingCard playingCard = new Card();
        // 반드시 자식으로 new, 다형성 개념으로 만 가능
    }
}
