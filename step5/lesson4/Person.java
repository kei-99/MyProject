package  step5.lesson4;

public class Person {
    private int age; // 年齢を表すフィールド

    // コンストラクタで年齢を設定（エラーチェック付き）
    public Person(int age) {
        if (age < 0) {
            System.out.println("年齢は0以上を指定してください。");
            this.age = 0; // 不正な年齢だった場合は0に設定
        } else {
            this.age = age;
        }
    }

    // 年齢を表示するメソッド
    public void showAge() {
        System.out.println("この人の年齢は" + age + "歳です。");
    }
}
