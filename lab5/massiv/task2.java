package massiv;
public class task2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 8, 9};

        int count = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                count++;
            }
        }

        System.out.println("Жұп элемент саны: " + count);
    }
}