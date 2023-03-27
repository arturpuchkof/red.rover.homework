package hw9;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Kolya", 1000);
        BaseManager baseManager = new BaseManager("Myta", 1000, 10);
        Manager manager = new Manager("Vasa", 1000, 10);
        Director director = new Director("Dan", 1000, 10);

        System.out.println(employee.getBaseSalary());
        System.out.println("Зарплата менеджера " + manager.getSalary());
        System.out.println("Зарплата директора " + director.getSalary());



    }
}
