import java.util.Scanner;
public class task9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();

        double f;

        if (x >= 0 && x < 1)
            f = x * Math.pow(Math.cos(x), 2) + Math.sin(x);
        else if (x >= 1 && x <= 2)
            f = Math.cbrt(x * x + 6 * Math.sin(x));
        else if (x > 2)
            f = 1.7 * Math.pow(x, 3) + 7;
        else {
            System.out.println("Берілген аралыққа кірмейді");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}