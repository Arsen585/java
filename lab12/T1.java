import java.util.Scanner;

public class T1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiouәіөұү".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }
}