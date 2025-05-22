package step5.lesson14;

public class Game {
    private int score;

    // コンストラクタで初期スコアを設定
    public Game(int initialScore) {
        setScore(initialScore);
    }

    // スコアを取得するメソッド
    public int getScore() {
        return score;
    }

    // スコアを設定するメソッド（バリデーションあり）
    public void setScore(int score) {
        if (score < 0) {
            System.out.println("エラー：スコアは0以上の値を設定してください。");
        } else {
            this.score = score;
        }
    }
}

