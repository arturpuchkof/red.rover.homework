public class Hw4 {
    public static void main(String[] args) {
        for (int i = 0; i <= 15; i++){
            System.out.println(i);
        }
        System.out.println("===========================>");

        for (int i = 5; i < 10000; i = i*5) {
            System.out.println(i);
        }
        System.out.println("===========================>");

        for (int i = 40; i < 61; i++) {
            if (i % 4 == 0){
                System.out.println(i);
            }
        }
        System.out.println("===========================>");

        for (int i = 40; i < 61; i = i +4) {
            System.out.println(i);
        }

    }
}
