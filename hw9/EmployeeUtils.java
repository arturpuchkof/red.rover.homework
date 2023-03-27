package hw9;

public class EmployeeUtils {

    public static int searchByName(String name, Employee[] array){
        for (int i = 0; i < array.length; i++) {
            if(name.equals(array[i].getName())){
                return i;
            }
        }
        return -1;
    }

    public static int searchByAnotherName(String anotherName, Employee[] array){
        for (int i = 0; i < array.length; i++) {
            if(array[i].getName().contains(anotherName)){
                return i;
            }

        }
        return -1;
    }

    public static int countSalary(Employee[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getBaseSalary();
        }
        return sum;
    }

    public static int maxSalary(Employee[] array){
        int maxArray = array[0].getBaseSalary();
        for (int i = 0; i < array.length; i++) {
            if (maxArray > array[i].getBaseSalary()) {
                maxArray = array[i].getBaseSalary();

            }
        }
        return maxArray;
    }

    public static int minSalary(Employee[] array){
        int minArray = array[0].getBaseSalary();
        for (int i = 0; i < array.length; i++) {
            if (minArray < array[i].getBaseSalary()) {
                minArray = array[i].getBaseSalary();

            }
        }
        return minArray;
    }

    public static int minNumberOfSubordinates(Manager[] array){
        int minArray = array[0].getNumberOfSubordinates();
        for (int i = 0; i < array.length; i++) {
            if (minArray < array[i].getNumberOfSubordinates()) {
                minArray = array[i].getNumberOfSubordinates();
            }
        }
        return minArray;
    }

    public static int maxNumberOfSubordinates(Manager[] array){
        int maxArray = array[0].getNumberOfSubordinates();
        for (int i = 0; i < array.length; i++) {
            if (maxArray < array[i].getNumberOfSubordinates()) {
                maxArray = array[i].getNumberOfSubordinates();
            }
        }
        return maxArray;
    }



}
