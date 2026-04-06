import java.util.Scanner;

public class T5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String word = sc.nextLine();

        if (text.startsWith(word)) {
            System.out.println("Starts with given word");
        } else {
            System.out.println("Does not start with given word");
        }
    }
}
