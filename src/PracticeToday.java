import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PracticeToday {
    public static void main(String[] args) {
        //int [] number = new int[5];
        int[] number2 = {1, 10, 14, 10, 14, 40, 35, 40, 1};
   Arrays.sort(number2);
        for (int i = 0; i <number2.length; i++) {
            for (int j = i + 1; j < number2.length; j++) {
                if (number2[j] == number2[i]) {
                    System.out.println(number2[j]);
                }
            }
        }
//        number[0]= 1;
//        number[1]=10;
//        number[2]= 14;
//        number [3] = 11;
//        number [4]= 40;
//        for (int i = 0; i<= number2.length-1; i++) {
//            if (number2[i] % 2 == 0 && number2[i] <= 39) {
//                System.out.println((number2[i]));
//            }
//        }
//        ArrayList<String> number1 = new ArrayList<String>();
//        number1.add("geek");
//        number1.add("for");
//        number1.add("geeks");
//        System.out.println(number1);


    }
}

