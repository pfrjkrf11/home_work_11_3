import java.util.Scanner;

public class task_297 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int countOfZero = 0;

        for (int i = 0; i < s.length(); i++) {
            char Char = s.charAt(i);
            int number = Char - '0';


            if (number == 9 || number == 0 || number == 6) {
                countOfZero++;
            } else if (number == 8) {
                countOfZero += 2;
            }


        }
        System.out.println(countOfZero);
    }
}