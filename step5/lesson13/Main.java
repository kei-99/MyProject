package step5.lesson13;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("タロウ", 300000);
        Manager manager = new Manager();

        System.out.println("現在の給与: " + employee.getSalary() + "円");

        manager.updateSalary(employee, 350000);

        System.out.println("変更後の給与: " + employee.getSalary() + "円");
    }
}
