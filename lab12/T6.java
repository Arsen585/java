import java.util.Scanner;

public class T6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String symbol = sc.nextLine();

        if (text.endsWith(symbol)) {
            System.out.println("Ends with given symbol");
        } else {
            System.out.println("Does not end with given symbol");
        }
    }
}