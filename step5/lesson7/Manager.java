package step5.lesson7;

// ManagerクラスはEmployeeを継承し、showTitleをオーバーライド
public class Manager extends Employee {
    @Override
    public void showTitle() {
        System.out.println("役職: マネージャー");
    }
}
