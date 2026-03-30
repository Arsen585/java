import java.util.Scanner;

public class tap2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Сан енгіз: ");
        double x = sc.nextDouble();

        if (x >= 0) {
            System.out.println("Нәтиже: " + Math.sqrt(x));
        } else {
            System.out.println("Қате! Теріс сан.");
        }
    }
}