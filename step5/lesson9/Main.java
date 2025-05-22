package step5.lesson9;

// 実行用クラス
public class Main {
    public static void main(String[] args) {
        Playable game = new Game();
        game.play();  // ゲームをプレイしています

        Playable music = new Music();
        music.play(); // 音楽を再生しています
    }
}
