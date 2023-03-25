package hw8_2;

public class Director extends BaseManager {

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalaryDirector(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else
            return getBaseSalary() * getNumberOfSubordinates();
    }
}
