package step5.lesson13;

public class Employee {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("給与は0以上の値を設定してください");
            this.salary = 0;
        }
    }

    public double getSalary() {
        return salary;
    }

    // setSalaryはパッケージプライベート（アクセス修飾子なし）
    // 同じパッケージのManagerクラスのみアクセス可能
    void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("給与は0以上の値を設定してください");
        }
    }

    public String getName() {
        return name;
    }
}

