import java.util.Scanner;

public class task_81 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //ACCEPTED//

        int watermellons = scanner.nextInt();
        int currentWeight;
        Integer maxWeight = null;
        Integer minWeight = null;
        int k = 0;

        for (int i = 0; i < watermellons; i++) {
            currentWeight = scanner.nextInt();


            if (maxWeight == null || currentWeight > maxWeight) {
                maxWeight = currentWeight;
            }
            if (minWeight == null || currentWeight < minWeight) {
                minWeight = currentWeight;
            }
        }
        System.out.println(minWeight + " " + maxWeight);
    }
}