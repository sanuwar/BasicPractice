import java.util.Scanner;

public class FizzBuzz {

    public static void main(String[] args) {
        System.out.println("N = ");
        int N = new Scanner (System.in).nextInt();

        for (int i =1; i <N; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+" FizzBuzz");
            }
            else if (i%3 == 0){
                System.out.println(i+ " Fizz");
            }
            else if(i%5 == 0){
                System.out.println(i+ " Buzz");
            }
            else System.out.println(i);
        }
    }
}
