import java.util.Scanner;

public class tap8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble(); // сан
        double b = sc.nextDouble(); // пайыз

        double result = (a * b) / 100;

        System.out.println("Нәтиже: " + result);
    }
}