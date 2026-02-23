import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();

        double f;
        if (x > 0 && x < 1)
            f = Math.sqrt(Math.pow(x, 3) + 4 + Math.cos(x));
        else
            f = 5 - 9 * Math.pow(Math.sin(x), 2);

        System.out.println("f(x) = " + f);
    }
}
