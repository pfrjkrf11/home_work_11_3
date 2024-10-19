import java.util.Scanner;

public class task_264 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countDays = scanner.nextInt();
        int warmDays = 0;

        int maxLenTemp = 0;

        for (int i = 0; i < countDays; i++) {
            int temperature = scanner.nextInt();

            if (temperature > 0) {
                warmDays++;
            } else {
                warmDays = 0;
            }

            if (warmDays > maxLenTemp) {
                maxLenTemp = warmDays;
            }

        }
        System.out.println(maxLenTemp);

    }
}