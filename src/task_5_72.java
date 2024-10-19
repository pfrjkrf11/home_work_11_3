public class task_5_72 {
    public static void main(String[] args) {

        double distance = 10;

        double sumOfDistance = 0;

        for (int i = 1; i < 11; i++) {
            System.out.println(String.format("За %d день лыжник пробежал %.3f км", i, distance));

            sumOfDistance += distance;
            distance *= 1.1f;
        }
        System.out.println();

        System.out.println(String.format("Лыжник пробежал суммарно %.3f км", sumOfDistance));
    }
}
