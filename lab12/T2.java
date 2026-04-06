import java.util.Scanner;

public class T2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = text.replace(" ", "");
        System.out.println("Result: " + result);
    }
}