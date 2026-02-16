import java.util.Scanner;

public class for1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        if (num > 0) {
            System.out.println("Оң сан");
        } else if (num < 0) {
            System.out.println("Теріс сан");
        } else {
            System.out.println("Сан нөлге тең");
        }
    }
}
