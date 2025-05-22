package step5.lesson12;

public class BankAccount {
    // 残高をprivateで管理
    private double balance = 0;

    // 入金メソッド
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("入金額は1円以上にしてください。");
        } else {
            balance += amount;
            System.out.println((int)amount + "円を入金しました。");
        }
    }

    // 出金メソッド
    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) {
            System.out.println("出金は1円以上で、残高以内で行ってください。");
        } else {
            balance -= amount;
            System.out.println((int)amount + "円を出金しました。");
        }
    }

    // 現在の残高表示メソッド
    public void showBalance() {
        System.out.println("現在の残高: " + (int)balance + "円");
    }
}

