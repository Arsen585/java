import java.util.Scanner;

public class MaxDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, max = 0;

        System.out.print("Сан енгізіңіз: ");
        number = sc.nextInt();

        do {
            int digit = number % 10;
            if (digit > max) {
                max = digit;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Ең үлкен цифр: " + max);
    }
}