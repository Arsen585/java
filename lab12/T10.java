import java.util.Scanner;

public class T10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        if (text.matches("[0-9]+")) {
            System.out.println("Only digits");
        } else {
            System.out.println("Not only digits");
        }
    }
}