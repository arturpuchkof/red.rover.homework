package hw7;
public class Salary {

    int getSum(Employee[] employeeArray){
        int result = 0;
        for (int i = 0; i < employeeArray.length; i++) {
            result += employeeArray[i].salary;
        }
        return result;
    } 
}
