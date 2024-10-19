public class task_5_8 {
    public static void main(String[] args) {

        for (int i = 1; i < 11; i++) {
            if (i >= 2 && i <= 4) {
                System.out.println(String.format("%d фунта = %.3f кг", i, i * 0.453f));
            } else if (i > 4 && i < 11) {
                System.out.println(String.format("%d фунтов = %.3f кг", i, i * 0.453f));
            } else {
                System.out.println(String.format("%d фунт = %.3f кг", i, i * 0.453f));
            }


        }
    }
}
