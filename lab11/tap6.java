import java.util.*;

public class tap6 {
    public static void main(String[] args) {
        ArrayList<String> history = new ArrayList<>();

        double a = 5, b = 3;
        double res = a + b;

        String record = a + " + " + b + " = " + res;
        history.add(record);

        for (String h : history) {
            System.out.println(h);
        }
    }
}