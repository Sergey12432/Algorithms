import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial *= i;
        }

        System.out.println(factorial);
    }
}
