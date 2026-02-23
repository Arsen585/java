import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();

        double f;

        if (x>=0){
            f=Math.sqrt(Math.pow(x,3))+5;
        } else if (x>-3 && x<0){
            f = 3 * Math.pow(x,4) +9;
        }else{
            System.out.println("Берілген аралыққа кірмейді!");
            return;
        }
        System.out.println("f(x) = " + f);
    }
}
