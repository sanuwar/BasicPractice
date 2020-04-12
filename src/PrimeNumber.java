public class PrimeNumber {

    public static void main(String[] args) {
        boolean prime;
        int n;
        int i;

        for (n = 1; n<=100; n++){
            prime = true;
            i =2;
            while (i<=n/2){
                if (n%i == 0){
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime){
                System.out.println(n);
        }

        }
    }
}
