
public class  QuadraticEquation {
    public static void main(String[] args) {
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        double c = Double.parseDouble(args[3]);

        if (a == 0) {
            System.out.println("Ошибка: a не может быть равно 0");
        } else {
            double D = b * b - 4 * a * c;
            if (D > 0) {
            } else if (D == 0) {
            } else {
                System.out.println("Вещественных корней нет");
            }
        }
    }
}