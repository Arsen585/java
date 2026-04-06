import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = text.replaceAll("[0-9]", "");
        System.out.println("Result: " + result);
    }
}