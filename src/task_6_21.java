import java.util.Scanner;

public class task_6_21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введите число n: ");
        int n = scanner.nextInt();

        int first = 1;
        int second = 1;

        for (int i = 0; i < 100; i++) {
            System.out.print(first + " ");

            if (first > n) {
                System.out.println();
                System.out.println(String.format("%d больше %d", first, n));
                break;
            }

            int next = first + second;
            first = second;
            second = next;
        }
    }
}