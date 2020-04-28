import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        boolean prime;
        //int n;
        //int i = 2;
        for (int n = 2; n <= 100; n++) {
            prime = true;
            int i = 2;
            while (i < n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime)
                System.out.print(n + " ");
        }



    }
}