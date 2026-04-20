import java.util.Scanner;

public class EvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, count = 0;

        System.out.print("Сан енгізіңіз: ");
        number = sc.nextInt();

        do {
            int digit = number % 10;
            if (digit % 2 == 0) {
                count++;
            }
            number /= 10;
        } while (number > 0);

        System.out.println("Жұп цифрлар саны: " + count);
    }
}