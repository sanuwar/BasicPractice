import java.util.Arrays;

public class ArraysIntersection2 {
    public static void main(String[] args) {
        int[] number1 = {1, 3, 5, 7, 9, 11};
        int number2[] = {2, 4, 3, 1, 5, 11, 3};

        Arrays.sort(number1);
        Arrays.sort(number2);
        int i = 0;
        int j = 0;
        while (i < number1.length && j < number2.length) {
            if (number1[i] == number2[j]) {
                System.out.println(number1[i]);
                i++;
                j++;
            }

            else if (number1[i]> number2[j]){
                j++;
            }
            else i++;
        }
    }
}
