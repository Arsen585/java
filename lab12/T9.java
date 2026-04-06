import java.util.Scanner;

public class T9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String result = text.replaceAll("[aeiouAEIOUәіөұүӘІӨҰҮ]", "*");
        System.out.println("Result: " + result);
    }
}