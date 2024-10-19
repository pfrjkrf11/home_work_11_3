import java.util.Scanner;

public class task_263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int startStation = scanner.nextInt();
        int finishStation = scanner.nextInt();

        int stationsPryamo = (finishStation - startStation - 1 + n) % n;
        int stationsObratno = (startStation - finishStation - 1 + n) % n;

        if (stationsPryamo > stationsObratno) {
            System.out.println(stationsObratno);
        } else {
            System.out.println(stationsPryamo);
        }

    }
}