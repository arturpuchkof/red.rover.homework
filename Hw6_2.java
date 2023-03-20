public class Hw6_2 {
    public static <Char> void main(String[] args) {
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.println(s.charAt(i));
            }
        }

        System.out.println("====================================");

        String s2 = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == 'е'){
                count++;
            }
        }System.out.println(count);

        System.out.println("====================================");

        String s3 = "Посмотрите как Рите нравиться ритм";
        s3 = s3.toLowerCase();
        int index = s3.indexOf("рит");
        for (int i = 0; i < s3.length(); i++) {
            System.out.println(index);
            index = s3.indexOf("е", index + 1);
            if(index == -1){
                break;
            }

       }
        System.out.println("====================================");

        String [][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования", "java"}};
        int count4 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (!array[i][j].contains("е")){
                    count4++;
                }

            }
        }
        System.out.println(count4);
    }

}




