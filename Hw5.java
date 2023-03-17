public class Hw5 {
    public static void main(String[] args) {

       int rows = 9;

        for (int i = rows; i >= 0 ; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        System.out.println("==============================>");

        for (int i = rows; i >= 0 ; --i) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("==============================>");

        for (int i = rows; i >= 0 ; --i) {
            for (int j = rows; j > i; j--) {
                System.out.print("  ");
            }
            for (int j = i; j >= 0 ; j--) {
                System.out.print(j + " ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        }

    }




