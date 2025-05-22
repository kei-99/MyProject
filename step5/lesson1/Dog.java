package step5.lesson1;

public class Dog {
    // 属性（名前と年齢）はprivateにしてカプセル化
    private String name;
    private int age;

    // コンストラクタ（名前と年齢を設定）
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // 名前と年齢を表示するメソッド
    public void showInfo() {
        System.out.println("名前: " + name);
        System.out.println("年齢: " + age + "歳");
    }
}

