import java.util.Scanner;

public class tap10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Өрнек енгіз (2 + 3 * 4): ");
        String expr = sc.nextLine();

        String[] parts = expr.split(" ");
        double result = Double.parseDouble(parts[0]);

        for (int i = 1; i < parts.length; i += 2) {
            String op = parts[i];
            double num = Double.parseDouble(parts[i + 1]);

            switch (op) {
                case "+": result += num; break;
                case "-": result -= num; break;
                case "*": result *= num; break;
                case "/": result /= num; break;
            }
        }

        System.out.println("Нәтиже: " + result);
    }
}