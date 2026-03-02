public class A5 {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = Math.random()*10;
            sum += D[i];
        }
        System.out.println("Орта мән = " + sum/17);
    }
}