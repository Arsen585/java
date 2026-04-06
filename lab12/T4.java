import java.util.Scanner;

public class T4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        String noSpaces = text.replace(" ", "");
        System.out.println("Characters (without spaces): " + noSpaces.length());
    }
}