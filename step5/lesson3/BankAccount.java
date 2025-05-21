package step5.lesson3;

public class BankAccount {
    private int balance; // 残高を管理するフィールド

    // コンストラクタ：残高を0円に初期化
    public BankAccount() {
        this.balance = 0;
    }

    // 預け入れメソッド
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("預け入れ金額は1円以上にしてください。");
        } else {
            balance += amount;
            System.out.println(amount + "円を預け入れました。");
        }
    }

    // 引き出しメソッド
    public void withdraw(int amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("引き出しは1円以上で、残高以内で行ってください。");
        } else {
            balance -= amount;
            System.out.println(amount + "円を引き出しました。");
        }
    }

    // 残高表示メソッド
    public void showBalance() {
        System.out.println("現在の残高: " + balance + "円");
    }
}
