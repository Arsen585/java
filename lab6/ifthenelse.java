import java.util.Scanner;
public class ifthenelse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();

        double f;

        if (x > -2 && x < 5) {
            f = 5 * Math.pow(x, 2) + 6;
        } else if (x >= 5) {
            f = Math.pow(x, 3) + 7;
        } else {
            System.out.println("Берілген аралыққа кірмейді!");
            return;
        }

        System.out.println("f(x) = " + f);
    }
}



