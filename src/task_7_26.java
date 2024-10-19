import java.util.Random;

public class task_7_26 {
    public static void main(String[] args) {

        Random random = new Random();
        int temperature;
        int countColdDays = 0;

        for (int i = 1; i < 31 + 1; i++) {
            temperature = random.nextInt(-15, 20 + 1);
            System.out.print(temperature + " ");

            if (temperature < 0) {
                countColdDays++;
            }
        }
        System.out.println();
        System.out.print(countColdDays + " раз опускалась температура ниже нуля");
    }
}
