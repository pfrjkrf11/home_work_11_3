import java.util.Scanner;

public class task_233 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //ACCEPTED//

        int countOfbrigde = scanner.nextInt();
        int[] heightOfBridge = new int[countOfbrigde];
        int heightOfBus = 437;
        int countOfCrashes = 0;

        for (int i = 0; i < heightOfBridge.length; i++) {
            heightOfBridge[i] = scanner.nextInt();
        }

        for (int i = 0; i < heightOfBridge.length; i++) {
            if (heightOfBridge[i] <= heightOfBus) {
                System.out.println(String.format("Crash %d", i + 1));
                countOfCrashes++;
                break;
            }
        }

        if (countOfCrashes == 0) {
            System.out.println("No crash");
        }


    }
}
