package step5.lesson9;

// GameクラスはPlayableを実装
public class Game implements Playable {
    @Override
    public void play() {
        System.out.println("ゲームをプレイしています");
    }
}
