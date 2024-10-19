public class task_8_3_d {
    public static void main(String[] args) {

        int startNumer = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println();

            startNumer += 5;
            for (int j = i; j < 5; j++) {
                if (startNumer < 10) {
                    System.out.print(startNumer + "  ");
                } else
                    System.out.print(startNumer + " ");


            }
        }
    }
}