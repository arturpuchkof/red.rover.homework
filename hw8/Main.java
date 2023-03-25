package hw8;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setName("Artur");
        employee.setAge(32);
        employee.setSex("male");
        employee.setSalary(1000);

        System.out.println(employee.getSalary(30));

        Manager manager = new Manager();
        manager.setName("Vasya");
        manager.setAge(33);
        manager.setSex("male");
        manager.setSalary(2000);
        manager.setCountEmployee(5);

        System.out.println(manager.getSalary(10));

    }
}
