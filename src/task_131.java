import java.util.Scanner;

public class task_131 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int countOfTenants = scanner.nextInt();

        int theOledest = 0;
        int k = 0;

        for (int i = 0; i < countOfTenants; i++) {
            int age = scanner.nextInt();
            int sex = scanner.nextInt();

            if (age > theOledest && sex == 1) {
                theOledest = age;
                k = i + 1;
            }
            if (k == 0) {
                k = -1;
            }

        }
        System.out.println(k);
    }
}