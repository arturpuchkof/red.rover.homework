public class Hw3 {
    public static void main(String[] args) {
        int a = 48;
        int b = 23;
        int sum = a + b;
        int result = a/2;

        if ( a == b) {
            System.out.println("a == b");
        }
        if (a > b){
            System.out.println("a > b");
        }
        if (a < b){
            System.out.println("a < b");
        }
        if (sum % 2 == 0){
            System.out.println("maybe a and b are even");
        }
        if (sum % 2 != 0){
            System.out.println("some variable is odd");
        }
        if (a > 10){
            System.out.println("a > 10");
        }
        if (a < 100){
            System.out.println("a < 100");
        }
        if (result > 20){
            System.out.println("результат деления на 2 больше 20");
        }
        if ( a >= 5 && a <= 40){
            System.out.println("значение переменной между 5 и 40 включительно");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
