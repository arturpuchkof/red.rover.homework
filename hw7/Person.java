package hw7;

public class Person {

     String name;
    int age;
    String sex;

    String getName(){
        if (sex == "men"){
           return "Mr " + name;
        }else
           return "Mrs " + name;

    }

}
