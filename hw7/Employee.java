package hw7;

public class Employee {
    String name;
    int age;
    String sex;
    int salary;
    int [] employeeArray = {};


    boolean isSameName(Employee employee){
        if(name.equals(employee.name)){
            return true;
        } else
            return false;
    }
}
