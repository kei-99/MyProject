package step5.lesson14;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(10);

        // 初期スコアの表示
        System.out.println("初期スコア: " + game.getScore());

        // スコアを25に更新
        game.setScore(25);
        System.out.println("更新後スコア: " + game.getScore());

        // マイナス値を設定（エラーになる）
        game.setScore(-5);
        System.out.println("再度スコア: " + game.getScore());
    }
}
