package laba1;

public class Main {
    public static void ain(String[] args) { //
        if (args.length == 0) {
            usage();
            return;
        }

        String command = args[0];

        switch (command) {
            case "FizzBuzz":
                FizzBuzz.run();
                break;

            case "TextTasks":
                if (args.length < 2) {
                    System.out.println("Ошибка");
                    return;
                }
                TextTasks.run(args[1]);
                break;

            case "QuadraticEquation":
                if (args.length < 4) {
                    System.out.println("Ошибка");
                    return;
                }
                QuadraticEquation.run(args[1], args[2], args[3], args);
                break;

            case "SeriesCalculator":
                SeriesCalculator.run();
                break;

            case "palindrome":
                if (args.length < 2) {
                    System.out.println("Ошибка");
                    return;
                }
                palindrome. run(args[1]);
                break;

            default:
                usage();
        }
    }

    private static void usage() {
        System.out.println("  FizzBuzz");
        System.out.println("  TextTasks <строка>");
        System.out.println("  QuadraticEquation <a> <b> <c>");
        System.out.println("SeriesCalculator");
        System.out.println("palindrome  <строка>");
    }
}
