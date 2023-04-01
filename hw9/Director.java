package hw9;

public class Director extends BaseManager {

    public Director(String name, int baseSalary, int numberOfSubordinates) {
        super(name, baseSalary, numberOfSubordinates);
    }
    @Override
    public int getSalary(){
        if (getNumberOfSubordinates() == 0){
            return super.getSalary();
        } else
            return super.getSalary() * getNumberOfSubordinates();
    }
}
