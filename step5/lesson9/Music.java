package step5.lesson9;

// MusicクラスはPlayableを実装
public class Music implements Playable {
    @Override
    public void play() {
        System.out.println("音楽を再生しています");
    }
}
