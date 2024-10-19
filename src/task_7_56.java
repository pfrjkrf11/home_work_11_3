import java.util.Scanner;

public class task_7_56 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество городов:");
        int countOfCities = scanner.nextInt();
        scanner.nextLine();

        int maxDistance = 0;

        String[] cities = new String[countOfCities];
        int[] distance = new int[countOfCities];

        for (int i = 0; i < cities.length; i++) {
            System.out.print(String.format("Введите %d город: ", i + 1));
            cities[i] = scanner.nextLine();
        }

        for (int i = 0; i < distance.length; i++) {
            System.out.print(String.format("Введите расстояние от %d города до Москвы: ", i + 1));
            distance[i] = scanner.nextInt();
        }

        int index = 0;

        for (int i = 0; i < distance.length; i++) {
            if (distance[i] > maxDistance) {
                maxDistance = distance[i];
                index = i;
            }
        }

        System.out.println(String.format("%s является самым удаленным городом от Москвы", cities[index]));


    }
}
