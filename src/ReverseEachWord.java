import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
//       String name = "JAVA PRACTICE";
//       String[] splittedWords = name.split(" ");
//
//       for(int i = 0; i <=splittedWords.length-1; i++){
//           char[] splittedLetters = splittedWords[i].toCharArray();
//           for (int j = splittedLetters.length-1; j >=0; j--){
//               System.out.print(splittedLetters[j]);
//           }
//       }System.out.println(" ");


        String name  ="java test";
        String [] splittedName  =name.split(" ");

        for (int i = 0; i <=splittedName.length-1; i++){
            char[] charredLetters = splittedName[i].toCharArray();

            for (int j = charredLetters.length-1; j>=0; j--){
                System.out.print(charredLetters[j]);
            }
            System.out.print(" ");
        }
    }
}
