package if1;
import java.util.Scanner;
public class for2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Сан енгізіңіз: ");
        int num = sc.nextInt();

        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Сан 3-ке және 5-ке бөлінеді");
        } else
            System.out.println("Сан 3-ке және 5-ке бөлінбейді");

    }
}