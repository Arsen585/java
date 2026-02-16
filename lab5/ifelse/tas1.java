package ifelse;

import java.util.Scanner;

public class tas1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("x енгізіңіз: ");
        double x = sc.nextDouble();

        double f;

        if (x > 0 && x < 1) {
            f = 3 * x + 4 + Math.cos(x);
        } else {
            f = 5 - Math.pow(Math.sin(x), 2);
        }

        System.out.println("f(x) = " + f);
    }
}