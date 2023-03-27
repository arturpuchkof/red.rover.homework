package hw9;

public class Manager extends BaseManager {

    public Manager(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }

    public int getSalary(){
        if (getNumberOfSubordinates() == 0){
            return getBaseSalary();
        } else
            return getBaseSalary() * getNumberOfSubordinates();
    }
}
