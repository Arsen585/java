import java.util.Random;
public class A7 {
    public static void main(String[] args) {

        Random rand = new Random();

        double[][] B = new double[5][5];
        double[] A = new double[5];

        System.out.println("B массиві:");

        for (int i = 0; i < 5; i++) {
            double sum = 0;
            for (int j = 0; j < 5; j++) {
                B[i][j] = -10 + 20 * rand.nextDouble(); // -10 мен 10 аралығы
                System.out.printf("%8.2f", B[i][j]);

                if (B[i][j] > 0) {
                    sum += B[i][j];
                }
            }
            A[i] = sum;
            System.out.println();
        }

        System.out.println("\nA массиві (қатар бойынша оң элементтер қосындысы):");
        for (int i = 0; i < 5; i++) {
            System.out.printf("%8.2f", A[i]);
        }
    }
}