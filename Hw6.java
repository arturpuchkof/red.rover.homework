public class Hw6 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
        int[][] array2 = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int result = array[0];
        int max = array2[0][0];
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        int middle = 0;

        for (int i = 0; i < array.length; i++) {
            sum1 += array[i];
        }
        System.out.println("сумма всех значений массива " + sum1);
        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array.length; i++) {
            if ( result > array[i]){
                result = array[i];
            }
        }
        System.out.println("min value " + result);
        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array.length; i++) {
            if ( result < array[i]){
                result = array[i];
            }
        }
        System.out.println("max value " + result);
        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array.length; i++) {
            sum2 += array[i];
            middle = sum2 / array.length;
        }
        System.out.println("среднее арифметическое " + middle);
        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum3 += array2[i][j];
            }

        }
        System.out.println("сумма всех значений массива " + sum3);
        System.out.println("++++++++++++++++++++++++++++++++++");

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                if(max < array2[i][j]){
                    max = array2[i][j];
                }
            }
        }
        System.out.println("max value " + max);





    }


}
