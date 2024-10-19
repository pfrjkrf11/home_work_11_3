import java.util.Scanner;

public class task_43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int maxLenth = 0;
        int currentLenth = 0;
        int countOfZero = 0;

        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            if (digit == 0) {
                currentLenth++;
            } else {
                currentLenth = 0;
            }
            if (currentLenth > maxLenth) {
                maxLenth = currentLenth;
            }


        }
        System.out.println(maxLenth);
    }
}