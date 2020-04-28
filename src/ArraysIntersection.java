import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntersection {

    public static void main(String[] args) {
        int[] number1 = {1, 3, 5, 7, 9};
        int[] number2 = {2, 4, 5, 7, 8};
        for (int i =0; i<number1.length; i++){
            for (int j=0; j<number2.length; j++){
                if (number1[i] == number2[j]){
                    System.out.println(number1[i]);
                }
            }
        }
    }
}
