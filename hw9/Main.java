package hw9;

import static hw9.EmployeeUtils.searchByName;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Kolya", 1000);
        BaseManager baseManager = new BaseManager("Myta", 1000, 10);
        Manager manager = new Manager("Vasa", 1000, 10);
        Director director = new Director("Dan", 1000, 10);

        System.out.println(employee.getSalary());
        System.out.println("Зарплата менеджера " + manager.getSalary());
        System.out.println("Зарплата директора " + director.getSalary());
        Employee[] employees = {manager, director, employee, baseManager};

        EmployeeUtils searchByName = new EmployeeUtils();

        System.out.println(searchByName("Myta", employees));



    }
}
