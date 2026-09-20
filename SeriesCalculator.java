
public class  SeriesCalculator {
    public static void main(String[] args) {
        double sum = 0;
        int n= 2;
        int count=0;
        int LastN=2;
        while(true){
            double ryda = 1.0 / (n * n + n - 2);

            if (Math.abs(ryda)<1e-6){
                break;
            }
            sum += ryda;
            LastN = n;      // Запоминаем последний добавленный n
            count++;        // Увеличиваем счетчик
            n++;            // Переходим к следующему n
        }

        System.out.println(sum);
        System.out.println(LastN);
        System.out.println(count);
    }
}