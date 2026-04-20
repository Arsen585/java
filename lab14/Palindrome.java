import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, original, reversed = 0;

        System.out.print("Сан енгізіңіз: ");
        number = sc.nextInt();
        original = number;

        do {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        } while (number > 0);

        if (original == reversed) {
            System.out.println("Палиндром");
        } else {
            System.out.println("Палиндром емес");
        }
    }
}