import java.util.*;

public class tap4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            double a = sc.nextDouble();
            double b = sc.nextDouble();

            System.out.println("Қосу: " + (a + b));

        } catch (InputMismatchException e) {
            System.out.println("Қате! Сан енгізу керек!");
        }
    }
}