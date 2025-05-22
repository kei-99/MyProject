package step5.lesson7;

// EngineerクラスはEmployeeを継承し、showTitleをオーバーライド
public class Engineer extends Employee {
    @Override
    public void showTitle() {
        System.out.println("役職: エンジニア");
    }
}
