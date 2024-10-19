import java.util.Scanner;

public class task_5_27g {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a, b;

        do {
            System.out.print("Введите значение а: ");
            a = scanner.nextInt();

            System.out.print("Введите значение b: ");
            b = scanner.nextInt();

            if (a > b) {
                System.out.println("Ошибка. Значение числа a больше значения b, Повторите попытку!");
            }

        } while (a > b);


        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += i;
        }

        System.out.println(String.format("Сумма чисел от a = %d до b = %d равна %d", a, b, sum));
    }
}
