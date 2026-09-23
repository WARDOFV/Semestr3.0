package laba1;

import java.util.Scanner;



public class TextTasks {
    public static void run(String input) {
        System.out.println("Обработка строки: " + input);
        Scanner s = new Scanner(System.in);
        System.out.println("vvedite chto nibyd");
        String string= s.nextLine();
        String result = "";
        for(int i = string.length()-1; i>=0; i--) {
            result += string.charAt(i);
        }
        System.out.println(result);


    }
}
