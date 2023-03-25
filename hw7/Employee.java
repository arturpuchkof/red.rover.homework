package hw7;

public class Employee {
    String name;
    int age;
    String sex;
    int salary;
    int [] employeeArray = {};


    boolean isSameName(Employee employee){
       return name.equals(employee.name);

    }
}
