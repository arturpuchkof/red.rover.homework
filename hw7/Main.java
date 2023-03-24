package hw7;

public class Main {
    public static void main(String[] args) {

        Person personMen = new Person();
        personMen.name = "Jack";
        personMen.sex = "men";

        Person personWomen = new Person();
        personWomen.name = "Jassika";

        Employee employeeMen = new Employee();
        employeeMen.name = "Jack";
        employeeMen.age = 32;
        employeeMen.salary = 33000;

        Employee employeeMen2 = new Employee();
        employeeMen2.name = "John";
        employeeMen2.salary = 2000;



        System.out.println(personMen.getName());
        System.out.println(personWomen.getName());
        System.out.println(employeeMen.isSameName(employeeMen));
        System.out.println();

    }
}
